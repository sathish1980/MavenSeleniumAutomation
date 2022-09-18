package Bag2.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfileread 
{
	
	String filepath="C:\\Users\\sathishkumars\\eclipse-workspace\\Besant07082022\\inputfiles\\Environment.properties";
	
	public void propfilerread()
	{
		File f = new File(filepath);
		if(f.exists()) 
		{
		try {
			FileInputStream FI =  new FileInputStream(f);
			Properties p = new Properties();
			try {
				p.load(FI);
				System.out.println(p.getProperty("username"));
				System.out.println(p.getProperty("dob"));
				System.out.println(p.getProperty("age"));
				System.out.println(p.getProperty("gender"));
				p.setProperty("qualification", "B.Tech");
				System.out.println(p.getProperty("qualification"));
				
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		propertyfileread p = new propertyfileread();
		p.propfilerread();
	}

}
