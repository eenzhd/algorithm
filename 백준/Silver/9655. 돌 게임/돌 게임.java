import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] dp = new boolean[n + 1];

        dp[0] = false;

        if (n >= 1) dp[1] = true;
        if (n >= 3) dp[3] = true;

        for (int i = 3; i < dp.length; i++) {
            if (dp[i - 1] == true) {
                dp[i] = false;
            }
            if (dp[i - 3] == false) {
                dp[i] = true;
            }
        }

        if (dp[n]) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}
