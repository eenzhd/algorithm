import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j; k < arr.length - 1; k++) {
                int tmp = 0;
                if (arr[j] > arr[k + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[k + 1];
                    arr[k + 1] = tmp;
                }
            }
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}