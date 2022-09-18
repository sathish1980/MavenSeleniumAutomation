package Bag2.copy;

public final class exceptionhandling {
	
	final int d=25;
	int z;
	public final void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void div(int a, int b)
	{
		try
		{
			int c=a/b;
			System.out.println(c);
			try {
				finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch(ArithmeticException abc)
		{
			System.out.println(abc);
		}
		catch(Exception abc)
		{
			System.out.println(abc);
		}
		finally
		{
			if(b==0)
			{
				b=b+1;
				throw new ArithmeticException("You have entered zero value");
				
			}
			int c=a/b;
			System.out.println("Finally block"+c);
			//System.out.println("finally");
		}
	}

	public void arrayindex() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		try
		{
		int[] a = {1,2,3};
		System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{	
		
		exceptionhandling e= new exceptionhandling();
		e.div(10, 0);
		e.arrayindex();
		e.add();
	}
}
