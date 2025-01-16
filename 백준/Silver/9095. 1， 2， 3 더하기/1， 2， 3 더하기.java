import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] dp = new int[11];

        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            System.out.println(dp[num - 1]);
        }
    }
}