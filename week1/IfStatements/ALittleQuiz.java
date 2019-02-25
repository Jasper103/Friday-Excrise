import java.util.Scanner;

class ALittleQuiz{
    public static void main (String[] args){


        Scanner in = new Scanner(System.in);
        int correct = 0;

        /**
         * Beginning of quiz
         */
        System.out.println("Are you ready for a quiz?(y/n) ");
        String yn = in.next();

        if(yn == "y"){
            System.out.println("Okay, here it comes!");
        }
        else if(yn == "n"){
            System.out.println("That means 'yes' right?");
            System.out.println("Okay, here it comes!");
        }
        else{
            System.out.println("Well, whatever.");
            System.out.println("here it comes!");
        }

        /**
         * Quiz1
         */

        System.out.println("Q1) What is the capital of Alaska?");
        System.out.println(String.format("%20s", "1) Melbourne" ));
        System.out.println(String.format("%20s", "2) Anchorage" ));
        System.out.println(String.format("%17s", "3) Juneau" ));
        System.out.print("> ");

        /**
         * Answer Scanner for 1
         */
        int an1 = in.nextInt();

        if(an1 == 3){
            System.out.println("That's right!");
            correct = correct + 1;
        }
        else if(an1 == 1 && an1 == 2)
        {
            System.out.println("Incorrect! the answer was: 3) Juneau");
        }
        else{
            System.out.println("I expected you'd be kidding");
        }

        /**
         * Quiz2
         */

        System.out.println("Q2) Can you store the value " + "cat" +" in a variable of type int?");
        System.out.println(String.format("%13s", "1) Yes" ));
        System.out.println(String.format("%12s", "2) No" ));
        System.out.print("> ");

        /**
         * Answer Scanner for 2
         */
        int an2 = in.nextInt();

        if(an2 == 1){
            System.out.println("Sorry, " + "cat" + " is a string. ints can only store numbers.");
        }
        else if(an2 == 2)
        {
            System.out.println("... well, you can do that someday. keep it up.");
        }
        else if(an2 == 3){
            System.out.println("OH MY GOD you solve this. this isn't first time, isn't it?");
            correct = correct + 1;
        }
        else{
            System.out.println("Hahaha. That's hilarious. So what?");
        }

        /**
         * Quiz3
         */

        System.out.println("Q3) What is the result of 9+6/3?");
        System.out.println(String.format("%13s", "1) 5" ));
        System.out.println(String.format("%14s", "2) 11" ));
        System.out.println(String.format("%16s", "3) 15/3" ));
        System.out.print("> ");

        /**
         * Answer Scanner for 3
         */
        int an3 = in.nextInt();

        if(an3 == 2){
            System.out.println("That's right!");
            correct = correct + 1;
        }
        else if(an3 == 1 && an1 == 3)
        {
            System.out.println("Incorrect! the answer was: 2) 11");
        }
        else{
            System.out.println("Okay, you don't give a shit to this quiz huh?");
        }


        /**
         * result
         */
        System.out.println("Overall, you got " + correct + " out of 3 correct. Thanks for playing!");

    }
}