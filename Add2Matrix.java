import java.util.Scanner;

public class Add2Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size For Rows And Coloum :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix1 = new int[r][c];
        int [][] matrix2 = new int[r][c];
        int[][] sum = new int[r][c];
        System.out.println("Matrix 1 Elements:");
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
            System.out.println("Element of "+i+" and "+j);
            matrix1[i][j] = sc.nextInt();
           }
        }
        System.out.println("Matrix 2 Elements:");

         for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
            System.out.println("Element of "+i+" and "+j);
            matrix2[i][j] = sc.nextInt();
           }
        }

       
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                   sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            for(int[] row :sum){
                for(int co:row){
                    System.out.print(co+" ");
                }
                System.out.println();
            }

   
      
       
    }
}
