package objectclasss;

public class ArithmaticCalculations {

	public static void main(String[] args) {

		Human h1 = new Human();
		h1.addition();
		h1.substraction();

		prac_5_7 p1 = new prac_5_7();
		p1.addition();

		ArithmaticCalculations a1 = new ArithmaticCalculations();
		a1.meth_a();

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		ArithmaticCalculations a2 = a1;
		a2.meth_a();

	}

	public void meth_a() {
		Human h1 = new Human();
		// First Session
		h1.a = 20;
		h1.b = 20;
		h1.c = 30;
		h1.D = 40;
		h1.f = 10.30f;
		h1.d = 25.00d;
		System.out.println(h1.a + h1.b + " This is addition of First Session");
		System.out.println(h1.c - h1.d + " This is substraction First Session");
		System.out.println(h1.f + h1.d + " This is addition of decimal numbers First Session");
		System.out.println(h1.f - h1.d + " This is Substraction of decimal numbers First Session");
		h1.addition();
		h1.substraction();
		System.out.println("*************First Session End****************");
		// Second Session
		h1.a = 200;
		h1.b = 200;
		h1.c = 300;
		h1.D = 400;
		h1.f = 100.30f;
		h1.d = 250.00d;
		System.out.println(h1.a + h1.b + " This is addition Second Session");
		System.out.println(h1.c - h1.d + " This is substraction Second Session");
		System.out.println(h1.f + h1.d + " This is addition of decimal numbers Second Session");
		System.out.println(h1.f - h1.d + " This is Substraction of decimal numbers Second Session");
		h1.addition();
		h1.substraction();
		System.out.println("*************Second Session End****************");
		// Third Session
		h1.a = 2000;
		h1.b = 2000;
		h1.c = 3000;
		h1.D = 4000;
		h1.f = 1000.30f;
		h1.d = 2500.00d;
		System.out.println(h1.a + h1.b + " This is addition Third Session");
		System.out.println(h1.c - h1.d + " This is substraction Third Session");
		System.out.println(h1.f + h1.d + " This is addition of decimal numbers Third Session");
		System.out.println(h1.f - h1.d + " This is Substraction of decimal numbers Third Session");
		h1.addition();
		h1.substraction();
		System.out.println("**************Third Session End***************");

		// Fourth Session
		prac_5_7 p1 = new prac_5_7();
		p1.a = 'A';
		p1.b = 'B';
		p1.c = 'C';
		p1.d = 'D';
		System.out.println(p1.a + p1.b + p1.c + p1.d + " These all are the char's in Fourth Session");
		p1.s1 = "I love my india*";
		p1.s2 = "India is my country*";
		System.out.println(p1.s1 + p1.s2 + " This is the addition of the Strings in Fourth Session");
		p1.addition();
		System.out.println("*************Fourth Session End****************");

	}
}
