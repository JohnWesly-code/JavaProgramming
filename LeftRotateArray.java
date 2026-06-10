import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Size of An Array:");
        int size = sc.nextInt();
        System.out.println("Enter The K th Number To Rotate:");
        int k = sc.nextInt();
        int[]arr = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("The Elements of "+ i+" :");
            arr[i] = sc.nextInt();
        }

       int []result = new int[arr.length];

       for(int i =0; i<arr.length; i++){
        result[i] = arr[(i +k)%arr.length];
       }

       for(int no:result){
        System.out.print(no + " ");
       }
      




        
         






        
    }

}
