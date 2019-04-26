public interface UserService {
	void greetUser(String greeting);
	
	default public void xyz() {
		System.out.println("Ok");
	}
}
