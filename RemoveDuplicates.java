import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Size of An Array:");
        int size = sc.nextInt();
        
       
        int[]arr = new int[size];                   //[2,4,6,7,8,9]
        
        for(int i=0;i<arr.length;i++){
            System.out.println("The Elements of "+ i+" :");
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        int []temp = new int[arr.length];
            int uniqueCount = 0;

            for(int i =0; i<arr.length-1;i++){
                if(arr[i]!= arr[i+1]){
                    temp[uniqueCount] = arr[i];
                    uniqueCount++;

                }
            }
            temp[uniqueCount] = arr[arr.length-1];
             uniqueCount ++;

             int [] uniqueArr = new int[uniqueCount];
             for(int i =0; i<uniqueCount ; i++){
                uniqueArr[i] = temp[i];
             }

             System.out.println("After removing Duplicates :"+ Arrays.toString(uniqueArr));



    }

}