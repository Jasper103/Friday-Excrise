import java.util.Scanner;

class AddingValuesInLoop{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int total = 0;

        /**
         * Number getter
         */
        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        int num = in.nextInt();
        total = total + num;

        /**
         * Looper
         */

        while(num != 0){
            System.out.println("The total so far is " + total);
            System.out.print("Number: ");
            num = in.nextInt();
            total = total + num;
            if(num == 0){
            System.out.println("\n" + "The total is " + total);
            break;
            }
        }
    }
}