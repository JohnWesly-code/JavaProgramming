import java.util.Scanner;

public class GoatLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
          String word = "";
          int pos = 1;

          for(int i=0; i<str.length();i++){
              char ch = str.charAt(i);


            if(ch!=' '){
               word = word+ch;
            }
            if(ch ==' '||i == str.length()-1){
                char firstLetter = str.charAt(0);
                boolean vowel = (firstLetter=='a'||firstLetter=='e'||firstLetter=='i'||firstLetter=='o'||firstLetter=='u'|| firstLetter=='A'||firstLetter=='E'||(firstLetter=='I')||(firstLetter=='O')||(firstLetter=='U'));
                 if(vowel){
                    System.out.print(word + "m");
                 }
                 else{
                    for(int j=1;j<word.length();j++){
                        System.out.print(word.charAt(j));
                    }
                    System.out.print(firstLetter + "m");
                 }

                 for(int k=1;k<=pos;k++){
                    System.out.print("a");
                 }
                 if(i!=str.length()-1){
                    System.out.print(" ");
                 }
                 word="";
                 pos++;
            }
          }

    }
}