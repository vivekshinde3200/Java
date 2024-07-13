package Iff.Statement;

public class ifStatements {

	public static void main(String[] args) {
		
		  ifpractice(true,40,30);
		 System.out.println("------------- This is the end of First Program--------------------");
		 ifpractice(false,30,50);
		 System.out.println("--------------This is the end of second program-------------------");
		 ifpractice(false,50,50);
		 System.out.println("---------------This is the end of third program-------------------");
		 
	}
	
	
	public static void ifpractice(boolean flag, int a, int b) {
		
		if(flag && a>b)
		{
			System.out.println("All test scripts are passed from 1st program" +"--------->This is the result of first program");
			if(b>=30)
			{
			System.out.println("This is practice of nested if else statements");	
			}
		}
		else if(flag || b>a)
		{
			System.out.println("All test cases are passed from 2nd program ");
		}
		else if(flag || a>=b) 
		{
			System.out.println(" All test scripts are same from A and B");
		}
		
		else
		{
			System.out.println("This is else statement");
		}
		
		
		
		
	}
	

}
