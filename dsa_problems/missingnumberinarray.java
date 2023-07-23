package assignment;
import java.util.*;

public class array2 {
	public static void main(String args[]) {
		System.out.println("enter the size of the array : ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the array elements in the order : ");
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();	
		}
		int temp=0;
		System.out.print("the missing elements in array are : ");
		for(int j=arr[0];j<=arr[size-1];j++) {
			if(arr[temp]==j) {
				temp++;
			}else {
				System.out.print(j+" ");
			}
		}
		
		
	}

}
