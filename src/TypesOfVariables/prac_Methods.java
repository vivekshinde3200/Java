package TypesOfVariables;

public class prac_Methods {

int instance;

static int Static;

public void meth() {
	
	System.out.println(instance);
	System.out.println(Static);
	
}
public static void main(String [] args) {
	
	prac_Methods m1 = new prac_Methods();
	m1.meth();
	
}

}
