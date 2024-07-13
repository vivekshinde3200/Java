package TypesOfVariables;

public class VariablesTypesClass {
	int i;
    int s;
    int nonstatic;
    static int Static=309876544;
    static int Y=29;

	public static void NotMainStatic() {
		
		
	
		System.out.println();
	//	System.out.println(i);
	//	System.out.println(s);
	//	System.out.println(nonstatic);
		System.out.println(Static);	
		System.out.println("This is static NotMain method");
		Static=3434324;
		
		
		
	}
	
	public void sampleMethodNonStatic() {
		System.out.println(i);
		System.out.println(s);
		System.out.println(nonstatic);
		System.out.println(Static);
		System.out.println("This is non static sampleMethod");	
	}
	
	public static void main(String []args) {
		VariablesTypesClass obj= new VariablesTypesClass();
		obj.sampleMethodNonStatic();
		obj.NotMainStatic();
	}

}
