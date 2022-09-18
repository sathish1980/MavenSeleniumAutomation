package Bag2.copy;

public class callinginanotherclass {
	
	Besantfirstclass aa= new Besantfirstclass();
	public void check()
	{
		 double cc=10.2;
		System.out.println(cc);
	}

	public static void main(String[] a)
	{
		Besantfirstclass aa= new Besantfirstclass();
		aa.add();
		callinginanotherclass ccclass= new callinginanotherclass();
		ccclass.check();
		
	}
}
