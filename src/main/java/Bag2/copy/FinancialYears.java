package Bag2.copy;

public class FinancialYears implements course,Fastrack {
	
	@Override
	public void festivaloffer() {
		System.out.println(instituename);
		System.out.println("Pongal Offer");
		System.out.println("New year Offer");
		
	}
	@Override
	public void summercourse() {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		course F = new FinancialYears();
		F.festivaloffer();
		F.summercourse();
		Fastrack Ft = new FinancialYears();
		Ft.festivaloffer();

	}



	

	

}
