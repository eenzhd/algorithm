import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[100][100];
        int width = 0;
        for (int i = 0; i < num; i++) {
            int left = sc.nextInt();
           
            int bottom = sc.nextInt();
            for (int j = left; j < 10 + left; j++) {
                for (int k = bottom; k < 10 + bottom; k++) {
                    arr[j][k] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    width++;
                }
            }
        }
        System.out.println(width);
    }
}