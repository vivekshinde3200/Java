package Iff.Statement;

public class IfElseLadder {

	public static void main(String[] args) {
		
		
		System.out.println("before if else ladder");
		
		int marks=92;
		
		if (marks<35)
		{
			System.out.println("You are failed");
		}
		
		else if (marks >= 35 && marks <= 75)
		{
			System.out.println("You are passed with first class");
		}
		
		else if (marks >= 75 && marks <= 90)
		{
			System.out.println("You are passed with distinction"); 
		}
		else if (marks >= 90 && marks <= 100)
		{
			System.out.println("You are first in the institution");
		}
		else 
		{
			System.out.println("you have entered invalid value");
		}
		
		System.out.println("after else if ladder");

	}

}
