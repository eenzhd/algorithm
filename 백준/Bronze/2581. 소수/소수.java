import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int min = -1;
        for (int i = n; i <= m; i++) {
            boolean check = true;
            if (i == 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                sum += i;
                if (min == -1) {
                    min = i;
                }
            }
        }
        if (min == -1) {
            System.out.println(min);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}