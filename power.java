import java.util.Arrays;
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
    
      
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Two Nummbers :");
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println(multiply(x, y));
    System.out.println("Successfull");

  
    


    }
    public static int multiply(int x ,int y){
      if(y==0) return 1;

      return x * multiply(x, y-1);

    }
  }