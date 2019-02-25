import java.util.Scanner;

class HowOldAreYouSpecifically{
    public static void main (String[] args){

        /**
         * Informations Scanner
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        String name = in.next();

        System.out.print("Ok, " + name + ", how old are you? ");
        int age = in.nextInt();

        if(age < 16){
            System.out.println("You can't drive.");
        }
        else if(age >= 16 && age <= 17){
            System.out.println("You can drive but not vote.");
        }
        else if(age >= 18 && age <=24){
            System.out.println("You can vote but not rent a car.");
        }
        else{
            System.out.println("You can do pretty much anything.");
        }




    }
}