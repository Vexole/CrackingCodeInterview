public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.xyz();
		System.out.println(T.testValue);

		Integer x = 125;
		Integer y = 125;
		Integer z = new Integer(125);
		System.out.println(x.equals(z));

		Integer a = 128;
		Integer b = 128;
		System.out.println(a == b);

		System.out.println((Object) null);
	}

	public void xyz() {
		UserService obj = new UserService() {
			@Override
			public void greetUser(String greeting) {
				System.out.println((UserService) this instanceof Test);
			}
		};
		obj.greetUser("");

		UserService obj1 = (String msg) -> System.out.println(this instanceof Test);
		obj1.greetUser("");
	}
}

class T {
	public static final Integer testValue = 10;

	static {
		System.out.println("OK");
	}
}

class XYZ implements UserService {

	@Override
	public void greetUser(String greeting) {
		// TODO Auto-generated method stub
		System.out.println("ok");
	}

}