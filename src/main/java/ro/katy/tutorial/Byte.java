package ro.katy.tutorial;

public class Byte {
	
	public static void main(String[] args) {
		
		/*The byte data type is an 8-bit signed two’s complement integer. The byte data type is useful for saving memory in large arrays.
		
		Syntax: 
		
		byte byteVar;
		Size: 1 byte (8 bits)
		
		Values: -128 to 127
		
		Default Value: 0   */
		
		
		byte a = 126;
		
		//127
		a++; 
		System.out.println(a);
		
		//-128
		a++; 
		System.out.println(a);
		
		//-127
		a++; 
		System.out.println(a);
		
		//-126
		a++; 
		System.out.println(a);
		

		
		
	}
 
}
