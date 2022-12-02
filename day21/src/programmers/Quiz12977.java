package programmers;

import java.util.ArrayList;
import java.util.List;

//	주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
//	숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, 
//	nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 
//	solution 함수를 완성해주세요.

class Solution {
	public boolean isPrimeNumber(Integer num) {
		return list.contains(num);
	}
	
	private void initList() {
		boolean[] arr = new boolean[1000 + 1];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		
		for(int i = 2; i * i < arr.length; i++) {
			if(arr[i] && isPrimeNumber(i)) {
				for(int j = i + i; j < arr.length; j += i) {
					arr[j] = false;
				}
			}
		}
		
		for(int i = 2; i < arr.length; i++) {
			if(arr[i]) {
				list.add(i);
			}
		}
	}
	
	List<Integer> list = new ArrayList<Integer>();
	
	public int solution(int[] nums) {
		int answer = -1;
		initList();
//		System.out.println(list);
//		System.out.println(list.size());
		
		// 4개의 정수로 3개씩 더한 경우의 수 (4 * 3 * 2) / (3 * 2 * 1) => 24 / 6 => 4
		// 1, 2, 3
		// 1, 2, 4
		// 1, 3, 4
		// 2, 3, 4
		
		// 5개의 정수로 3개씩 더한 경우의 수	(5 * 4 * 3) / (3 * 2 * 1) => 60 / 6 => 10
		// 1, 2, 4
		// 1, 2, 6
		// 1, 2, 7
		// 1, 4, 6
		// 1, 4, 7
		// 1, 6, 7
		// 2, 4, 6
		// 2, 4, 7
		// 2, 6, 7
		// 4, 6, 7
		
		// n개의 정수로 3개씩 더한 경우의 수 (n * n-1 * n-2) / 6
		
		
		
		return answer;
	}
}

public class Quiz12977 {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(1 == s.solution(new int[] { 1, 2, 3, 4 }));
//		System.out.println(4 == s.solution(new int[] { 1, 2, 7, 6, 4 }));
	}
}
