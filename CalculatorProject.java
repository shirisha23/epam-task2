/**
 * 
 * @author Shirisha23
 *
 */

// calculator program to calculate addition , multiplication , division of numbers

//creating a class CalculatorProject
import java.util.*;

public class CalculatorProject {
	
	// method  to add two numbers
	static int add(int a, int b)
	{
		// a,b are two numbers
		return(a+b);
	}
	
	// method to multiply two numbers
	static int multiply(int a, int b)
	{
		return a*b;
	}
	
	//method to divide two numbers
	static int divide(int a, int b)
	{
		return a/b;
	}
	
	// main method for testing
	public static void main(String[] args)
	{
		System.out.println(add(2,3));
		System.out.println(multiply(2,3));
		System.out.println(divide(6,3));
	}

}
