class GFG {
	// static variable
	static int a = 40;
	int b = 50;
	void simpleDisplay()
	{
		System.out.println(a);
		System.out.println(b);
	}
	// Declaration of a static method.
	static void staticDisplay()
	{
	System.out.println(a);
	}
class Statm{
    public static void main(String[] args)
	{
		GFG obj = new GFG();
		obj.simpleDisplay();

		// Calling static method.
		staticDisplay();}
}
}