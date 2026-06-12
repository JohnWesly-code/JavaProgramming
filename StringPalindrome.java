import java.util.Scanner;

public class StringPalindrome{
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter A string :");

String word1 = sc.nextLine(); 
int start =0; 
int end = word1.length()-1;
boolean isPalindrome = true;

while (start<end) {
    if(word1.charAt(start)!=word1.charAt(end)){
        isPalindrome = false;
       
    }
     start++;
        end--;
    
}
if(isPalindrome){
    System.out.println("Palindrome");
}else{
    System.out.println("Not Palindrome");
}


          
        
    }
}
