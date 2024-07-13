package Iff.Statement;

public class If_statement_2 {

	public static void main(String[] args) {
		
		int a=98;
		int b=93;
		int c=303;
		
		
		If_statement_2 obj= new If_statement_2();
		obj.mixmethod(a, b, c); // took this variables from upside so we can use the variables which are initialized 
		//in the method.
		System.out.println("End of first method");
		mixmethod(10,50,50);
		System.out.println("End of second method");
		If_statement_2.mixmethod(0, 0, 0);
		System.out.println("End of third method");
		obj.swapping(345, 987);
		System.out.println("End of fourth method");

	}
	
	public static void mixmethod(int a, int b, int c) {
		
		if  (a>b && c>=a)
		{
			System.out.println("This is if statement");
			a+=5;
			System.out.println(a+ " a+=5");
			a-=5;
			System.out.println(a+ " a-=5");
			c=a++;
			System.out.println(c+ " c=a++");
			System.out.println(a+ " c=a++");
		}
		else if (b>a || b>=c) 
		{
			 String str= (b>=a?"B is greater than equal to a":"B is less than a");
			 System.out.println(str);
		}
		
		else
		{
			System.out.println("This is else statement");
		}
		
	}
	
	public void swapping(int a, int b) {
		
		// for ex a=345 and b=987
		a+=b;    //a=a+b  = a= 10+20 = a=30
		b=a-b;   //b=a-b  = b= 30-20 = b=10
		a-=b;	 //a=a-b  = a= 30-10 = a=20
		
		System.out.println("This the swapping program without using the third variable");
		System.out.println(a+" This is the value of a");
		System.out.println(b+" This is the value of b");
		
		int c;
		
		c=b;  // c=10
		b=a;  // b=20
		a=c;  // a=20
		
		System.out.println("This the swapping program with using third variable");
		System.out.println(a +" This is updated or swapped value of a");
		System.out.println(b+ " This is updated or swapped value of b");
		
		
		
		
		
	}
	
	
	
	

}



/*
 * int age=17;
 * 
 * 
 * String a= (age>=18)?"you can vote in india":"You can not vote in India";
 * System.out.println(a);
 * 
 * System.out.println("---------------------------------");
 * 
 * 
 * if(age>=18) { System.out.println("you can vote in India"); } else {
 * System.out.println("You can not vote in India"); }
 */
/*
 * System.out.println("Before If Statement");
 * 
 * int a=60;
 * 
 * if(a<50) { System.out.println("This is True"); } else {
 * System.out.println("This is false"); }
 * 
 * System.out.println("After If Statement");
 */