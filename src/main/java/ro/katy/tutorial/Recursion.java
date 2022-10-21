package ro.katy.tutorial;

public class Recursion {
	
	    public static void main(String[] args) {
	        int number = 5, result;
	        result = factorial(number);
	        System.out.println(number + " factorial = " + result);
	    }

	    
	    
	    static int factorial( int n ) {
	        if (n != 0)  // termination condition
	            return n * factorial(n-1); // recursive call
	        else
	            return 1;
	    }
}
