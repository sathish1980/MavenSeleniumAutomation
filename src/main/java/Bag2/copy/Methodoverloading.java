package Bag2.copy;

public class Methodoverloading {

	public void add(int z, int X)
	{
		int c=z+X;
		System.out.println(c);
	}
	
	public void add(int f, String G)
	{
		String c=f+G;
		System.out.println(c);
	}
	public void add(int a, int b,int d)
	{
		int c=a+b+d;
		System.out.println(c);
	}
	
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading M = new Methodoverloading();
		M.add(2, 2);
		M.add(2.34, 5);
		M.add(3, 4.5);
		M.add(4.5, 3);
	}

}
