import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < num; i++) {
            boolean[] checkArr = new boolean[26];
            String str = sc.next();
            char firstChar = str.charAt(0);
            checkArr[firstChar - 97] = true;
            boolean check = true;
            for (int j = 1; j < str.length(); j++) {
                char curChar = str.charAt(j);
                if (firstChar != curChar && checkArr[curChar - 97]) {
                    check = false;
                    break;
                }
                checkArr[curChar - 97] = true;
                firstChar = curChar;
            }
            if(check) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}