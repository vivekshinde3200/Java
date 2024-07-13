package MethodWithParameter;

public class InterestRateCalculator {

	public void simpleInterestcal(int principle, float rateofInterest, int Time) {
		 
		float SI=(principle*rateofInterest*Time)/100;
		float TA=SI+450000;
		System.out.println("The Simple Interest is "+ SI);
		System.out.println("The Total amount is "+ TA);
	}
	

	public void compoundInterestcal(int principle, float rateofInterest, int year) {
		 
		float CI= (principle*rateofInterest/100);
		
		
	}

	
	public static void main(String []args) {
		
		InterestRateCalculator obj= new InterestRateCalculator();
		obj.HomeLoanInterestcal(3000000, 0.0075f, 240);
		obj.simpleInterestcal(450000, 28, 12);
		obj.CarloanEMI(300000, 9, 36);
	}
	public void HomeLoanInterestcal(int P, float R, float N) {
		
		//float EMI= P*R*(1+R)^N/((1+R)^N-1);
		
		float EMI= P*R*(1+R)*N/((1+R)*N-1);
		
	System.out.println("The EMI for Home Loan is "+EMI);
	//
	}
	
	public void CarloanEMI(float cp, float roi, float Nom) {
		
		float e=cp*roi*(1+roi)*Nom/((1+roi)*Nom-1);
		
		System.out.println("Your Car EMI is :"+ e);
		 
		
	}
	
	public void PersonalLoanInterestcal(int homeloanamount, float rateofInterest, int LoanTenure) {
		 
		
	}
	
	
}
