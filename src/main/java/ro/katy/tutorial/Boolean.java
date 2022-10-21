package ro.katy.tutorial;

public class Boolean {
	
	public static void main(String[] args) {
		
		/*Boolean data type represents only one bit of information either true or false which is intended to represent
		the two truth values of logic and Boolean algebra, but the size of the boolean data type is virtual machine-dependent. 
		Values of type boolean are not converted implicitly or explicitly (with casts) to any other type. 
		But the programmer can easily write conversion code.
		
		Syntax: 
		
		boolean booleanVar;
		Size: Virtual machine dependent
		
		Values: Boolean such as true, false
		
		Default Value: false*/
		
		// example 1
		
		boolean m = true; 
		boolean p = false; 
		
		if ( m == true) {
			System.out.println("M is true");
		}
		if ( p == false) {
			System.out.println("P is false");
		}
		
		
		
		
		// example 2
		int a = 10, b = 30; 
		
		boolean check1 = a == b; 
		
		if (check1 == true) {
			System.out.println(" a is equal to b.");
		} else if (a > b) {
			System.out.println(" a is bigger then b."); 
		} else {
			System.out.println("a is smaller then b.");
			
		}
	
	}

}
