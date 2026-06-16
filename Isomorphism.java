import java.util.Scanner;

public class Isomorphism {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        int[]map1 = new int[254];
        int[]map2 = new int[254];
        int flag=0;

        for(int i=0; i<word1.length();i++){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            if(map1[ch1]==0 && map2[ch2]==0){
                map1[ch1] = ch2;
                map2[ch2] = ch1;
            }
            else if(map1[ch1]!=ch2 || map2[ch2]!=ch1){
                flag=1;
                break;
            }

        }

        if(flag ==1){
            System.out.println("Not Isomorphic");
        }else{
            System.out.println("Isomorphic");
        }
        

       




    }
}
