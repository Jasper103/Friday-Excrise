import java.util.Random;

class DiceDoubles{
    public static void main (String[] args){
    /**
     * dices
     */

    Random rn = new Random();
    int dice1 = rn.nextInt(11);
    int dice2 = rn.nextInt(11);
    int i = 1;

    /**
     * Runner
     */

    while(dice1 >= 0){
        if(dice1 != dice2){
            System.out.println("Roll #1: " + dice1);
            System.out.println("Roll #2: " + dice2);
            System.out.println("The total is " + ((int)dice2 + (int)dice1) + " !");
            dice1 = rn.nextInt(11);
            dice2 = rn.nextInt(11);
            i = i + 1;
        }
        else{
            System.out.println("Roll #1: " + dice1);
            System.out.println("Roll #2: " + dice2);
            System.out.println("The total is " + ((int)dice2 + (int)dice1) + " !");
            System.out.println("This was " + i + "th times");
            break;
            }
        }   
    }
}