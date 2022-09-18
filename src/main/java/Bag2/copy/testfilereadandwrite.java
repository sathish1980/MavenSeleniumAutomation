package Bag2.copy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class testfilereadandwrite {
	
	String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\Besant07082022\\inputfiles\\coursedetails.txt";
	String fileoutpath="C:\\Users\\sathishkumar\\eclipse-workspace\\Besant07082022\\inputfiles\\output.txt";
	
	public void textfilereadeachcharacter() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FI= new FileInputStream(F);
		System.out.println(FI.read());
		System.out.println((char)FI.read());
		
	}
	
	public void textfilereadallcharacter() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FI= new FileInputStream(F);
		int i;
	    while ((i=FI.read()) != -1)
	    {
	      System.out.print((char)i);
	      //Thread.sleep(1000);
	    }
			
	}
	
	public void textfilebyfilereader() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		FileReader FI= new FileReader(F);
		int i;
	    while ((i=FI.read()) != -1)
	    {
	      System.out.print((char)i);
	      //Thread.sleep(1000);
	    }
			
	}
	
	public void textfilebyline() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		FileReader FI= new FileReader(F);
		BufferedReader BF= new BufferedReader(FI);
		String i;
	    while ((i=BF.readLine()) !=null)
	    {
	      System.out.println(i);
	      Thread.sleep(1000);
	    }
			
	}
	
	public void textfileidentifyspecifictext(String texttoSearch) throws IOException, InterruptedException
	{
		File F = new File(filepath);
		FileReader FI= new FileReader(F);
		BufferedReader BF= new BufferedReader(FI);
		String i;
		int counter=0;
		System.out.println("The given keyword to serach is : "+texttoSearch);
	    while ((i=BF.readLine()) !=null)
	    {
	    	counter+=1;
	     //int[] a= {10,20,40,30};# Array
	     String[] eachline=i.split("-");
	     for (int j=0;j<eachline.length;j++)
	     {
	    	 if(eachline[j].equalsIgnoreCase(texttoSearch))
	    	 {
	    		 System.out.println("The given keyword present in line no : "+counter);
	    		 System.out.println("The index of the given value is : "+j);
	 	    	
	    	 }
	    	 
	     }

	     
	      //Thread.sleep(1000);
	    }
			
	}
	
	public void writedata() throws IOException
	{
		String writedate="Besant technologies weekend batch";
		File F = new File(fileoutpath);
		FileOutputStream FS = new FileOutputStream(F);
		FS.write(writedate.getBytes());
		System.out.println("completed");
		FS.close();
	}
	
	public void Filewriterdata() throws IOException
	{
		String writedate="Besant technologies weekend batch by usinf file writer";
		File F = new File(fileoutpath);
		FileWriter FS = new FileWriter(F);
		FS.write(writedate);
		System.out.println("completed");
		FS.close();
	}
	
	public void textfilereadandwrite() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		FileReader FI= new FileReader(F);
		BufferedReader BF= new BufferedReader(FI);
		FileWriter FS = new FileWriter(fileoutpath);
		String i;
	    while ((i=BF.readLine()) !=null)
	    {
	      FS.write(i);
	      
	    }
	    FS.close();
	    System.out.println("completed");	
	}
	
	public void copypaste()
	{
		File f= new File(filepath);
		File fout= new File(fileoutpath);
		try {
			FileUtils.copyFile(f, fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		testfilereadandwrite t= new testfilereadandwrite();
		t.copypaste();
	}

}
