import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Size Of An Array :");
       int size = sc.nextInt();
       
       int [] arr = new int[size];

      
       
       for(int i=0 ; i<arr.length;i++){
        System.out.print("Enter Elements " + i +" in An Array :");
           arr[i]  = sc.nextInt();
       }
       int start = 0;
       int end = size-1;

       while (start<end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;

       
       }
       System.out.println(Arrays.toString(arr));

      




        
         






        
    }

}
