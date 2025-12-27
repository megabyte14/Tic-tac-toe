/*
import java.util.Random;

import java.util.Scanner;

class Main

{
    static int i,j,x,y,a,b;
    static Random ran=new Random();
    static char[][] board=new char[3][3];
    public static void printBoard(char[][] board)
    {
        for(i=0;i<3;i++)
        {
            for (j = 0; j < 3; j++)
            {
                System.out.println(board[i][j]);

            }
        }
    }
public static boolean draw(char[][]board)
{
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            if (board[i][j] == ' ') {
                return false;
            }

        }
    }
    return true;
}
    public static void main(String[] args)
    {
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            {
                board[i][j]=' ';
            }

        boolean boardState=false;
        Scanner p1 = new Scanner(System.in);
        while(boardState==false)
        {
            do
            {
                System.out.println("Player 1's turn!");
                System.out.println("Enter coordinates of your desired move:");
                x = p1.nextInt();
                y = p1.nextInt();

                if (board[x][y] != ' ')
                {
                    System.out.println("Invalid move!");
                }
            }
            while(board[x][y] != ' ');
            board[x][y]='X';
            for(i=0;i<3;i++)
            {
                if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                {
                    System.out.println("Player wins!");
                    boardState=true;
                    break;
                }
            }
            for(j=0;j<3;j++)
            {
                if(board[0][j] != ' ' && board[0][j]==board[1][j] && board[1][j] == board[2][j])
                {
                    System.out.println("Player wins!");
                    boardState=true;
                    break;
                }
            }
            if(board[0][0] != ' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2])
            {
                System.out.println("Player wins!");
                boardState=true;
                break;
            }
            if(board[0][2] != ' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0])
            {
                System.out.println("Player wins!");
                boardState=true;
                break;
            }
            if (draw(board))
            {
                System.out.println("It's a draw!");
                boardState=true;
                break;
            }


            System.out.println("Computer is thinking....");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }


            do
            {
                a = ran.nextInt(3);
                b = ran.nextInt(3);
            }
            while(board[a][b] != ' ');
            board[a][b]='O';

            for(i=0;i<3;i++)
            {
                if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                {
                    System.out.println("Computer wins!");
                    boardState=true;
                    break;
                }
            }
            for(j=0;j<3;j++)
            {
                if(board[0][j] != ' ' && board[0][j]==board[1][j] && board[1][j] == board[2][j])
                {
                    System.out.println("Computer wins!");
                    boardState=true;
                    break;
                }
            }
            if(board[0][0] != ' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2])
            {
                System.out.println("Computer wins!");
                boardState=true;
                break;
            }
            if(board[0][2] != ' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0])
            {
                System.out.println("Computer wins!");
                boardState=true;
                break;
            }
            if (draw(board)) {
                System.out.println("It's a draw!");
                boardState=true;
                break;
            }

        }
        }
    }
*/
