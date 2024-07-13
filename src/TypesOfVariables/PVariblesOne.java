package TypesOfVariables;

public class PVariblesOne {
	
	
	
	public static void main(String []args) {
	
		//VariablesTypesClass.Static=34;
		System.out.println(VariablesTypesClass.Static);
		VariablesTypesClass.NotMainStatic();
		VariablesTypesClass v1= new VariablesTypesClass();
		v1.Static=234343;
		int l=v1.Static;
		System.out.println("********"); 
		System.out.println(l);
		
		
		
		

	}
}


/*System.out.println(VariablesTypesClass.Static);
VariablesTypesClass.Static=23;
int d = VariablesTypesClass.Static;
VariablesTypesClass.NotMainStatic();	
System.out.println(d);
System.out.println("*********");

VariablesTypesClass v1= new VariablesTypesClass();
v1.i=1;
v1.nonstatic=23;
v1.s=34;
v1.Static=545;
System.out.println(v1.i);
System.out.println(v1.nonstatic);
System.out.println(v1.s);
System.out.println(v1.Static);
v1.sampleMethodNonStatic();
v1.NotMainStatic();		
}

public void meth() {
VariablesTypesClass.NotMainStatic();
//VariablesTypesClass.Static=23;
System.out.println(VariablesTypesClass.Static);
System.out.println(Static);


*/