package Bag2.copy;

public class loops {
	
	public void forloop(int intialvalue)
	{
		int next10value=intialvalue+10;
		for(int a=intialvalue;a<=next10value;a++)
		{
			System.out.println(a);
		}
		
		int previous10value=intialvalue-10;
		for(int b=intialvalue;b>=previous10value;b--)
		{
			System.out.println(b);
		}
	}

	public void whileloop(int intialvalue)
	{
		int a=intialvalue;
		int nexttenvalue=intialvalue+10;
		while(a<nexttenvalue)
		{
			
			//a=a+1;
			a+=1;
			
			if(a==1005)
			{
				continue;
			}
			System.out.println(a);
	
		}
	}
	
	public void whileoppcon(int intialvalue)
	{
		int i=intialvalue;
		do
		{
			System.out.println(i);
			i=i+1;
		}while(i<10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loops l = new loops();
		//l.forloop(1000);
		//l.whileloop(1000);
		l.whileoppcon(1);
	}

}
