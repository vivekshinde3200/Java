package MethodWithParameter;

public class ParameterizedMethodsClass2 {

	public void method(ParameterizedMethodsClass p1) {
		p1.student_info();

	}

	public static void main(String[] args) {

		ParameterizedMethodsClass pp1 = new ParameterizedMethodsClass();
		pp1.Name = "Vivek";
		pp1.Roll_no = 57;
		pp1.Address = "Ambajogai";

		ParameterizedMethodsClass pp2 = new ParameterizedMethodsClass();
		pp2.Name = "Vaibhav";
		pp2.Roll_no = 58;
		pp2.Address = "Beed";

		ParameterizedMethodsClass pp3 = new ParameterizedMethodsClass();
		pp3.Name = "Kiran";
		pp3.Roll_no = 59;
		pp3.Address = "Aurangabad";

		ParameterizedMethodsClass2 p2 = new ParameterizedMethodsClass2();

		p2.method(pp1);
		System.out.println("-------------");
		p2.method(pp2);
		System.out.println("-------------");
		p2.method(pp3);
		System.out.println("-------------");
		

	}

}
//creat a non static method and give 
// parameter as class and its variables
// do as sir said and as per photos of
// phones

// ParameterizedMethodsClass and
// ParameterizedMethodsClass2 use these two
// classes
