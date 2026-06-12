import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter A string :");

String word1 = sc.nextLine();  

for(int i=word1.length()-1; i>=0; i--){
    char ch = word1.charAt(i);
    System.out.print(ch +" ");
  
}
           
        
    }
}
