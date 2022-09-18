package Bag2.copy;

public class Tution extends Marks{
	
	public String Grade(double percentage)
	{
		if(percentage>95)
		{
			System.out.println("You are Grade A");
			return "A";
		}
		else if(percentage>90)
		{
			System.out.println("You are Grade B");
			return "B";
		}
		else if(percentage>70)
		{
			System.out.println("You are Grade C");
			return "C";
		}
		else if(percentage>=35)
		{
			System.out.println("You are Grade D");
			return "D";
		}
		else
		{
			System.out.println("You are Grade E");
		}
		return "E";
	}
	
	public void TuttionExist(String grade) 
	{
		switch(grade)
		{
		case "A":
			System.out.println("You dont have tution");
			break;
		case "B":
			System.out.println("You have tution on every weekened");
			break;
		case "C":
			System.out.println("You have tution on every Day 30 min");
			break;
		case "D":
			System.out.println("You have tution on every Day 1 hour");
			break;
		default:
			System.out.println("You have tution on weekdays and weekend");
			break;
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tution T = new Tution();
		double percentage=T.percentage(67, 89, 99);
		String grade=T.Grade(percentage);
		T.TuttionExist(grade);
	}

}
