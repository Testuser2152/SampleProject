package demo.java.practice;
import java.util.ArrayList;

public class ExceptionClass {

	public static <E> void main(String[] args) {

		try{
		String C=null;
		C.getClass();
		}
		catch(NullPointerException e)   // child class 
		{
			
		}
		catch(RuntimeException e) {    // Parent class
			
		}
		
		//  Wrong way 
	/*	try{
			String C=null;
			C.getClass();
			}
			catch(RuntimeException e)   // Parent class 
			{
				
			}
			catch(NullPointerException e) {    // child class
				
			}*/
		
		
	}
}
