package example;

public class Sub extends Super {
	
	Sub(int num) {
		super(num);
		this.num *= 2;
	}
	
	@Override
	public void show() {
		System.out.println(num + 1);
	}
}