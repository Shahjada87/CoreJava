class Test1 // SubClass
{
	static int k;
	static {
		System.out.println("===Subclass Static block===");
	}
}

class DBlock1 // MainClass
{
	public static void main(String[] args) {
		// Accessing the static variable of Class Test1
		System.out.println("===main() method===");
		Test1.k = 10;
	}

	static {
		System.out.println("====MainClass Static Block1====");
	}
	static {
		System.out.println("====MainClass Static Block2====");
	}
}