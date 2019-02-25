import java.util.Scanner;

public class NameAgeSalary{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

    /**
     * Name Scanner
     */
    System.out.println("Hello.  What is your name?");
    String name = in.next();

    /**
     * Age Scanner
     */
    System.out.println("Hi, " + name +  ". How old are you?");
    int age = in.nextInt();
    
    /**
     * income Scanner
     */
    System.out.println("So you're " + age + ", eh? That's not old at all!");
    System.out.println("How much do you make, " + name);
    int income = in.nextInt();

    System.out.println( income + " ! I hope that's per hour and not per year! LOL!");
    }
}