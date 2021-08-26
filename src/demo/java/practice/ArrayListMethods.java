package demo.java.practice;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
	
	public static void main(String[] args)
	{
		ArrayList<String> a= new ArrayList<>();
		a.add("sandeep");
		a.add("vivek");
		
		System.out.println(a);
		
		ArrayList<String> aa= new ArrayList<>();
		aa.add("Kranthi");
		aa.add("Khaleel");
		aa.add("sandeep");
		System.out.println(aa);
		
		
		aa.retainAll(a);
		
		System.out.println("======================");
		
		System.out.println(a);
		System.out.println(a);
	}

}
