import java.util.Arrays;
import java.util.Scanner;

public class ElementOccurence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Size of An Array:");
        int size = sc.nextInt();
        int[]arr = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("The Elements of "+ i+" :");
            arr[i] = sc.nextInt();
        }

        int count ,flag ;
                                     
        for(int i =0; i<size ; i++){
            count =1;
            flag =0;
            for(int j=0 ; j<i ; j++){
                if(arr[j] == arr[i]){
                    flag++;
                }
            }
            if(flag ==0){
                for(int k =i+1; k<arr.length;k++){
                    if(arr[i] == arr[k] ){
                        count++;

                    }
                }
                System.out.println("The Element :"+arr[i] +"has Occurence of :"+count);
            }

        }
        sc.close();
       
      




        
         






        
    }

}
