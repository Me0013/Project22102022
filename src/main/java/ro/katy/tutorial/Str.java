package ro.katy.tutorial;

public class Str {

	public static void main(String[] args) {
		
		//String fname = "Katy";
		
		//System.out.println(fname); 
		/*
		String s1 = "BeginnersBook";
		String s2 = "BeginnersBook";
		
		
	    //creating strings using new keyword
	    String s3 = new String("BeginnersBook");
	    String s4 = new String("BeginnersBook");

	    if(s1 == s2){
	      System.out.println("String s1 and s2 are equal");
	    }else{
	      System.out.println("String s1 and s2 are NOT equal");
	    }

	    if(s3 == s4){
	      System.out.println("String s3 and s4 are equal");
	    }else{
	      System.out.println("String s3 and s4 are NOT equal");
	    }
	    */
	    
	    
	    /*String str = "Beginnersbook";

	    //declaring a char array
	    char arrCh[]={'h','e','l','l','o'};

	    //converting char array arrCh[] to string str2
	    String str2 = new String(arrCh);

	    //creating another java string str3 by using new keyword
	    String str3 = new String("Java String Example");

	    //Displaying all the three strings
	    System.out.println(str);
	    System.out.println(str2);
	    System.out.println(str3);
	    System.out.println(arrCh);
	  
	    System.out.println(arrCh[0]);
	    System.out.println(arrCh.length);
	    
	    String prop = "Hello, my name is Emanuel";
	    int len = prop.length();
	    
	    System.out.println(prop.charAt(0));
	    System.out.println(prop.charAt(len-1));*/
	    
	    
	    // comparing strings vs equals()
	    
	    String s1 = "HELLO"; 
        String s2 = "HELLO"; 
        String s3 =  new String("HELLO"); 
  
        System.out.println(s1 == s2); // true 
        System.out.println(s1 == s3); // false 
        System.out.println(s1.equals(s2)); // true 
        System.out.println(s1.equals(s3)); // true 
        
        //concat
        String a1 = "Welcome";
        String a2 = "Home"; 
        
        System.out.println(a1.concat(" ").concat(a2));
        System.out.println(a1 + " " + a2); 
       
		
        //Methods
        
        //char charAt(int index):It returns the character at the specified index. 
        //Specified index value should be between 0 to length() -1 both inclusive.
        //It throws IndexOutOfBoundsException if index<0||>= length of String
        
        String ex1 = "Mama are mere";
        // spaces are not counted
        System.out.println(ex1.charAt(6));
        
        
        //boolean equals(Object obj): Compares the string with the specified string and returns true if both matches else false.
        String ex2 = "MAMA are mere";
        System.out.println(ex1.equals(ex2));
        
        
        //boolean equalsIgnoreCase(String string): 
        //It works same as equals method but it doesn’t consider the case while comparing strings.
        //It does a case insensitive comparison.
        System.out.println(ex1.equalsIgnoreCase(ex2));
        
        //int compareTo(String string): This method compares the two strings based on the Unicode value of each character in the strings.
        System.out.println(ex1.compareTo(ex2));
        
        
        //int compareToIgnoreCase(String string): Same as CompareTo method however it ignores the case during comparison.
        System.out.println(ex1.compareToIgnoreCase(ex2)); 
        //compareToIgnoreCase() method compares two strings lexicographically and returns 0 if they are equal
        
        
        //boolean startsWith(String prefix, int offset): 
        //It checks whether the substring (starting from the specified offset index) is having the specified prefix or not.
        
        System.out.println(ex1.startsWith("are",5)); // Why
         
        
        //
        //
        //
        //
        //
        //
        //
        //
        // 
        //
        //
        //
        //
        
        
        
        
        
        
        
        
        
        
        
        
		// Class name String => Error 
		
		/* Error: Main method not found in class io.learnstuff.sample.
		String, please define the main method as: public static void main(String[] args) 
		or a JavaFX application class must extend javafx.application.Application*/
		
	}
	
	
	/*Strings are defined as an array of characters. 
	 The difference between a character array and a string in Java is, that the string is designed 
	 to hold a sequence of characters in a single variable whereas, a character array is a collection
	  of separate char type entities. Unlike C/C++, Java strings are not terminated with a null character.

		Syntax: Declaring a string
		
		<String_Type> <string_variable> = “<sequence_of_string>”;*/
	
}
