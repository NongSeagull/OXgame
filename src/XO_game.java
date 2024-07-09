import java.util.Scanner;
public class XO_game {
    //class method
    public static void printBoard(char[][] board) {
        int row;
        int col;
        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                System.out.print("| " + board[row][col] + " ");
            }
            System.out.println("|");
        }
    }

    public static void setUpBoard(char[][] board) {
        System.out.println("Welcome to OX Game.");
        int row, col;
        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                board[row][col] = '-';
            }
        }
    }

    public static void checkPlayerTurn(char player) {
        if (player == 'X') {
            System.out.println("-- It's X Turn --");
        } else {
            System.out.println("-- It's O Turn --");
        }
    }
    public static char currentPlayer(boolean checkPlayer) {
        if (checkPlayer == true) {
            return 'X';
        } else {
            return 'O';
        }
    }
    public static boolean switchPlayer(char player){
        if(player == 'X'){
            return false;
        }else{
            return true;
        }
    }

    public static void printWinner(char winner) {
        if (winner == 'X') {
            System.out.print("--- X win ---");
        } else if (winner == 'O') {
            System.out.print("--- O win ---");
        }
    }

    public static String checkBoardFull(char[][] board) {
        int row, col;
        for (row = 0; row < board.length; row++) {
            for (col = 0; col < board.length; col++) {
                if (board[row][col] == '-') {
                    return "not full";
                }
            }
        }
        return "full";
    }

    //class main
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
        /*player variable*/
        char player;
        /*switch player*/
        boolean switchPlayer = true; //true: X , false: O

        //show welcome text and set up blank board
        setUpBoard(board);

        while (true) {
            /*config player by method currentPlayer(boolean)
            if boolean is true : player = X
            if boolean is false : player = O */
            //in this loop boolean is true then currentPlayer is X
            player = currentPlayer(switchPlayer);

            //print board
            printBoard(board);

            //check board is full or not (if true this game will end)
            if (checkBoardFull(board).equals("full")) {
                System.out.println("-- It's a Draw --");
                break;
            }
            //check player turn
            checkPlayerTurn(player);

            System.out.print("input row and column : ");
            position1 = kb.nextInt();
            position2 = kb.nextInt();

            //index out of bound
            if (position1 > board.length || position2 > board.length || position1 < 1 || position2 < 1) {
                System.out.println("Your input is out of bounds, please try again.");
                continue;
                //position is already exit
            } else if (board[position1 - 1][position2 - 1] != ('-')) {
                System.out.println("this position is already exist, please try again.");
                continue;
            } else { //write new info and switch player
                board[position1 - 1][position2 - 1] = player;
                //switch player
                switchPlayer = switchPlayer(player);
            }
        }
    }
}
