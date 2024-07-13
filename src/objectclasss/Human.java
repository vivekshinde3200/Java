package objectclasss;

public class Human {

int a;
int b;
int c;
int D;

float f;
double d;

public void addition() {
	int e=a+b+c+D;
	double g=f+d;
	
	System.out.println(e+" This is addition method of all int in human class");
	System.out.println(g+" This is addition method of all decimal in human class");
}

public void substraction() {
	int e=a-b-c-D;
	double g=f-d;
	System.out.println(e+" This is substraction method of all int in human class");
	System.out.println(g+" This is substraction method of all decimals in human class");
	
}

	
}

/*
 ******************HUMAN*********************
	//self practice
	int i ;
	String p;
	char v;
	public void demo() {
		
		System.out.println("My name is Vivek");
	}
	
	public void test() {
		System.out.println("MY surname is Shinde");
	}
	
	public static void main (String [] args) {
		
		Human h= new Human();
		
		h.demo();
		h.test();
		
		
		System.out.println(h.i);
		System.out.println(h.p);
		System.out.println(h.v);
		//System.out.println(h.demo);
		//System.out.println(h.test());
	}
	
	// class prac
	/*
	 	int height;
	String name;
	float weight;
	
	public void canTalk() 
	{
	System.out.println("Human can talk")	;
	}
	
	public void eatFood()
	{
	System.out.println("Human consume food");	
	}
	
	public static void main(String[] args) {
		
		Human obj= new Human();
		Human oo= new Human();
		Human obb= oo;
		Human ss=obj;
		
		obj.canTalk();
		obj.eatFood();
		oo.canTalk();
		oo.eatFood();
		obb.canTalk();
		obb.eatFood();
		ss.canTalk();
		ss.eatFood();
		
		
		obj.height=5;
		obj.weight =44.6f;
		obj.name= "Vivek";
		
		int abcd= obj.height;
		
		System.out.println(abcd);
		System.out.println(obj.height);
		System.out.println(obj.weight);
		System.out.println(obj.name);
		
		System.out.println("*****");
		oo.height=6;
		oo.weight=89;
		oo.name="Shinde";
		System.out.println(oo.height);
		System.out.println(oo.weight);
		System.out.println(oo.name);
		System.out.println("*****");
		
	
		ss.height= 2312312;
		
		System.out.println(ss.height);
 		System.out.println(ss.weight);
		System.out.println(ss.name);
		System.out.println(obj.height);
		
		
		obj.canTalk();
		obj.eatFood();
		
	}
	 */
 
