package day03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String bar1 = "┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐\n";
		String bar2 = "│    │    │    │    │    │    │";
		int space;
		
		// 0 ~ 30 사이의 정수를 입력받아서, 입력받은 위치에 ↑ 가 위치하도록 코드를 작성하세요
		System.out.print("0 ~ 30 사이의 정수 입력 : ");
		space = sc.nextInt();
		
		System.out.println(bar1 + bar2);
		for(int i = 0; i < space; i++) {
			System.out.print(" ");
		}
		System.out.println("↑");
		
		sc.close();
	}
}
