package Bag2.copy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collectionconcept {
	
	String[] Fruits= {"apple","orange","banana"};
	
	public void listconcept()
	{
		//ArrayList<String> AL = new ArrayList<>();
		LinkedList<String> AL = new LinkedList<>();
		Object AL1 = new ArrayList<>();
		AL.add("apple");
		AL.add("orange");
		AL.add("banana");
		AL.add("apple");
		AL.addFirst("plums");
		AL.addLast("Mango");
		System.out.println(AL);
		AL1=AL.clone();
		//AL.remove(2);
		//AL.remove("Apple");
		//AL.remove("banana");
		AL.set(2, "pineapple");
		System.out.println(AL.size());
		System.out.println(AL);
		Iterator it=AL.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//AL.clear();
		System.out.println(AL.indexOf("pineapple"));
		
		System.out.println(AL);
		
		System.out.println(AL1);
		
	}
	
	public void array()
	{
		System.out.println(Fruits);
		System.out.println(Fruits[0]);
		for(String eachvale :Fruits )
		{
			System.out.println(eachvale);
		}
		
		for(int i=0;i<Fruits.length;i++)
		{
			System.out.println(Fruits[i]);
		}
		//String Fruits[0]="grapes";
		System.out.println(Fruits);
	}
	
	public void set()
	{
		//HashSet <String> AL = new HashSet<>();
		//LinkedHashSet <String> AL = new LinkedHashSet<>();
		TreeSet <String> AL = new TreeSet<>();
		Object AL1 = new HashSet<>();
		AL.add("Apple");
		AL.add("banana");
		AL.add("Apple");
		AL.add("orange");
		AL.add("canberry");
		AL.add("2");
		AL1=AL.clone();
		//AL.remove("2");
		//AL.remove("Apple");
		System.out.println(AL);
		//AL.remove("banana");
		System.out.println(AL.size());
		System.out.println(AL);
		Iterator it=AL.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(AL.contains("bananas"));
		AL.clear();
		if(AL.isEmpty()==true)
			{
			System.out.println("Its cleared");
			}
		
		System.out.println(AL1);
		
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collectionconcept c= new Collectionconcept();
		c.set();
		//c.array();
	}

}
