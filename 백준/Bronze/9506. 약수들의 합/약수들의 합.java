import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }
            Collections.sort(list);
            if (sum != num) {
                System.out.println(num + " is NOT perfect.");
            } else {
                System.out.print(num + " = ");
                for (int j = 0; j < list.size(); j++) {
                    if (j == list.size() - 1) {
                        System.out.println(list.get(j));
                    } else {
                        System.out.print(list.get(j) + " + ");
                    }
                }
            }
        }
    }
}