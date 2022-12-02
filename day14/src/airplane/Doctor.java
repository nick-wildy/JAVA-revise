package airplane;

public class Doctor extends Human {
	
	Doctor(String name) {
		super(name);
	}
	
	@Override
	void show() {
		System.out.println("의사 " + name);
	}
	
	void heal(Human other) {
		System.out.printf("%s가 %s를 치료합니다\n", name, other.name);
	}
}
