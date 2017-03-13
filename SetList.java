package abc;
import java.util.*;
public class SetList {
	public static void main(String[] Args)
	{
		//does not allow duplicate values in sets
		//the methods used earlier will be used in all
		/*
		 * three classes in Set Interfacei.e these three implement Set interface
		 * ------HashSet
		 * 			will not maintain the insertion order of the object
		 *
		 * ------LinkedHashSet
		 * 			
		 * ------TreeSet
		 */
		
		HashSet list=new HashSet();
		list.add("Test");
		list.add(123);
		list.add(23124.2);
		list.add(false);
		list.add(false);
		
		System.out.println(list);
		
		
		//LINKED HASH SET
		/*
		 * --------It is a subclass of HashSet Class
		 * -------- maintains the insertion order of the object
		 * --------no duplicacy allowed too
		 */
		
		LinkedHashSet list1= new LinkedHashSet();
		list1.add("Test");
		list1.add(123);
		list1.add(23124.2);
		list1.add(false);
		list1.add(false);
		
		System.out.println(list1);
		
		
		
		
	}
	

}
