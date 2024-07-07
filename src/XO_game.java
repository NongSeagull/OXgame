import java.util.Scanner;
public class XO_game {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        char[][] board = new char[3][3];
        System.out.println("Welcome to OX Game.");

        int row = 0;
        int col = 0;

        int[][] O = new int[3][3];
        int[][] X = new int[3][3];

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

        int i;
        int j;

        int inputPos1;
        int inputPos2;

        while (true) {
            System.out.print("input position 1 and 2 : ");
            inputPos1 = kb.nextInt();
            inputPos2 = kb.nextInt();
            System.out.println("your position is (" + inputPos1 + " , " + inputPos2 + ")" );
            for(i = 0 ; i < row ; i++) {
                if (inputPos1 > board.length + 1 || inputPos2 > board.length + 1) {
                    System.out.println("index out of bound");
                    break;
                }
            }
        }

    }
}
