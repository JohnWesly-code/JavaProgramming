import java.util.Arrays;
import java.util.Scanner;

public class PrintDuplicates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Size of An Array:");
        int size = sc.nextInt();
        
       
        int[]arr = new int[size];                   //[2,4,6,7,8,9]
        
        for(int i=0;i<arr.length;i++){
            System.out.println("The Elements of "+ i+" :");
            arr[i] = sc.nextInt();
        }
        
        for(int i =0;i<arr.length ; i++){
            boolean isFirstDuplicate = true;

            for(int j =0; j<i ; j++){
                if(arr[j]== arr[i]){
                    isFirstDuplicate = false;
                    break;
                }
            }

            if(isFirstDuplicate){
                for(int k =i+1; k<arr.length ; k++){
                    if(arr[i] == arr[k]){
                        System.out.println("The Duplicate Elements are :"+ arr[i]);
                        break;
                    }
                }
            }
        }

      

    }

}