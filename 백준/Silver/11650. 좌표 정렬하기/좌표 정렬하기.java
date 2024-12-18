import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        /* 람다식으로 Comparator 정의
            a와 b는 arr의 요소로 Arrays.sort가 a, b를 비교하여 정렬 순서를 결정함.
         */
        Arrays.sort(arr, (a, b) -> { // 람다식으로 Comparator 정의
            // a[0]과 b[0]이 같으면 y좌표를 기준으로 정렬
            if (a[0] == b[0]) {
                return a[1] - b[1]; // 음수: a[1], 양수: b[1]
            } else {
                return a[0] - b[0];  // 음수 a[0], 양수: b[0]
            }
        });

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}