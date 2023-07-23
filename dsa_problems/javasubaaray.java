import java.io.*;
import java.util.*;

public class Solution {
    static int count=0;
    static int size,sum=0,p=0;
    //static int arr[]=new int[size];

    public static void main(String[] args) {
        
        //static int size,sum=0,p=0;
        //int arr[]=new int[size];
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int a=0;a<size;a++){
            arr[a]=sc.nextInt(); 
            if(arr[a]<0){
                count=count+1;
            }
        }
        
        int z=size-2;
        for(int b=0;b<z+1;b++){
            recursion(--size,++p,arr);
           // --z;
        }
        System.out.println(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    static void recursion(int sizevalue,int temp,int[] arr){
        for(int i=0;i<sizevalue;i++){
            int sum1=0;
            for(int j=i+1;j<=temp+i;j++){
                sum1=sum1+arr[j];
                
            }
            if(((sum1+arr[i])<0)){
                count=count+1;
            }
        }
    }
}
