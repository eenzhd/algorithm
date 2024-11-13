import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        Collections.sort(arr);
        if (arr.size() < k) {
            System.out.println(0);
        } else {
            System.out.println(arr.get(k - 1));
        }
    }
}