import java.util.Random;
import java.util.Scanner;

 public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String [] wordList = {"adam ","abraham","david","moses","peter","paul","joshua","solomon","josiah"};

        int playerScore = 0;
        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.println("Welcome To The Bible Game ! Find The Correct Bible Word !");

            String word = wordList[rand.nextInt(wordList.length)];
            String scrambledWord = scrambleWord(word, rand);
            System.out.println("The Scrambled Bible Word is : "+ scrambledWord);
            int attempt = 3;
            boolean wordGuessed = false;

            while (attempt>0 && !wordGuessed) {
                System.out.println("Your Guess :");
                String playerGuess = sc.nextLine();

                if(playerGuess.equalsIgnoreCase(word)){
                    System.out.println("Correct Appa ! You Have Found  The  Bible Word ");
                    playerScore++;
                    wordGuessed = true;
                }
                else{
                    attempt --;
                    System.out.println("Wrong attempt ! remaining attempt :"+attempt);
                }
            }
            if(!wordGuessed){
                System.out.println("The Correct  Bible Word was :"+word);
               
            }
            System.out.println("Your Current Score is :"+playerScore);
            System.out.println("Do you Want To play Again (yes/no) :");
            String response = sc.nextLine();
           
            keepPlaying = response.equalsIgnoreCase("yes");
           




            
        }
    }

    
        public static  String scrambleWord (String word , Random rand){

            char[]letters = word.toCharArray();
            for(int i = 0; i< letters.length ; i++){
                int j = rand.nextInt(letters.length);
                char temp = letters[i] ;
                letters[i] = letters[j];
                letters[j] = temp ;


            }

           return new String(letters);
        }

   
} 