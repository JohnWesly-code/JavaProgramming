import java.util.Scanner;

public class SecondLargestArrayElement {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Size Of An Array :");
       int size = sc.nextInt();
       
       int [] arr = new int[size];

      
       
       for(int i=0 ; i<arr.length;i++){
        System.out.print("Enter Elements " + i +" in An Array :");
           arr[i]  = sc.nextInt();
       }

    for(int i = 0; i<arr.length;i++){
        for(int j =0; j<arr.length-i-1 ; j++){
            if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            }

        }

    } 

     for(int no :arr){
            System.out.print(no+" ");
         }

             System.out.println( "The Second Largest is:"+ arr[size-2]);


        
         






        
    }

}
