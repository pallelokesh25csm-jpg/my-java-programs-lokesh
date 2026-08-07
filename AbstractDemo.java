package inheritance;

abstract class Base {
	int x;

	void sayMyName() {
		System.out.println("My name is ABCD");
	}

	abstract void sayMyAge();
}

public class AbstractDemo extends Base {

	@Override
	void sayMyAge() {
		System.out.println("Age in sub class is: 19");

	}

	public static void main(String[] args) {
		AbstractDemo ad = new AbstractDemo();
		System.out.println(ad.x);
		ad.sayMyName();
		ad.sayMyAge();
	}
}