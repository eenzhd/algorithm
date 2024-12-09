import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String status = sc.next();
            if(status.equals("leave")) {
                map.remove(name);
            } else {
                map.put(name, status);
            }
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        list.sort(Comparator.reverseOrder());
        for(String name : list) {
            System.out.println(name);
        }
    }
}