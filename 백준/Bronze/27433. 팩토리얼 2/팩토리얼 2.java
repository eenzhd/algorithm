import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        long answer = factorial(num);

       System.out.println(answer);
    }
    public static long factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}