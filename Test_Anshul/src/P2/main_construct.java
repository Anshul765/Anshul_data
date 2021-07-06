package P2;

public class main_construct {
	public static int a = 10;

	public static void main(String[] args) {
		main_construct ref = new main_construct(12,25);
        System.out.println("value of a is" +a);
		
	}
	
	public main_construct() {
		System.out.println("This is default constructor");
	}
	
	public main_construct(int a) {
		System.out.println("One parameterized constructor");
	}

	public main_construct(int a, int b) {
		System.out.println("Two parameterized constructor");
		
	}
	
}
