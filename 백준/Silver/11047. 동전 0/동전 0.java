import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int k = sc.nextInt();
        int[] money = new int[n];

        int count = 0;

        for (int i = 0; i < money.length; i++) {
            money[i] = sc.nextInt();
        }

        for (int i = money.length - 1; i >= 0; i--) {
            if (k >= money[i]) {
                count += (k / money[i]);
                k = k % money[i];
            }
        }
        System.out.println(count);
    }
}