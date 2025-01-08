class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for (int i = 3; i <= sum; i++) {
            int row = i; // 행
            int col = sum / row;  // 열
            if (row >= col) {
                int width = (row - 2) * (col - 2);
                if (width == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                }
            }
        }
        return answer;
    }
}