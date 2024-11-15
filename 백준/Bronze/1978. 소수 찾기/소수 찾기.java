import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            boolean check = true;
            if (n < 2) {
                continue;
            }
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}