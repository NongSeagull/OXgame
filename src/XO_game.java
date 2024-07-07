import java.util.Scanner;
public class XO_game {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[][] board = new char[3][3];

        //variable
        int row = 0;
        int col = 0;

        int i;
        int j;

        int position1;
        int position2;

        char currentPlayer = 'x';

        //welcome text
        System.out.println("Welcome to OX Game.");
        //set up blank board
        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                board[row][col] = '-';
            }
        }
        //print board
        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                System.out.print("| " + board[row][col] + " ");
            }
            System.out.println("|");
        }

        while (true) {
            //X turn
            if(currentPlayer == 'x'){
                System.out.println("-- It's X Turn --");
                System.out.print("input position 1 and 2 : ");
                position1 = kb.nextInt();
                position2 = kb.nextInt();
                System.out.println("your position is (" + position1 + " , " + position2 + ")" );
                for(i = 0 ; i < row ; i++) {
                    //index out of bound
                    if (position1 > board.length || position2 > board.length || position1 < 1 || position2 < 1) {
                        System.out.println("your index is valid, please try again.");
                        break;
                        //this position is already taken and taken by X or O
                    }else if(board[position1-1][position2-1] != ('-') && board[position1-1][position2-1] != ('X')){
                        System.out.println("position is already exit, please try again.");
                        break;
                    }else{
                        board[position1-1][position2-1] = 'X';
                        currentPlayer = 'o';
                    }
                }
                for (row = 0; row < board.length; row++) {
                    for (col = 0; col < board.length; col++) {
                        System.out.print("| " + board[row][col] + " ");
                    }
                    System.out.println("|");
                }
                //O turn
            }else if(currentPlayer == 'o'){
                System.out.println("-- It's O Turn --");
                System.out.print("input position 1 and 2 : ");
                position1 = kb.nextInt();
                position2 = kb.nextInt();
                System.out.println("your position is (" + position1 + " , " + position2 + ")" );
                for(i = 0 ; i < row ; i++) {
                    //index out of bound
                    if (position1 > board.length || position2 > board.length || position1 < 1 || position2 < 1) {
                        System.out.println("your index is valid, please try again.");
                        break;
                        //this position is already taken and taken by X or O
                    }else if(board[position1-1][position2-1] != ('-') && board[position1-1][position2-1] != ('X')){
                        System.out.println("position is already exit, please try again.");
                        break;
                    }else{
                        board[position1-1][position2-1] = 'O';
                        currentPlayer = 'x';
                    }
                }
                for (row = 0; row < board.length; row++) {
                    for (col = 0; col < board.length; col++) {
                        System.out.print("| " + board[row][col] + " ");
                    }
                    System.out.println("|");
                }
            }
        }
    }
}
