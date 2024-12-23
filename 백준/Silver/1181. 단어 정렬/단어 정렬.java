import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
            set.add(sc.next());
        }
        List<String> list = new ArrayList<>(set.stream().collect(Collectors.toList()));
        Collections.sort(list, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return a.length() - b.length();
            }
        });

        for(String str : list) {
            System.out.println(str);
        }
    }
}