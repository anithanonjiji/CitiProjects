import java.util.Scanner;
public class Hangman {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] words = new String[1];
        String word = "";

        int sum = 0;

        System.out.println("Player One, enter a word:");
        String player1_word = sc.next();

        for (int i = 0; i < words.length; i++) {
            words[i] = player1_word;
            word = words[i];
        }

        String underscore = new String(new char[word.length()]).replace("\0", "_");

        System.out.println(underscore);

        int m = 8;

        while (sum < 8 && underscore.contains("_")) {
            System.out.println("Player Two, you have " + m + " guesses left. Enter a guess:");
            String guess = sc.next();


            String new_underscore = "";

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess.charAt(0)) {
                    new_underscore += guess.charAt(0);
                } else if (underscore.charAt(i) != '_') {
                    new_underscore += word.charAt(i);
                } else {
                    new_underscore += "_";
                }
            }

            if(underscore.contains(String.valueOf(guess))) {
                System.out.println("You have already guessed " + "'" + guess + "'.");
                System.out.println(underscore);
            }
            else if (underscore.equals(new_underscore)) {
                m--;
                sum++;
                if(sum < 8){
                    System.out.println(underscore);

                }

            } else {
                underscore = new_underscore;
                System.out.println(underscore);
            }


            if (underscore.equals(word)) {
                System.out.println("Game over. Player Two wins!");
            }
            else if(sum == 8){
                System.out.println("Game over. Player One wins! The word was: " + word);
            }
        }
        sc.close();
    }
}



