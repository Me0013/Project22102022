package ro.katy.tutorial;

public class Long {
	
	public static void main(String[] args) {
		
		/*The range of a long is quite large. The long data type is a 64-bit two’s complement integer and is useful 
		for those occasions where an int type is not large enough to hold the desired value.
		
		Syntax: !!!!!11long longVar______________L;
		
		Size: 8 byte (64 bits)
		
		Values: {-9, 223, 372, 036, 854, 775, 808} to {9, 223, 372, 036, 854, 775, 807} (inclusive)
		
		Note: The default value is ‘0’.
		
		Remember: In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, 
		which has a minimum value of 0 and a maximum value of 264-1. 
		The Long class also contains methods like comparing Unsigned, divide Unsigned, etc to support arithmetic operations for unsigned long. */
		
	
		
		//The literal 9223372036854775805 of type int is out of range 
		
		long c = 9223372036854775805L;
		
		//9223372036854775806
		c++; 
		System.out.println(c);
		
		//9223372036854775807
		c++; 
		System.out.println(c);
		
		//-9223372036854775808
		c++; 
		System.out.println(c);
	}

}
