package Bag2.copy;

public class Marks extends Student{

	//Student s = new Student();
	
	public double percentage(double tamilmark,double englishmark,double mathsmark)
	{
		System.out.println(schoolName);
		sprots();
		double totalmark=tamilmark+englishmark+mathsmark;
		double totalpercentage=(totalmark/3);
		return totalpercentage;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks M = new Marks();
		M.Studentinfo("besant","12th");
		M.percentage(50.00, 45.50, 75.80);
		
	}

}
