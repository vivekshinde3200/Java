package Test;

public class oops_consept extends students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//child
		oops_consept o1= new oops_consept();
					 o1.test();
					 o1.studentinfo();
					 o1.subjectinfo();
					 o1.Teacherinfo();
					 
				System.out.println("*********");	 
		//parent
		students s1= new students();
				 s1.studentinfo();
				 s1.subjectinfo();
				 s1.Teacherinfo();
				 
				 System.out.println("*********");
		// parent refers to child
		 students s2= new oops_consept();
		 		  s2.studentinfo();
		 		  s2.subjectinfo();
		 		  s2.Teacherinfo();
		 		  
		 		 System.out.println("*********");
		
		 
	}
	
	public void test() {
		System.out.println("This is child class");
	}
}
