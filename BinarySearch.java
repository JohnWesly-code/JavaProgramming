import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Size of An Array:");
        int size = sc.nextInt();
        System.out.println("Enter target no to find in Array:");
        int target = sc.nextInt();
        int[]arr = new int[size];                   //[2,4,6,7,8,9]
        int mid = arr.length /2;

        for(int i=0;i<arr.length;i++){
            System.out.println("The Elements of "+ i+" :");
            arr[i] = sc.nextInt();
        }

      int start , end ;
      if(target<arr[mid]){
        start=0;
        end = mid;
        for(int i = start ;i<end; i++){
            if(arr[i] == target){
                System.out.println("Element Found At index :"+ (i+1));

            }
        }
    }
        else if(target>arr[mid]){
            start = mid+1;
            end = arr.length;
            for(int i =start;i<end;i++){
                if(arr[i]==target){
                     System.out.println("Element Found At index :"+ (i+1));
                }
            }


        }

    }

}
       