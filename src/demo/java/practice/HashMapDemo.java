package demo.java.practice;
import java.util.HashMap;
import java.util.WeakHashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Object,String> hm = new HashMap<Object, String>();
		
//		WeakHashMap<Object,String> hm = new WeakHashMap<Object, String>();
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		hm.put(i1, "Kranthi");
		hm.put(i2, "Kalyan");
		
		System.out.println(hm);
		
		i2 = null;
		System.gc();
		System.out.println(hm);
		
		
	}
	
	
	

}
