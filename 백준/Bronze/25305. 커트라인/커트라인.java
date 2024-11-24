import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  // 응시자 수
        int k = sc.nextInt();  // 상을 받는 사람의 수

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                int tmp = 0;
                if (arr[i] < arr[j + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(arr[k - 1]);
    }
}