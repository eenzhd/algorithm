import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] timeArr = new int[n];

        for (int i = 0; i < n; i++) {
            timeArr[i] = sc.nextInt();
        }

        Arrays.sort(timeArr);

        int sumTime = 0;
        int beforeTime = 0;

        for (int i = 0; i < timeArr.length; i++) {
            sumTime += timeArr[i] + beforeTime;
            beforeTime += timeArr[i];
        }

        System.out.println(sumTime);
    }
}