package card;

public class Main {
	public static void main(String[] args) {
		
		// 모든 객체가 같은 값을 공유하게 하려면 static
		Card.setSize(10, 13);
		
		// 객체마다 서로 다른 값을 가지게 하려면 non-static
		Card ob1 = new Card("♥", "5");
		Card ob2 = new Card("♠", "A");
		Card ob3 = new Card("♣", "7");
		
		ob1.show();
		ob2.show();
		ob3.show();
	}
}
