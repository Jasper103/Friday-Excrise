import java.util.Random;
import java.util.Scanner;

class KeepGuessing{
    public static void main (String[] args){
        /**
         * Random number(answer)
         */
        Random rn = new Random();
        int answer =rn.nextInt(11);



        /**
         * Scanner(guess)
         */

        Scanner in = new Scanner (System.in);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        int guess = in.nextInt();

        /**
         * Conparer
         */

        while(guess >= 0){
            if(guess != answer){
                System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
                System.out.print("Your guess: ");
                guess = in.nextInt();
            }else if(guess > 10){
                System.out.println("Answer is under 10.");
                System.out.print("Your guess: ");
                guess = in.nextInt();
            }else{
                System.out.println("That's right! You're a good guesser. ");
                break;
            }
            
        }
    }
}

