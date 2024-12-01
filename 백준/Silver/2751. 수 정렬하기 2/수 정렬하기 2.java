import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(Integer.valueOf(st.nextToken()));
        }
        Collections.sort(list);
        for (int j = 0; j < list.size(); j++) {
            bw.write(list.get(j) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}