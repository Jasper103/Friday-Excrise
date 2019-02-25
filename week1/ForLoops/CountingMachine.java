import java.util.Scanner;

class CountingMachine{
    public static void main (String[] args){
        /**
         * Terget getter
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Count to: ");
        int terget = in.nextInt();

        /**
         * Looper
         */
        for(int i = 0; i <= terget; i++){
            System.out.print(i + " ");
            if(i == terget){
                System.out.println(i);
                break;
            }
        }
    }
}