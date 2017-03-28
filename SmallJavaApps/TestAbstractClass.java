
class Abstract {
	private Abstract() {
		System.out.println("Abstract class private constructor invoked.");
	}
}

public class TestAbstractClass extends Abstract {
	public TestAbstractClass() {	
		System.out.println("Concrete class costructor invoked");
	}

	public static void main (String args []) {

		TestAbstractClass testObj = new TestAbstractClass();

	}
}
