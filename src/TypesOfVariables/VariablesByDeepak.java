package TypesOfVariables;

public class VariablesByDeepak

{
	int a=10;
	static int as=5;
	
	public void nonStat() {
		
	
		VariablesByDeepak.as=23;
		System.out.println(a);
		System.out.println(as);
	
	}
	
	public static void main() {
		
		
		VariablesByDeepak obj = new VariablesByDeepak();
		obj.a=10;
		obj.as=23423;
		
		VariablesByDeepak.as=10;
		System.out.println(obj.a);
		System.out.println(as);
		System.out.println(VariablesByDeepak.as);
		obj.nonStat();
		
		
		
	}
	
	 

}
