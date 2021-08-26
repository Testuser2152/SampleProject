package demo.java.practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args)
	{
		HashMap<Integer, String> h1= new HashMap<Integer, String>();
		h1.put(1, "sandeep");
		h1.put(2, "balaji");
		h1.put(3, "yugenghar");
		
		Iterator it= h1.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pairs=(Entry) it.next();
			System.out.println(pairs.getKey()+"     "+pairs.getValue());
		}

		ArrayList<Integer> l1=new ArrayList<>(h1.keySet());
		
			System.out.println(l1);
		
		ArrayList<String> l2=new ArrayList<>(h1.values());
		System.out.println(l2);
		
	}
}
