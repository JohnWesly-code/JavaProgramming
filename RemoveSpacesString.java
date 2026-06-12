import java.util.Scanner;

public class RemoveSpacesString{
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter A string :");

String word1 = sc.nextLine(); 
String result ="";

for(int i=0;i<word1.length();i++){
    char ch = word1.charAt(i);

    if(ch!=' '){
        result = result+ch;
    }
}
System.out.println(result);



          
        
    }
}
