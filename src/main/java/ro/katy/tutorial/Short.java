package ro.katy.tutorial;

public class Short {
	
	public static void main(String[] args) {
		/*The short data type is a 16-bit signed two’s complement integer. 
		Similar to byte, use a short to save memory in large arrays, in situations where the memory savings actually matters.
		
		Syntax: 
		
		short shortVar;
		Size: 2 byte (16 bits)
		
		Values: -32, 768 to 32, 767 (inclusive)
		
		Default Value: 0*/
		
	short a = 32767;
	
	//-32768
	a++; 
	System.out.println(a);
	
	//-32767
	a++; 
	System.out.println(a);
	
	//-32766
	a++; 
	System.out.println(a);
		
	}

}
