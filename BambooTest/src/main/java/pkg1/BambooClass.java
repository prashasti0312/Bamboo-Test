package pkg1;

public class BambooClass {
	int add(int a, int b)
	{
	return (a+b);
	}
	int subtract(int a, int b)
	{
	return (b-a);
	}
	long multiply(int a, int b)
	{
	return (a*b);
	}
	double divide (int a, int b)
	{
	return (b/a);
}
	public static void main(String[] args)
	{
		BambooClass obj = new BambooClass();
		obj.add(5, 10);
		obj.subtract(10, 5);
		obj.multiply(5, 10);
		obj.divide(10, 5);
	}
	}



