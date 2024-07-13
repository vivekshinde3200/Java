package Operators;

public class ArithmaticOperators {
	
	public static void main(String [] args) {
		
		System.out.println("static methods call directly by method_name");
		addition_st();
		substraction_st();
		multiplication_st();
		division_st();
		division1_st();
		modulous_st();
		
		System.out.println("static methods call by class_name");
		ArithmaticOperators.addition_st();
		ArithmaticOperators.substraction_st();
		ArithmaticOperators.multiplication_st();
		ArithmaticOperators.division_st();
		ArithmaticOperators.division1_st();
		ArithmaticOperators.modulous_st();
		
		
		
		ArithmaticOperators obj = new ArithmaticOperators();
		
		System.out.println("static methods call by object");
		obj.addition_st();
		obj.substraction_st();
		obj.multiplication_st();
		obj.division_st();
		obj.division1_st();
		obj.modulous_st();
		
	    System.out.println("Non static methods calling by object name");
	    
	    obj.addition();
	    obj.substraction();
	    obj.multiplication();
	    obj.division();
	    obj.division1();
	    obj.modulous();		
	}
	
		
	
	
	
	
	
	public void EMIcalculator() {		
		//Formula for EMI calculator 
		//P * R * (1 + R)^N / ((1 + R)^N - 1)
			
		//P is the principal loan amount,
		//r is the monthly interest rate (annual rate divided by 12), 
		//and n is the loan tenure in months.
		
		double P=100000,N=120,R=8.5f; 
	 // double  EMI= P*R*(1+R)*N /Math.pow((1+R)*N-1);
	
		//System.out.println(EMI);
	  
	}
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		public void addition() {
		
		int a=10;
		int b=20;
				
		int c =a+b;
		System.out.println(c);
	}
	
	public void substraction() {
		int a =10;
		int b =20;
		
		int c = a-b;
		System.out.println(c);
	}
	
	public void multiplication () {
		int a=10;
		int b=20;
		
		int c= a*b;
		System.out.println(c);
	}
	
	public void division() {
		int a=10;
		int b=25;
		
		int c =b/a;
		System.out.println(c);
	}
	
	public void division1() {
		float a=10f;
		float b=25f;
		
		float c=b/a;
		System.out.println(c);	
	}
	
	public void modulous() {
		
		int a=39;
		int b=4;
		
		int c=a%b;
		System.out.println(c);
	}
	
	
	
	
	
	
	public static void addition_st() {
		
		int a=10;
		int b=20;
				
		int c =a+b;
		System.out.println(c);
	}
	
	public static void substraction_st() {
		int a =10;
		int b =20;
		
		int c = a-b;
		System.out.println(c);
	}
	
	public static void multiplication_st () {
		int a=10;
		int b=20;
		
		int c= a*b;
		System.out.println(c);
	}
	
	public static void division_st() {
		int a=10;
		int b=25;
		
		int c =b/a;
		System.out.println(c);
	}
	
	public static void division1_st() {
		float a=10f;
		float b=25f;
		
		float c=b/a;
		System.out.println(c);	
	}
	
	public static void modulous_st() {
		
		int a=39;
		int b=4;
		
		int c=a%b;
		System.out.println(c);
	}
}
