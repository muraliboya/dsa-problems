package assignment;
import java.util.*;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size : ");
		int arrsize=sc.nextInt();
		int []arr= new int[arrsize];
		System.out.println("enter the elements : ");
		for(int i=0;i<arrsize;i++) {
			arr[i]=sc.nextInt();
			if(i==0) {
				arr[i]=arr[i];
			}else {
				int cm=arr[i]*arr[i-1];
				arr[i]=cm;
			}
		}
		
		System.out.print("the cummulated array is: ");
		for(int k=0;k<arrsize;k++) {
			System.out.print(arr[k]+" ");}

}
}
