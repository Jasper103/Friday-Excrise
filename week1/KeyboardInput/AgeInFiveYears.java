import java.util.Scanner;

class AgeInFiveYears{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        /**
         * Name Scanner
         */
        System.out.print("Hello.  What is your name? ");
        String name = in.next();

        /**
         * Age Scanner
         */
        System.out.print("Hi, " + name + "!  How old are you? ");
        int age = in.nextInt();

        System.out.println("Did you know that in five years you will be " + ((int)age + 5) + "years old?");
        System.out.println("And five years ago you were " + ((int)age - 5)  + "! Imagine that!");




    }
}