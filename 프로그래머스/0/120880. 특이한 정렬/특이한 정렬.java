import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        for(int i=0; i<numlist.length; i++) {
        	int num = 0;
        	for(int j=0; j<numlist.length; j++) {
        		if(Math.abs(n-numlist[i]) <= Math.abs(n-numlist[j])) {
        			num = numlist[i];
        			numlist[i] = numlist[j];
        			numlist[j] = num;
        		}
        	}
        }
        return numlist;
    }
}