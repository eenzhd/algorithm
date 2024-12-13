import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        for (int j = 0; j < m; j++) {
            String str = sc.next();
            if (list.contains(str)) {
                count++;
            }
        }

        System.out.println(count);
    }
}