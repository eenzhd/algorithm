import java.util.ArrayList;
import java.util.List;

class Solution {

    static char[] vowels = {'A', 'E', 'I', 'O', 'U'};
    static List<String> list = new ArrayList<String>();

    public int solution(String word) {
        makeWords("", 0);
        return list.indexOf(word) + 1;
    }

    private void makeWords(String str, int depth) {
        if(depth > 5) {
            return; // 5글자 이상이면 리턴
        }
        if(depth > 0) { // 1글자 이상이면 리스트에 추가
            list.add(str);
        }

        for (char c : vowels) {
            makeWords(str + c, depth + 1);
        }

    }
}