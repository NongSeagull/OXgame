import java.util.Scanner;
public class XO_game {
    public static void printBoard(char[][] board){
        int row;
        int col;
        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                System.out.print("| " + board[row][col] + " ");
            }
            System.out.println("|");
        }
    }
    public static void main(String[] args) {
        //variable
        /*scanner*/
        Scanner kb = new Scanner(System.in);
        /*create board with 3 x 3*/
        char[][] board = new char[3][3];
        /*row and column */
        int row = 0;
        int col = 0;
        /*position 1 and 2*/
        int position1;
        int position2;
        /*for switch player*/
        char currentPlayer = 'x';

        //welcome text
        System.out.println("Welcome to OX Game.");

        //set up blank board
        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                board[row][col] = '-';
            }
        }

        while (true) {
            //print board
            printBoard(board);

            if(currentPlayer == 'x'){ /* X turn */
                System.out.println("-- It's X Turn --");
                System.out.print("input row and column : ");
                position1 = kb.nextInt();
                position2 = kb.nextInt();

                    //index out of bound
                    if (position1 > board.length || position2 > board.length || position1 < 1 || position2 < 1) {
                        System.out.println("Your input is out of bounds, please try again.");
                        break;
                    //position is already exit
                    }else if(board[position1-1][position2-1] != ('-') ){
                        System.out.println("this position is already exist, please try again.");
                        continue;
                    //write new info and switch player
                    }else{
                        board[position1-1][position2-1] = 'X';
                        currentPlayer = 'o';
                    }
            }else{ /* O turn */
                System.out.println("-- It's O Turn --");
                System.out.print("input row and column : ");
                position1 = kb.nextInt();
                position2 = kb.nextInt();

                    //index out of bound
                    if (position1 > board.length || position2 > board.length || position1 < 1 || position2 < 1) {
                        System.out.println("Your input is out of bounds, please try again.");
                        break;
                    //position is already exit
                    }else if(board[position1-1][position2-1] != ('-')){
                        System.out.println("this position is already exist, please try again.");
                        continue;
                    //write new info and switch player
                    }else{
                        board[position1-1][position2-1] = 'O';
                        currentPlayer = 'x';
                    }
            }
        }
    }
}
