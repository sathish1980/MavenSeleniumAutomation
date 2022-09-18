package Bag2.copy;

public class sample {
	
	public void alphamatch(char c)
	{
	  if (c=='a'||c=='b'||c=='c'||c=='d'||c=='e'||c=='f'||c=='g'||c=='h'||
          c=='i'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='o'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='u'||c=='v'||
          c=='w'||c=='x'||c=='y'||c=='z')
	  {
		  for(int i=26;i>=1;i--)
		  {
			  System.out.println(i);
		 }
	  }  
	  
	  else
	  {
		  for(int j=1;j<=26;j++)
		  {
			  System.out.println(j);
		  }  
	  }
	}
	
	public void busticketprint(double totcost,String gender,int fseat,int mseat,int tnseat)
	{
		if(gender=="Female")
		{
			ticketcal(tnseat,mseat,gender,totcost);
			
		}
		
		else
		{
			ticketcal(tnseat,mseat,gender,totcost);
		}
	}
	
	public void ticketcal(int tnseat,int fseat,String gender,double totcost)
	{
		System.out.println("1.MODE OF TRANSPORT"+" "+"BUS");
		System.out.println("2.TOTAL SEATs"+" "+tnseat);
		System.out.println("3.Discount SEAT"+" "+fseat);
		System.out.println("4.Gender"+" "+gender);
		System.out.println("5.Cost after discount"+" "+totcost);
	}
	 public static void main(String[]args)
	{
		 sample u=new sample();
		char d='y';
		u.alphamatch(d);
		u.busticketprint(23, "FeMale", 130,2,2);
		
		
	}

}
