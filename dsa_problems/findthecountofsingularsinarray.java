package assignment;

import java.util.Collections;
import java.util.*;

public class socks {
	static int count=0,sum=0;

	public static void main(String[] args) {
		int array[]=  {10, 20, 20, 10, 10, 30, 50, 10, 20};
		Set<Integer> set=new HashSet<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++)
		{
			set.add(array[i]);
			list.add(array[i]);
		}
		for(Integer x:set)
		{
			int count=Collections.frequency(list,x);
//			if(count==1) {
//				sum=sum+count;
//			}
//			else {
				sum=sum+count/2;
//			}
		}
		System.out.println(sum);

	}

}
