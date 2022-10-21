package ro.katy.tutorial;

public class Arrays {
	
	public static void main(String[] args) {
		
		/*An array is a group of like-typed variables that are referred to by a common name. Arrays in Java work differently than they do in C/C++. The following are some important points about Java arrays. 

		In Java, all arrays are dynamically allocated. (discussed below)
		Since arrays are objects in Java, we can find their length using member length. This is different from C/C++ where we find length using size.
		A Java array variable can also be declared like other variables with [] after the data type.
		The variables in the array are ordered and each has an index beginning from 0.
		Java array can also be used as a static field, a local variable, or a method parameter.
		The size of an array must be specified by an int value and not long or short.
		The direct superclass of an array type is Object.
		Every array type implements the interfaces Cloneable and java.io.Serializable.*/
		
		
		//An array is a collection of similar types of data.
		
		String[] array = new String [100]; 
		//Here, the above array cannot store more than 100 names. The number of values in a Java array is always fixed.
		
		/*dataType[] arrayName;
		dataType - it can be primitive data types like int, char, double, byte, etc. or Java objects
		arrayName - it is an identifier*/
		
	
		
		/*In Java, we can declare and allocate the memory of an array in one single statement. For example,
	
					double[] data = new double[10];*/
		
		/*In Java, we can initialize arrays during declaration. For example,
	
					//declare and initialize and array
					int[] age = {12, 4, 5, 2, 5};*/
						
		
		   // create an array
		   int[] age = {12, 4, 5, 2, 5};

		   // access each array elements
		   System.out.println("Accessing Elements of Array:");
		   System.out.println("First Element: " + age[0]);
		   System.out.println("Second Element: " + age[1]);
		   System.out.println("Third Element: " + age[2]);
		   System.out.println("Fourth Element: " + age[3]);
		   System.out.println("Fifth Element: " + age[4]);
		   
		   
		   System.out.println("Using for Loop:");
		   for(int i = 0; i < age.length; i++) {
		     System.out.println(age[i]);
		   
		 }	
		   System.out.println("Using for-each Loop:");
		   for(int a : age) {
		     System.out.println(a);
		
		
	}
}
	
}


