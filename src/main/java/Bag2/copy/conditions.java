package Bag2.copy;

public class conditions {
	
	public void voteridapply(int age,String gender)
	{
		String genCode=gender(gender);
		System.out.println(genCode);
		if((age >= 18) || (age < 80))
		{
			System.out.println("You are eligible to apply voter id");
			
			//if (age > 60)
			//{
				System.out.println("You are eligible to apply voter id and you falls under senior category");
				if (age > 80)
				{
					System.out.println("You are eligible to apply voter id and you falls under super senior category");
					
				}
			//}
		}
		else if (age >=15)
		{
			System.out.println("You are eligibl to apply pre voter id");
			int waitperiod=18-age;
			System.out.println("You are not eligible to apply voter id please wait for "+waitperiod+" more years");
	
		}
		else if (age >=10)
		{
			System.out.println("You are not eligible to apply pre voter id");
			int waitperiod=15-age;
			System.out.println("You are not eligible to apply pre voter id please wait for "+waitperiod+" more years");
	
		}
		else
		{
			int waitperiod=18-age;
			System.out.println("You are not eligible to apply voter id please wait for "+waitperiod+" more years");
		}
	}
	
	public String gender(String genderValue)
	{
		String Gendercode = null;
		switch (genderValue)
		{
		case "Male":
			Gendercode= "M";
			break;
		case "FeMale":
			Gendercode= "F";
			break;
		case "Transgender":
			Gendercode= "T";
			break;
		default:
			Gendercode= "A";
			break;
		}
		return Gendercode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditions c= new conditions();
		c.voteridapply(81,"Female");
	}

}
