import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] list = new String[strings.length];
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            list[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
           answer[i] = list[i].substring(1);
        }
        return answer;
    }
}
