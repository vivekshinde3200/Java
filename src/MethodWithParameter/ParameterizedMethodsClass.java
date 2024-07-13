package MethodWithParameter;

public class ParameterizedMethodsClass {

	int Roll_no;
	String Name;
	String Address;

	public void student_info() {

		System.out.println("Student role number is " + Roll_no);
		System.out.println("Student name is " + Name);
		System.out.println("Student address is " + Address);

	}

	// 1)
	public static void samplemethod(boolean flag, int a, double d) {

		if (flag && a >= 5) {
			System.out.println("Inside if statement and the statement is true");
		} else {
			System.out.println("Inside else statement and statement is false");
		}

		System.out.println("you have provided double value as " + d);
	}

	// 2)
	public void Addition(int a, int b, boolean flag) {

		int c = a + b;
		if (c > 56 || flag) {
			System.out.println(
					"This is if statement in non-static Addition method and in this statement atleast one is true");
		}

	}

	// 3)
	public void substraction(int b, int c) {

		int a = b - c;
		System.out.println("This is the answer of non-static substraction method");
	}

	// 4)
	public static void division(int a, int b) {

		int c = a / b;

		System.out.println(c + " This is the answer of non-static division method");

	}

	// 5)
	public static void modulous(int a, int b) {

		int c = a % b;

		System.out.println(c + " This is the answer of non-static modulous method");

	}

	// 6)
	public static void multiplication(int a, int b) {

		int c = a * b;

		System.out.println(c + " This is the answer of non-static multiplication method");

	}

	// 7)
	public void sampleconcatmethod(String str, String str1, char a, char b) {

		System.out.println(str + str1 + a + b + "This is the non static sample concat method");
	}

	public static void main(String[] args) {
		// samplemethod(true,4,98334.3434);

		ParameterizedMethodsClass obj = new ParameterizedMethodsClass();

		obj.samplemethod(false, 4, 39584359438.23423);
		obj.Addition(20, 40, false);
		obj.substraction(40, 25);
		obj.division(132, 5);
		obj.modulous(41, 4);
		obj.multiplication(26, 26);
		obj.sampleconcatmethod("This is sample", " Concatication method ", 'A', 'B');

	}

}
