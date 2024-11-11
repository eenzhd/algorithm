import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] dollar = {25, 10, 5, 1};
        for (int i = 0; i < t; i++) {
            int money = sc.nextInt();
            for (int j = 0; j < dollar.length; j++) {
                System.out.print(money / dollar[j] + " ");
                money = money % dollar[j];
            }
            System.out.println();
        }
    }
}