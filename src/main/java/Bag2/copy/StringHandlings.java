package Bag2.copy;

public class StringHandlings {
	
	static String name = " sathish kumar R ";
	String Institution = "sathish kumar R";
	//String Institution = "Besant Technology";
	String Filename = "sample.XLSX ";
	
	public void stingconcept()
	{
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.compareTo(Institution));
		System.out.println(name.equals(Institution));
		System.out.println(name.equalsIgnoreCase(Institution));
		System.out.println(name.charAt(5));
		System.out.println(Institution.indexOf("R"));
		System.out.println(name.substring(3,12));
		System.out.println(name.substring(3));
		System.out.println(name.startsWith(" sathis"));
		System.out.println(name.endsWith("r"));
		System.out.println(name.trim());
		System.out.println(name.replace(" ",""));
		System.out.println(name.replace("a","A"));
		//if(name.compareTo(Institution) == 0)
		
		int filenameLength=Filename.trim().length();
		int dotposition=Filename.indexOf(".");
		System.out.println(dotposition);
		String ActualFilename=Filename.substring(dotposition+1);
		System.out.println(ActualFilename);
		if(ActualFilename.trim().toLowerCase().equals("txt"))
		{
			System.out.println("This is text file");
		}
		else if(ActualFilename.trim().toLowerCase().equals( "xlsx"))
		{
			System.out.println("This is Excel file");
		}
		else if(ActualFilename.trim().toLowerCase().equals("xml"))
		{
			System.out.println("This is xml file");
		}
		else
		{
			System.out.println("This is a invalid file");	
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringHandlings s = new StringHandlings();
		s.stingconcept();
	}
	

}
