import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int room = 1;
        int count = 1;
        while (room < num) {
            room += 6 * count;
            count++;
        }
        System.out.println(count);
    }
}