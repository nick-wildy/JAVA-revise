package movie2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	static void prepareDummy() throws ParseException {
		
		Movie t1 = new Movie("블랙아담", "자움 콜렛 세라", 
				"드웨인 존슨,노아 센티네오,피어스 브로스넌,퀸테사 스윈들".split(","), 
				"액션", 125, sdf.parse("2022-10-19"), 7.63);
		
		Movie t2 = new Movie("A", "B", "C,D,E".split(","), "F", 100, sdf.parse("2000-01-01"), 10.0);
		Movie t3 = new Movie("G", "H", "I,J".split(","), "K", 100, sdf.parse("2000-05-05"), 3.14);
		Movie t4 = new Movie("분노의 질주", "??", "빈 디젤,드웨인 존슨".split(","), "K", 100, sdf.parse("2000-05-05"), 3.14);
		
		Handler.arr[0] = t1;	// static이므로 객체 생성 없이 속성이나 기능에 접근할 수 있다
		Handler.arr[1] = t2;
		Handler.arr[2] = t3;
		Handler.arr[3] = t4;
		
	}
	
	public static void main(String[] args) throws ParseException {
		prepareDummy();
		
		int select, row;
		String keyword;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 단일검색");
			System.out.println("3. 다중검색");
			System.out.println("4. 추가");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:		// 목록을 문자열로 전달받아서 화면에 출력
				System.out.println(Handler.getList()); 
				break;
				
			case 2: 
				System.out.print("검색어를 입력 : ");
				keyword = sc.nextLine();
				System.out.println(Handler.search(keyword)); 
				break;
//			case 3: 
//				System.out.print("검색어를 입력 : ");
//				keyword = sc.nextLine();
//				System.out.println(Handler.searchList(keyword)); 
//				break;
//			case 4:
//				Movie ob = input(sc);
//				row = Handler.insert(ob);
//				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
//				break;
//			case 5:
//				System.out.println(Handler.getList());
//				System.out.print("삭제할 영화의 제목을 입력하세요 : ");
//				keyword = sc.nextLine();
//				row = Handler.delete(keyword);
//				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
//				break;
			}
		} while(select != 0);
		sc.close();
		
	} // end of main
	
	static Movie input(Scanner sc) throws ParseException {
		
		String title;		// 제목
		String director;	// 감독
		String[] actors;	// 배우
		String genre;		// 장르
		int runningTime;	// 러닝타임(분)
		Date openningDate;	// 개봉일자
		double grade;		// 평점
		
		System.out.print("제목 : "); 			title = sc.nextLine();
		System.out.print("감독 : "); 			director = sc.nextLine();
		System.out.print("배우 : "); 			actors = sc.nextLine().split(",");
		System.out.print("장르 : "); 			genre = sc.nextLine();
		System.out.print("러닝타임(분) : "); 	runningTime = Integer.parseInt(sc.nextLine());
		System.out.print("개봉일자 : "); 		openningDate = sdf.parse(sc.nextLine());
		System.out.print("평점 : "); 			grade = Double.parseDouble(sc.nextLine());
		
		Movie ob = new Movie(title, director, actors, genre, runningTime, openningDate, grade);
		return ob;
	}
}

















