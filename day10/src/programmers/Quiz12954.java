package programmers;

class Solution {
    public long[] solution(int x, int n) {
    	
    	long[] answer = {};
        long p = x;
        
        answer = new long[n];
        
        for(int i = 0; i < n; i++) {
            answer[i] = p;
            p += x;
        }
        
        return answer;
    }
}

public class Quiz12954 {
	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		s.solution(2, 5);
		s.solution(4, 3);
		s.solution(-4, 2);
		
	}
}
