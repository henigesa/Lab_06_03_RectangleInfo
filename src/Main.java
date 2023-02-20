
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare variables
        int width = 0;
        int length = 0;
        double area;
        double perimeter;
        double crossSection;
        //prompt user to enter the variables
        System.out.println("What is the width of your rectangle?");
        //take the user input
        if (input.hasNextInt()) {
            width = input.nextInt();
            input.nextLine();
        }
        else {
            System.out.println("That is not a valid input. Run the program and try again.");
            System.exit(0);
        }
        System.out.println("What is the length?");
        //take the user input
        if (input.hasNextInt()) {
            length = input.nextInt();
            input.nextLine();
        }
        else {
            System.out.println("That is not a valid input. Run the program and try again.");
            System.exit(0);
        }
        //do math
        area = length * width ;
        perimeter = (length * 2) + (width * 2) ;
        crossSection = java.lang.Math.sqrt((length * length) + (width * width));
        System.out.println("The area of your rectangle is " + area);
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The length of the cross section is " + crossSection);
    }
}