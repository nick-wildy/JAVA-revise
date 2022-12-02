package programmers;

class Solution {
	public boolean isPrimeNumber(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int solution(int n) {
		int answer = 0;
		
		boolean[] arr = new boolean[n + 1];
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
				answer++;
				
			}
		}
		
		return answer;
	}
}

public class Quiz12921 {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		int n1 = s.solution(120);
		
		System.out.println(n1);
	}
}
