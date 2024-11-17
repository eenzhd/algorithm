import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <= num; ) {
            if (num > 1) {
                if (num % i == 0) {
                    num /= i;
                    System.out.println(i);
                } else {
                    i++;
                }
            }
        }
    }
}