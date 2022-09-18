package Bag2.copy;

public class Besantfirstclass {
	
	static public int a=11;
	long g=1231423434l;
	public float b=2.3f;
	double c=2.334;
	char d ='a';
	String e="sathish";
	boolean f=false;
	int[] number= {1,2,3,4,5};
	String[] name= {"sathish","kumar","R"};
	

	public Besantfirstclass()
	{
		System.out.println("constructor");
	}
	
	public Besantfirstclass(String name)
	{
		System.out.println("constructor: "+ name);
	}
	
	public void add() //Method implmentation
	{
		//int a=5;
		int b=20;
		int c=a+b;
		System.out.println("This is addition: "+c);
	}
	
	
	
	public void sub(int a, int b,int dob,int cryear) //Method implmentation
	{ 
		System.out.println(a);
		/*int c=a-b;
		System.out.println(c);*/
		//int age=agereturn(1990,2022);
		int age=agereturn(dob,cryear);
		System.out.println("Your age is : "+age);
	}
	
	/*public int agereturn()
	{
		int dobyear=1990;
		int currenyear=2022;
		int actualage=currenyear-dobyear;
		return actualage;
	}*/
	
	
	public int agereturn(int dobyear,int currenyear)
	{
		int actualage=currenyear-dobyear;
		System.out.println(actualage);
		return actualage;
	}
	
	public void passwordmatch(String password)
	{
		String actaulresult=passwordmatchresult(password);
		System.out.println(actaulresult);
	}
	
	public String passwordmatchresult(String passwordmatchcheck)
	{
		if(passwordmatchcheck.equals("Password"))
		{
			return "Yes";
		}
		return "No";
	}

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		System.out.println("sathishkumar");
		System.out.println("btech");
		System.out.print("Male");
		System.out.print("Tutor");
		System.out.println("Besant");
		System.out.println("2+3");
		System.out.println("Besant"+60002+" "+"technology");
		Besantfirstclass aa= new Besantfirstclass("sathish"); // instantiation
		aa.add();//Method call
		aa.sub(3, 5,2000,2022);
		int age=aa.agereturn(2000,2022);
				System.out.println(age);
		aa.passwordmatch("Password");
	}

}
