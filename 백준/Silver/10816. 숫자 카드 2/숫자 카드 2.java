import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];

        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        Arrays.sort(nArr);

        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int j = 0; j < m; j++) {
            mArr[j] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int card : mArr) {
            int count = countOccurrences(nArr, card);
            sb.append(count).append(" ");
        }
        System.out.println(sb.toString());
    }

    // 특정 숫자의 등장 횟수를 이진탐색
    private static int countOccurrences(int[] nArr, int card) {

        int lower = lowerBound(nArr, card);
        int upper = upperBound(nArr, card);

        return upper - lower;  // tartget의 등장횟수 계산
    }

    // target이 처음으로 등장하는 위치 계산
    private static int lowerBound(int[] nArr, int target) {
        int left = 0;
        int right = nArr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nArr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // target보다 큰 값이 처음으로 등장하는 위치
    private static int upperBound(int[] nArr, int target) {
        int left = 0;
        int right = nArr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nArr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}