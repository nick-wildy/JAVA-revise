package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

class Solution {
	public String solution(String X, String Y) {
		System.out.printf("\n== (%s, %s) ==\n", X, Y);
		
		StringBuilder sb = new StringBuilder();
		String answer = "";
		int[] arrX = new int[10];
		int[] arrY = new int[10];
		List<Character> list = new ArrayList<Character>();
		
		for(char ch : X.toCharArray()) {
			arrX[ch - '0']++;
		}
		showArr(arrX);
		
		for(int i = 0; i < Y.length(); i++) {
			char ch = Y.charAt(i);
			if(arrX[ch - '0'] != 0) {
				arrY[ch - '0']++;
				arrX[ch - '0']--;
				list.add(ch);
			}
		}
		System.out.println(list);
//		list.sort((a, b) -> b - a);
		
		list.sort(new Comparator<Character>() {
			@Override
			public int compare(Character o1, Character o2) {
				return o2 - o1;
			}
		});
		

//		list.forEach(sb::append);
		
//		list.forEach(ch -> sb.append(ch));
		
//		list.forEach(new Consumer<Character>() {
//			@Override
//			public void accept(Character t) {
//				sb.append(t);
//			}
//		});
		
//		for(char ch : list) {
//			sb.append(ch);
//		}
		
		for(int i = 0; i < list.size(); i++) {
			char ch = list.get(i);
			sb.append(ch);
		}
		showArr(arrX);
		showArr(arrY);
		System.out.println(list);
		
		answer = sb.toString();
		
		if(answer.equals("")) {
			return "-1";
		}
		if(answer.startsWith("0")) {
			return "0";
		}
		
		System.out.println("answer : " + answer);
		System.out.println();
		return answer;
	}

	private void showArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();
		
	}
}

public class Quiz131128 {
	public static void main(String[] args) {
		Solution s = new Solution();

		System.out.println(s.solution("100", "2345").equals("-1"));
		System.out.println(s.solution("100", "203045").equals("0"));
		System.out.println(s.solution("100", "123450").equals("10"));
		System.out.println(s.solution("12321", "42531").equals("321"));
		System.out.println(s.solution("5525", "1255").equals("552"));
		
		System.out.println(s.solution("2100000", "3000002").equals("200000"));
		System.out.println(s.solution("3403", "13203").equals("330"));
		System.out.println(s.solution("1023456", "605040").equals("6540"));
		
	}
}