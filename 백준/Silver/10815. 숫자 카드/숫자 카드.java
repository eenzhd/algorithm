import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        int m = sc.nextInt();
        List<Integer> cardList = new ArrayList<>();
        for (int j = 0; j < m; j++) {
            int num = sc.nextInt();
            if (set.contains(num)) {
                cardList.add(1);
            } else {
                cardList.add(0);
            }
        }
        for (int num : cardList) {
            System.out.print(num + " ");
        }
    }
}