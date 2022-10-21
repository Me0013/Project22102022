package ro.katy.tutorial;

public class Int {
	
	public static void main(String[] args) {
		
				/*Type 4: int
		It is a 32-bit signed two’s complement integer.
		
		Syntax: 
		
		int intVar;
		Size: 4 byte ( 32 bits )
		
		Values: -2, 147, 483, 648 to 2, 147, 483, 647 (inclusive)
		
		Note: The default value is ‘0’
		
		Remember: In Java SE 8 and later, we can use the int data type to represent an unsigned 32-bit integer, 
		which has a value in the range [0, 232-1]. Use the Integer class to use the int data type as an unsigned integer. */
		
		int a = 2147483647;
		
		//-2147483648
		a++; 
		System.out.println(a);
		
		//-2147483647
		a++; 
		System.out.println(a);
		
		
	}

}
