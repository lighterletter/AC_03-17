package nyc.c4q.lighterletter;

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner userGuess = new Scanner(System.in);

        SecretWord secretWord = new SecretWord();

        System.out.println("Let's play Hangman!");
        System.out.println("Word:" + secretWord.toString());
        int x = 6;

        boolean rightGuess = false;

        for (int i = 5; i >= 1; i--) {
            System.out.println("Guesses left:" + i);
           char guess = userGuess.next().charAt(0);


            //Checks the user guess against the secret word
            if (secretWord.isLetter(guess)) {
                i += 1;
                secretWord.set(guess);
                System.out.println(secretWord.toString());
                 rightGuess = secretWord.isGuessed();
                System.out.println(Drawing.get(x - i));
            } else
                System.out.println(Drawing.get(x - i));
                System.out.println("Word:" + secretWord.toString());

            //Checks for win or lose.
            if (i==1){
                System.out.println(" You Lost :( ");
                System.out.println(" The word was: " + secretWord.reveal());
            } else if (rightGuess){
                System.out.print(" You Win! :) ");

            }

        }






    }
}
