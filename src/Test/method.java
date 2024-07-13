package Test;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();

		method a = new method();
		a.add1();
		// sum(10000,400000,600000);
		multiplex();

		method g = new method();
		g.gym();

		mul();
		rumba(20, 40);
		method s1 = new method();
		s1.String("Subodh ", "Archna");
		method m3 = new method();
		m3.some();
		m3.add10(10, 20, 30, " Finally we got answer");
		subject(10, 20, 50);
		add11();
		String s = "I love my country";
		System.out.println(s);
	}

	public static String str(String s) {

		return s;
	}

	public static int add11() {
		int i = 10;
		int j = 20;
		int k = 30;
		int z = i + j + k;
		System.out.println(i);
		return i;
	}

	public static void subject(int i, int j, int k) {
		int s = i + j + k;
		System.out.println("Subject is  " + s);
	}

	public void some() {
		int i = 10;
		int j = 20;
		int k = i * j;
		System.out.println("The answer is  " + k);
	}

	public void add10(int i, int j, int k, String s) {
		int z = i + j + k;
		System.out.println("The addition of add10 is " + z + s);
	}

	public void String(String s, String n) {
		System.out.println("The result is " + s + n);
	}

	public static void rumba(int i, int j) {
		int k = i + j;
		System.out.println("The Addition is " + k);
		int l = i - j;
		System.out.println("The Subtraction is " + l);
		int m = i * j;
		System.out.println("The Multiplication is " + m);
		int n = i / j;
		System.out.println("The Division is " + n);
	}

	static void add() {
		// TODO Auto-generated method stub
		System.out.println("I Can I Will");
	}

	void add1() {

		System.out.println("I will also join");

	}

	public static void sum(int i, int j, int k) {
		int z = i + j + k;
		System.out.println(z);
	}

	public static void multiplex() {
		System.out.println("To watch cinema's");
	}

	public void gym() {
		System.out.println("To do Exercize");
	}

	public static void mul() {
		int sum = 0;
		for (int i = 0; i <= 40; i++)
			sum = sum + i;
		System.out.println(sum);
	}
}

/*
 * add(10,20); mul (20,10); sub (10,20); div (20,2); int i=add1(10,30);
 * System.out.println(i); System.out.println(add1(40,50)); int m=add2(20,30,40);
 * System.out.println(m);
 * 
 * method m1=new method(); int o=m1.add3(10, 20, 30); System.out.println(o);
 * 
 * String d=hello("Java"); System.out.println(d);
 * 
 * System.out.println(sum(40)); }
 * 
 * public static void add(int i,int j) { int k=i+j; System.out.println(k); }
 * 
 * public static void mul(int i,int j) { int k=i-j; System.out.println(k); }
 * public static void sub(int i,int j) { int k=i*j; System.out.println(k); }
 * public static void div(int i,int j) { int k=i/j; System.out.println(k); }
 * 
 * 
 * public static int add1(int i,int j) { int k=i+j; return k; }
 * 
 * public static int add2(int i,int j,int l) { int k=i+j+l; return k; }
 * 
 * public int add3(int i,int j, int l) { int k= i+j+l; return k;
 * 
 * 
 * }
 * 
 * public static String hello(String s) { return "Hello +s"; } public static int
 * sum(int m) { int sum=0; for(int i=0;i<=40;i++) { sum=sum+i; } return sum;
 */
