import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[9][9];
        int max = Integer.MIN_VALUE;
        int row = 0;
        int column = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = sc.nextInt();
                if (max < board[i][j]) {
                    max = board[i][j];
                    row = i + 1;
                    column = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + column);
    }
}