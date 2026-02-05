package pst;

public class Polymorphism {

	public static void main(String[] args) { 
		int a=10,b=20;
		System.out.println("Addition: " + add(a, b));
		System.out.println("Difference: " + diff(a, b));
		System.out.println("Multiplication: " + mul(a, b));
		System.out.println("Division: " + div(a, b));
		System.out.println("Modulus: " + modulus(a, b));
        System.out.print(add(a,b)); 
    }

    public static int add(int c,int d) {
    	return c+d;	
}
    public static int diff(int c,int d) {
    	return c-d;	
    }
    public static int mul(int c,int d) {
    	return c*d;	
    }
    public static int div(int c,int d) {
    	return c/d;	
    }
    public static int modulus(int c,int d) {
    	return c%d;	
    }
	
}
