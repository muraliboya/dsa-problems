package assignment;
import java.util.*;

public class mergeandsort
{
	
	public static void main(String args[]) 
	{
		LinkedList<Integer> list1= new LinkedList<Integer>();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		LinkedList<Integer> list3=new LinkedList<Integer>();
		list1.add(25);
		list1.add(35);
		list1.add(12);
		list1.add(4);
		list1.add(36);
		list1.add(48);
		list2.add(2);
		list2.add(8);
		list2.add(32);
		list2.add(22);
		list2.add(45);
		list2.add(63);
		list2.add(49);
		List list=new ArrayList();
		for(int i=0;i<list1.size();i++) 
		{
			list.add(list1.get(i));
			
		}
		for (int j=0;j<list2.size();j++)
		{
			list.add(list2.get(j));
		}
		Collections.sort(list);
		
		for(int k=0;k<list.size();k++)
		{
			list3.add((Integer) list.get(k));
			
		}
		for(int l=0;l<list3.size();l++)
		{
			System.out.print(list3.get(l)+" ");
		}
		
		
	}
}

