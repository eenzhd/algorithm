import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int count1 = map.getOrDefault(name, 0);
            map.put(name, count1 + 1);
        }

        for (int j = 0; j < m; j++) {
            String name = sc.next();
            int count2 = map.getOrDefault(name, 0);
            map.put(name, count2 + 1);
        }

        int cnt = 0;
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                cnt++;
                list.add(entry.getKey());
            }
        }

        System.out.println(cnt);
        Collections.sort(list);

        for(String name : list) {
            System.out.println(name);
        }
    }
}