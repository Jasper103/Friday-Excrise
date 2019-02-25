import java.util.Scanner;

class MoreUserInputOfData{
    public static void main (String[] args){
        System.out.println("Please enter the following information so I can sell it for a profit!");

        /**
         * Informations Scanners
         */
        Scanner in = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = in.next();

        System.out.print("Last Name: ");
        String lastName = in.next();

        System.out.print("Grade (9-12):");
        int grade = in.nextInt();
        while(grade >= 0){
            if (grade < 9 || grade > 12){
                System.out.println("Grade is suporsed to be within 9 to 12");
                System.out.print("Grade (9-12):");
                grade = in.nextInt();
            }else{
                break;
            }
        }

        System.out.print("Student ID: ");
        int id = in.nextInt();

        System.out.print("Login: ");
        String login = in.next();

        System.out.print("GPA (0.0-4.0): ");
        double gpa = in.nextDouble();
        while(gpa >= 0){
            if (gpa < 0.0 || gpa > 4.0){
                System.out.println("GPA is suporsed to be within 0.0 to 4.0");
                System.out.print("GPA (0.0-4.0): ");
                gpa = in.nextDouble();
            }else{
                break;
            }
        }

        /**
         * Informations
         */
        
        System.out.println("Your information");
        String formatsString = "%15s %s";
        String formatInt = "%15s %d";
        String formatDouble = "%15s %.2f";

        System.out.println(String.format(formatsString, " Login: ", login));
        System.out.println(String.format(formatInt, "ID: ", id));
        System.out.println(String.format(formatsString, "Name: ", firstName + ", " + lastName));
        System.out.println(String.format(formatDouble, "GPA: ", gpa));
        System.out.println(String.format(formatsString, "Grade: ", grade));

    }
}