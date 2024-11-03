import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num - 1; i++) {
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = i * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}