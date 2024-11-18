import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int xMin = Math.min(Math.abs(x-0), Math.abs(x-w));
        int yMin = Math.min(Math.abs(y-0), Math.abs(y-h));
        System.out.println(Math.min(xMin, yMin));
    }
}