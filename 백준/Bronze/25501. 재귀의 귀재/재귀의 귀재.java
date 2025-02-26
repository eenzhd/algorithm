import java.util.Scanner;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String str = sc.next();
            int answer = isPalindrome(str);
            System.out.println(answer + " " + count);
            count = 0;
        }
    }

    public static int recursion(String str, int l, int r) {
        count++;
        if (l >= r) {
            return 1;
        } else if (str.charAt(l) != str.charAt(r)) {
            return 0;
        } else {
            return recursion(str, l + 1, r - 1);
        }
    }

    public static int isPalindrome(String str) {
        return recursion(str, 0, str.length() - 1);
    }
}