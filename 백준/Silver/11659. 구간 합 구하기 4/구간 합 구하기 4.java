import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] prefixSum = new int[n + 1];
        for (int i = 1; i < prefixSum.length; i++) {
            int num = sc.nextInt();
            prefixSum[i] = num + prefixSum[i - 1];
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int sum = prefixSum[end] - prefixSum[start - 1];
            System.out.println(sum);
        }
    }
}