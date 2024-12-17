import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] count = new int[10];
        while(num > 0) {
            count[num % 10]++;
            num /= 10;
        }
        for (int j = count.length - 1; j >= 0; j--) {
            while (count[j]-- > 0) {
                System.out.print(j);
            }
        }
    }
}