import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int answer = 0;

        for (int j = 0; j < n; j++) {
            if (queue.size() == 1) {
                answer = queue.peek();
                break;
            }
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(answer);
    }
}