import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 낮에 올라가는 높이
        int b = sc.nextInt();  // 밤에 미끄러지는 높이
        int v = sc.nextInt();  // 나무막대의 높이

        int day = (v - b) / (a - b);  // 마지막 날 내려가는 것 제외
        if ((v - b) % (a - b) != 0) {  // 하루가 더 필요
            day++;
        }
        System.out.println(day);
    }
}