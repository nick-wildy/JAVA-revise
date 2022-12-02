package programmers;

class Solution3 {
	public String solution(String X, String Y) {
		String answer = "";
		int[] cnt = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		String tmp;
		int lenX = X.length(), lenY = Y.length();
		if (lenX > lenY) {
			tmp = X;
			X = Y;
			Y = tmp;
		}
		for(int i = 0; i < X.length(); i++) {
			int num = X.charAt(i) - 48;
			String s = num + "";
			if(Y.contains(s)) {
				cnt[num]++;
				Y = Y.replaceFirst(s, "");
			}
		}

		if(cnt[0] > 1) {
			cnt[0] = 1;
		}

		for (int i = 0; i < cnt.length; i++) {
			System.out.print(cnt[i] + " ");
		} System.out.println();
		
		for(int i = cnt.length - 1; i != -1; i--) {
			while(cnt[i] != 0) {
				answer += i;
				cnt[i]--;
			}
		}

		System.out.println(answer);
		if("".equals(answer)) {
			return "-1";
		}
		return answer;
	}
}

public class Backup2 {
	public static void main(String[] args) {
		Solution3 s = new Solution3();

		System.out.println(s.solution("100", "2345").equals("-1"));
		System.out.println(s.solution("100", "203045").equals("0"));
		System.out.println(s.solution("100", "123450").equals("10"));
		System.out.println(s.solution("12321", "42531").equals("321"));
		System.out.println(s.solution("5525", "1255").equals("552"));
	}
}