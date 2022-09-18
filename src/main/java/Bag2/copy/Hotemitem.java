package Bag2.copy;

public class Hotemitem {
	double idly=150.00;
	double Dosa=200.00;
	double vada=80.00;
	double pongal=100;
	double Rice=10.00;
	double oil=20.00;
	double totalamount=0;
	
	public double taxcali(String[] item1,int item1q)
	{
	for (String eachvalue : item1)
	{
		String itemi=eachvalue.toLowerCase();
		if (itemi.equals("idly"))
		{
		double gtax1=((idly+Rice)*item1q);
		System.out.println(eachvalue + " "+item1q+" quanity requested Rs. "+gtax1);
		totalamount+=gtax1;
		}
		else if (itemi.equals("vada"))
		{
			double gtax1=((vada+oil)*item1q);
			System.out.println(eachvalue + " "+item1q+" quanity requested Rs. "+gtax1);
			totalamount+=gtax1;
		}
		}
	System.out.println("total amount to be paid is :" +totalamount);
	return totalamount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotemitem H = new Hotemitem();
		String item[]={"vada","idly"};
		H.taxcali(item, 3);
	}

}
