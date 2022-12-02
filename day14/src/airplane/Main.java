package airplane;

public class Main {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		Singer s1 = new Singer("아이유");
		Singer s2 = new Singer("민경훈");
		Singer s3 = new Singer("A");
		
		Doctor d1 = new Doctor("김사부");
		Doctor d2 = new Doctor("이국종");
		
		Singer s4 = new Singer("B");
		
//		Human c = s1;
		
		Human[] waiting = {s1, s2, s3, d1, d2, s4};
		
		for(int i = 0; i < waiting.length; i++) {
			Human ob = waiting[i];
			air.entrance(ob);
		}
		
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다 (1명은 못탐)
		// Human의 서브클래스는 여러개를 만들어도 됩니다
		// 이때, 최소 2명의 의사를 포함시킵니다
		
		int pa = air.emergency(); 	// 응급상황이 발생하여 환자의 위치를 반환한다
		air.process(pa);			// 환자의 위치를 전달하여 비행기 내부에서 의사를 찾아서 처리한다
		
		// 비행기 내부에서 의사가 있다면, 의사의 heal() 함수를 호출하여 대상을 치료하는 코드를 작성하세요
		
	}
}
