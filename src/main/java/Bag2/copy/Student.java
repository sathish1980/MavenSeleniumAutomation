package Bag2.copy;

public class Student 
{
	static String  schoolName="Govenment school";
	
	public void Studentinfo(String name,String standard)
	{
		System.out.println("Student Name is  : "+name);
		System.out.println("Student Name belong to  : "+standard +"standard");
	}
	
	
	public static void sprots()
	{
		System.out.println("indoor");
		System.out.println("outdoor");
	}
	
	public static void main(String[] args)
	{
		Student s= new Student();
		s.Studentinfo("sathish", "10th");
		s.sprots();
	}

}
