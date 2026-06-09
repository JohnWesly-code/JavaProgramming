import java.util.Scanner;

public class LargestArrayElement {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Size Of An Array :");
       int size = sc.nextInt();
       
       int [] arr = new int[size];

      
       
       for(int i=0 ; i<arr.length;i++){
        System.out.print("Enter Elements " + i +" in An Array :");
           arr[i]  = sc.nextInt();


       }

       int max = arr[0];

       for(int i =0; i<size ; i++){
        if(arr[i]>max){
            max = arr[i];
        }
       }
       System.out.println("Max Is :"+ max);






        
    }

}
