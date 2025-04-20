import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static long[] nArr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nArr = new long[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextLong();
        }

        Arrays.sort(nArr);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            long num = sc.nextLong();
            int answer = binarySearch(0, nArr.length - 1, num);
            System.out.println(answer);
        }
    }

    public static int binarySearch(int left, int right, long num) {
        if (left > right) {
            return 0;
        }
        int mid = (left + right) / 2;
        if (num == nArr[mid]) {
            return 1;
        }else if (num > nArr[mid]) {
            return binarySearch(mid + 1, right, num);
        } else {
            return binarySearch(left, mid - 1, num);
        }
    }
}