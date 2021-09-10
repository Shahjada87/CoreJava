package test;

class Test2 // SubClass
{
	{
		System.out.println("===SubClass NonStatic block===");
	}
}

class DBlock2 // MainClass
{
	public static void main(String[] args) {
		Test2 ob1 = new Test2();
		Test2 ob2 = new Test2();
		Test2 ob3 = new Test2();
	}
}