import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] people = new String[n][2];

        for (int i = 0; i < n; i++) {
            people[i][0] = sc.next();
            people[i][1] = sc.next();
        }

        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.valueOf(a[0]).compareTo(Integer.valueOf(b[0]));
            }
            return 0;
        });

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i][0] + " " + people[i][1]);
        }
    }
}