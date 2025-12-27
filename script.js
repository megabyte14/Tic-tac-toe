let board = [
    [0,0,0],
    [0,0,0],
    [0,0,0]
];
let currentPlayer = 1; // 1 = player, 2 = computer
let gameOver = false;

const status = document.getElementById('status');
const buttons = document.querySelectorAll('#board button');
const resetBtn = document.getElementById('reset');

function checkWinner() {
    for(let i=0;i<3;i++){
        if(board[i][0] && board[i][0]===board[i][1] && board[i][1]===board[i][2]) return board[i][0];
        if(board[0][i] && board[0][i]===board[1][i] && board[1][i]===board[2][i]) return board[0][i];
    }
    if(board[0][0] && board[0][0]===board[1][1] && board[1][1]===board[2][2]) return board[0][0];
    if(board[0][2] && board[0][2]===board[1][1] && board[1][1]===board[2][0]) return board[0][2];
    if(board.flat().every(cell=>cell!==0)) return -1;
    return 0;
}

function computerMove() {
    if(gameOver) return;
    let empty = [];
    for(let r=0;r<3;r++){
        for(let c=0;c<3;c++){
            if(board[r][c]===0) empty.push([r,c]);
        }
    }
    if(empty.length===0) return;
    let [row,col] = empty[Math.floor(Math.random()*empty.length)];
    board[row][col] = 2;
    document.querySelector(`button[data-row='${row}'][data-col='${col}']`).textContent = 'O';

    let winner = checkWinner();
    if(winner===2) { status.textContent = "Computer wins!"; gameOver=true; return; }
    if(winner===-1) { status.textContent = "It's a tie!"; gameOver=true; return; }

    currentPlayer = 1;
    status.textContent = "Player 1's turn";
}

buttons.forEach(btn=>{
    btn.addEventListener('click', ()=>{
        if(gameOver || currentPlayer!==1) return;

        let row = parseInt(btn.dataset.row);
        let col = parseInt(btn.dataset.col);
        if(board[row][col]!==0) return;

        board[row][col]=1;
        btn.textContent='X';

        let winner = checkWinner();
        if(winner===1){ status.textContent="Player wins!"; gameOver=true; return; }
        if(winner===-1){ status.textContent="It's a tie!"; gameOver=true; return; }

        currentPlayer=2;
        status.textContent="Computer's turn";
        setTimeout(computerMove, 500); // small delay for effect
    });
});

resetBtn.addEventListener('click', ()=>{
    board = [[0,0,0],[0,0,0],[0,0,0]];
    buttons.forEach(btn=>btn.textContent='');
    currentPlayer=1;
    gameOver=false;
    status.textContent="Player 1's turn";
});
