package serialize;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Handler handler = new Handler();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Scanner sc = new Scanner(System.in);
		String title;
		Date date;
		Todo todo;
		int menuSelect;
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 정렬");
			System.out.println("0. 종료");
			System.out.println("선택 >>> ");
			menuSelect = Integer.parseInt(sc.nextLine());
			
			switch(menuSelect) {
			case 1:
				handler.showList();
				break;
				
			case 2:
				System.out.print("일정 제목 입력 : ");			title = sc.nextLine();
				System.out.print("날짜 입력 (yyyy.MM.dd) : "); date = sdf.parse(sc.nextLine());
				todo = new Todo(title, date);
				handler.insert(todo);
				break;
				
			case 3:
				System.out.print("일정 제목 입력 : ");			title = sc.nextLine();
				handler.delete(title);
				break;
				
			case 4:
				handler.sortByDate();
				handler.showList();
				break;
				
			case 0:
				handler.save();
				sc.close();
			}
			
		} while(menuSelect != 0);
		
	}
}
