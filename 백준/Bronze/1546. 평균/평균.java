import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        float sum = 0f;

        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        System.out.println(sum / max * 100.0 / n);
    }
}