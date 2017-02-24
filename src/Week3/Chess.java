package Week3;

/**
 *
 * @author 55vanzilwa27
 */
public class Chess {
    public static void display(char[][] x) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        char[][] board = { //char[][][] = char[page or board][board rows][board columns]
            {'r', 'h', 'b', 'k', 'q', 'b', 'h', 'r'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'},};

        display(board);
        board[0][1]='-';
        board[2][2]='h';
        System.out.println("");
        display(board);
    }

}
    

