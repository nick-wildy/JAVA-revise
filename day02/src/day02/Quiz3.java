package day02;

public class Quiz3 {
	public static void main(String[] args) {
		// 1) while을 이용하여 정수를 거꾸로 뒤집어서 다른 변수에 저장한 후 출력하세요
		int n1 = 1234;
		int n2 = 0;
		
		while(n1 != 0) {
			n2 = n2 * 10;	// 3번째로 추가한 코드
			n2 += n1 % 10;
//			n1 = n1 / 10;
			n1 /= 10;
//			if(n1 == 0) {
//				break;
//			}
		}
//		System.out.println(n1 + ", " + n2);
		System.out.println("n2 : " + n2); 	// 4321
		
		// 2) for를 이용하여 1부터 1000사이의 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
		int oddSum = 0, evenSum = 0;	// 250000, 250500
		
		for(int i = 1; i != 1001; i++) {	// for i in range(1000, 1, -1)
			boolean isOdd = i % 2 == 1;
//			System.out.println(i + " : " + isOdd);
			if(isOdd) {
				oddSum += i;
			}
			else {
				evenSum += i;
			}
		}
		
		/* ... */
		System.out.printf("oddSum : %d, evenSum : %d\n", oddSum, evenSum);
		
	}
}
