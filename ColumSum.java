import java.util.Scanner;

public class ColumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size For Rows And Coloum :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
            System.out.println("Element of "+i+" and "+j);
            matrix[i][j] = sc.nextInt();
           }
        }

       

    for(int i=0; i<c;i++){
         int Sum =0;
        for(int j=0;j<r;j++){
           Sum+=matrix[i][j];
        }
        System.out.println("The Colum sum is :"+Sum);
       
    }

   
      
       
    }
}
