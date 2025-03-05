import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int meeting = 0;

        long[][] timeArr = new long[n][2];
        
        for (int i = 0; i < n; i++) {
            timeArr[i][0] = sc.nextLong();
            timeArr[i][1] = sc.nextLong();
        }

        Arrays.sort(timeArr, (a, b) -> {
            if (a[1] != b[1]) {
                return Long.compare(a[1], b[1]);
            }
            return Long.compare(a[0], b[0]);
        });

        long preTime = 0;

        for (int i = 0; i < timeArr.length; i++) {
            if (preTime <= timeArr[i][0]) {
                meeting++;
                preTime = timeArr[i][1];

            }
        }
        System.out.println(meeting);
    }
}