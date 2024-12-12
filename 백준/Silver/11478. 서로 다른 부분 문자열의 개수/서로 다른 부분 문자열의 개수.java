import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<String> set = new HashSet<>();
        int index = 1;
        while(true) {
            for (int i = 0; i < str.length(); i++) {
                if (index + i <= str.length()) {
                    set.add(str.substring(i, index + i));
                }
            }
            index++;
            if (index > str.length()) {
                break;
            }
        }
        System.out.println(set.size());
    }
}