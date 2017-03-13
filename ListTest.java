package abc;
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class ListTest {
	public static void main(String... Args)
	{
		ArrayList List=new ArrayList();
		List.add("test");
		List.add(123);
		List.add(402.56);
		List.add(false);
		System.out.println(List);
		ArrayList List1=new ArrayList();   //new class of interface List
		List1.add(111);
		List1.add(222);
		List1.add(333);
		List.addAll(List1);  // adds the list1 to List
		System.out.println(List1);    
		List.remove(5);
		System.out.println(List); //prints the list
		System.out.println(List.get(2));  // retrieves the data at @nd index
		System.out.println(List.contains(13));   //contains checks if the enclosed value is present
		List.addAll(2,List);  // adds the 'List' after the second index
		System.out.println(List);
		
		
		
		// traversing the array list     METHOD 1
		for(Object obj : List)
		{
			System.out.print(obj+" ");
		}
		
		System.out.println("");
		//traversing the array list     METHOD 2 ITERATOR INTERFACE
		Iterator it=List.iterator();//iterator is a method in Iterator so name not same
		/*
		 * -----public boolean hasNext()
		 * 				checks whether the first object has next and if true
		 * 				it returns true;			
		 * -----public Object Next()
		 * 				when hasNext true then retrieves the value and then 
		 * 				brings it to nec=xt value stored
		 * -----public void remove()
		 * 				
		 */
		while(it.hasNext())
		{
			Object obj=it.next();
			System.out.print(obj+" ");
		}
		System.out.println("");
		
		/*Iterator while fetching moves in forward direction only
		 * so if we want to iterate from both directions 
		 * then we use another Interface ListIterator
		 */
		ListIterator it1=List.listIterator();
		//this is again for transversal
		
		/*
		 * has five methods
		 * ----three existing ones
		 * ----hasPrevious()
		 * 			
		 * ----Previous()
		 */
		System.out.println("Forwards first");
		while(it1.hasNext())
		{
			Object Obj=it1.next();
			System.out.print(Obj +" ");
		}
		System.out.println("");
		System.out.println("backwards now");
		while(it1.hasPrevious())
		{
				Object Obj=it1.previous();
				System.out.print(Obj+" ");
		}
		System.out.println("");
		
		
		
	}
	

}
