import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] score = new int[num + 1];
        int[] dp = new int[num + 1];

        for (int i = 1; i <= num; i++) {
            score[i] = sc.nextInt();
        }

        dp[1] = score[1];

        if (num > 1) {
            dp[2] = score[1] + score[2];
        }
        for (int i = 3; i <= num; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + score[i - 1]) + score[i];
        }
        System.out.println(dp[num]);
    }
}