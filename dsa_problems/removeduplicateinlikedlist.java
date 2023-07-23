package assignment;

import java.util.*;

public class removeduplicate {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList<Integer> list11= new LinkedList<Integer>();
		LinkedList<Integer> list33=new LinkedList<Integer>();
		Set<Integer> set1=new HashSet<Integer>();
		System.out.println("Enter the number of elements u want to insert");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++)
		{
			list11.add(sc.nextInt());
			set1.add(list11.get(i));
			
		}
		for (Integer x : set1)
		{
            list33.add(x);
		}
		for (Integer y : list33) {
			System.out.print(y+" ");
		}
 
		
		

	}

}
