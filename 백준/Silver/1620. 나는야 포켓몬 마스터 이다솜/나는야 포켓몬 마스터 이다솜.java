import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 1;
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> reverseMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            map.put(name, count);
            reverseMap.put(count, name);
            count++;
        }

        for (int j = 0; j < m; j++) {
            String str = sc.next();
            if(map.containsKey(str)) {
                System.out.println(map.get(str));
            } else {
                int num = Integer.valueOf(str);
                System.out.println(reverseMap.get(num));
            }
        }
    }
}