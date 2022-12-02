package programmers;

class Solution2 {
    public String solution(String X, String Y) {
        String answer = "";
        int[] cnt = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        boolean nothing = true;
        
        for(int i = 9; i != -1; i--) {
        	String ch = i + "";
        	while(X.contains(ch) && Y.contains(ch)) {
        		X = X.replaceFirst(ch, "");
        		Y = Y.replaceFirst(ch, "");
        		cnt[i]++;
        		nothing = false;
        	}
        }
        
        if(nothing) {
        	return "-1";
        }
        
        for(int i = 0; i < cnt.length; i++) {
        	System.out.print(cnt[i] + " ");
        }System.out.println();
        
        if(cnt[0] != 0) {
        	cnt[0] = 1;
        }
        
        
        for(int i = cnt.length - 1; i != -1; i--) {
        	while(cnt[i] != 0) {
        		answer += i;
        		cnt[i]--;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}
public class Backup {
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		System.out.println(s.solution("100", "2345").equals("-1"));
		System.out.println(s.solution("100", "203045").equals("0"));
		System.out.println(s.solution("100", "123450").equals("10"));
		System.out.println(s.solution("12321", "42531").equals("321"));
		System.out.println(s.solution("5525", "1255").equals("552"));
	}
}