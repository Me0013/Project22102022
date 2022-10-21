package ro.katy.tutorial;

public class Methods {
	

		
		/*The syntax to declare a method is:

		returnType methodName() {
		  // method body
		}
		Here,
		
		returnType - It specifies what type of value a method returns For example if a method has an int return type then it returns an integer value.
		
		If the method does not return a value, its return type is void.
		methodName - It is an identifier that is used to refer to the particular method in a program.
		method body - It includes the programming statements that are used to perform some tasks. 
		The method body is enclosed inside the curly braces { }.
		 
		
		 *int addNumbers() {
		// code
		}
		In the above example, the name of the method is adddNumbers(). And, the return type is int.
	
				 *
					modifier static returnType nameOfMethod (parameter1, parameter2, ...) {
					  // method body
					}
		Here,
		
		modifier - It defines access types whether the method is public, private, and so on. To learn more, visit Java Access Specifier.
		static - If we use the static keyword, it can be accessed without creating objects.
		
		For example, the sqrt() method of standard Math class is static. Hence, we can directly call Math.sqrt() without creating 
		an instance of Math class.
		
		parameter1/parameter2 - These are values passed to a method. We can pass any number of arguments to a method.
			 * 
				 * 
				 * 
				 * 
				 * */
	
	
	  // create a method
	
		/*public int addNumbers(int a, int b) {
	    int sum = a + b;
	    // return value
	    return sum;
	  }
	  
	  public int difference(int a, int b) {
		  int dif = a - b;
		  return dif;
		  
	  }

	  public static void main(String[] args) {
	    
	    int num1 = 25;
	    int num2 = 15;

	    // create an object of Main
	    Methods obj = new Methods();
	    // calling method
	    int result = obj.addNumbers(num1, num2);
	    System.out.println("Sum is: " + result);
	    
	    int resultDif = obj.difference(num1, num2);
	    System.out.println(resultDif); */
	    
	    
	    //!!! Note: The method is not static. Hence, we are calling the method using the object of the class. 
	    
	    
	    
	   
	  
	
	
	  
	  /*Java Method Return Type
		A Java method may or may not return a value to the function call. We use the return statement to return any value. For example,
		
		int addNumbers() {
		...
		return sum;
		}*/


							
			/*	//create a method
				public static int square(int num) {
				
				 // return statement
				 return num * num;
				}
				
				public static void main(String[] args) {
				 int result;
				
				 // call the method
				 // store returned value to result
				 result = square(20);
				
				 System.out.println("Squared value of 20 is: " + result);
				}
				*/
			
		/*In the above program, we have created a method named square(). The method takes a number as its parameter and returns 
		 the square of the number.
		
		Here, we have mentioned the return type of the method as int. Hence, the method should always return an integer value.*/
	
			  // method defined
			  private static int getSquare(int x){
			    return x * x;
			  }
		
			  public static void main(String[] args) {
			    for (int i = 1; i <= 8; i++) {
		
			      // method call
			      int result = getSquare(i);
			      System.out.println("Square of " + i + " is: " + result);
			    }
			  }
	
} 