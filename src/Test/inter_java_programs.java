package Test;

public class inter_java_programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub"

		/*//1.Write a function to reverse a number in java?
		int a=12345,rem,rev=0;
		while(a !=0) 
		{
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
		}
		System.out.println(rev);
		System.out.println("********");

		//2.Write a function to reverse a String in java without reverse method?
		String s="Vivek";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		System.out.println(s1);}
		
		System.out.println("********");
		
		//3.Wap to check the number is prime of not.
		int num=7,count=0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0);
			{
				count=count+1;
			}
		}
		if(count>0) {
				System.out.println(num +" is prime");
					}
		else {
			System.out.println(num+" is not prime");
			 }
		System.out.println("********");
		
		//4.WAP 1-100 prime numbers
		
		int temp=0;
		for(int i=1;i<=100;i++) {
			for(int j=2;j<=i-1;j++) 
			{
				if(i%j==0) 
				{
				temp=temp+1;	
				}
			}
			if(temp==0)
				{
			System.out.println(i);	
				}
			else
				{
				temp=0;
				}
		}
		System.out.println("********");
		
		
		//5.WAP to find out max, min values from Array?
		//max
		int p[]= {20,20,80,40,28,40,60,240,35,21};
		int max=20;
		for(int i=1;i<p.length;i++)
		{
			if(p[i]>max)
			{
				max=p[i];
			}
		}
		System.out.println("Max Value is "+max);
		int min=20;
		for(int j=p.length-1;j>0;j--)
		{
			if(p[j]<min)
			{
				min=p[j];
			}
		}
		System.out.println("Min Value is "+min);
		System.out.println("********");
		
		//6.check given string is palindrome of not?
		String x="MADAM";
		String x1="";
		for(int i=x.length()-1;i>=0;i--)
		{
			x1=x1+x.charAt(i);
			
		}System.out.println(x1);// print sout statement out of the kurly bracket.
		System.out.println("**********");	
		//7.Write a java Program for Fibonacci series?
		
		int m=0,n=1,o;
		for(int i=1;i<=10;i++) {
			o=m+n;
			System.out.println(o);
			m=n;
			n=o;
		}
		System.out.println("**********");
		
		
		//8.WAP of fact 1-5
		
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
		System.out.println("*******");
		
		//	Write a Java Program to find the duplicate characters in a string?
	
		String z="Vivek";
		int length= z.length();
		char[] ch=z.toCharArray();
		for(int i=0;i<length;i++)
			for(int j=i+1;j<length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate characters are: "+ch[j]);
					break;
				}
			}
		
		System.out.println("*******");
		//	How to find the sum of all digits of a number in java?
		
		int number=1234;
		int sum=0;
		
		while(number>0)
		{
			sum=sum+number%10;
			number=number/10;
		}
		System.out.println("Sum of digits in a number :"+sum);
		
		System.out.println("******");*/
		//	Count number of words in string?
		
		
		
		//1.Write a function to reverse a number in java?
		
	
		System.out.println("*******");
		
		//2.Write a function to reverse a String in java without reverse method?

		
		
		//3.Wap to check the number is prime of not.
			
		//4.WAP 1-100 prime numbers
			System.out.println("*******");
		//5.WAP to find out max, min values from Array?

	
		
			System.out.println("*******");
		//6.check given string is palindrome of not?
				
			
			System.out.println("*******");
		//7.Write a java Program for Fibonacci series?
			
		
					
				
			
		System.out.println("*******");
		//8.WAP of fact 1-5
		
	
		for(int i=1;i<=10;i++)
		{
			int sum=0;
			sum=sum+i;
			System.out.println(sum);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
