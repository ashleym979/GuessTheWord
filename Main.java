import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("You will recieve 2-5 different letters and you'll have to guess what they are!");
        System.out.println(" ");
        System.out.println("Please note that these words are just randomized letters and all lowercase");
        System.out.println(" ");
        System.out.println("you have infinite tries :)");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("If you ever need a hint type HINT");
        System.out.println(" ");

        String word= RandomizedWord.random();

        System.out.println("Your word is " +RandomizedWord.length()+" letters long");

        String userGuess="";
        while (!(userGuess.equals(word)))
        {
            System.out.println("Make your guess: ");
            userGuess= scan.nextLine();
            System.out.println(RandomizedWord.check(userGuess));
        }

        System.out.println("Congratulations! You got the word correct!");

    }
}