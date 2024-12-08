import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        Set<Integer> aList = new HashSet<>();
        Set<Integer> bList = new HashSet<>();

        for (int i = 0; i < a; i++) {
            aList.add(sc.nextInt());
        }

        for (int i = 0; i < b; i++) {
            bList.add(sc.nextInt());
        }

        for(int num : aList) {
            if(!bList.contains(num)) {
                count++;
            }
        }

        for(int num : bList) {
            if(!aList.contains(num)) {
                count++;
            }
        }

        System.out.println(count);
    }
}