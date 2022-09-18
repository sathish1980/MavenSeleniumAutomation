package Bag2.copy;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class enumvalidation {
	
	enum days 
	{  
		  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  
	
	public void daysvalue()
	{
		String Today=days.TUESDAY.toString();
		//String Today ="Tuesday";
		System.out.println(Today);
		 Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
		    // Traversing elements  
		    Iterator<days> iter = set.iterator();  
		    while (iter.hasNext())  
		      System.out.println(iter.next());  
		   
	}
	
	public void alldata()
	{
		 Set<days> set1 = EnumSet.allOf(days.class);  
	      System.out.println("Week Days:"+set1);  
	}
	
	public void nonof()
	{
		  Set<days> set2 = EnumSet.noneOf(days.class);  
	      System.out.println("Week Days:"+set2);     
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enumvalidation e = new enumvalidation();
		e.daysvalue();
		e.alldata();
		e.nonof();
	}
	

}
