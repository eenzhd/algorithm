import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            switch(str[0]) {
                case "1": stack.add(Integer.valueOf(str[1])); break;
                case "2":
                    bw.write(stack.isEmpty() ? "-1\n" : stack.pop() + "\n"); break;
                case "3": bw.write(stack.size() + "\n"); break;
                case "4":
                    bw.write(stack.isEmpty() ? "1\n" : "0\n"); break;
                case "5":
                    bw.write(!stack.isEmpty() ? stack.peek() + "\n" : "-1\n"); break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}