import java.util.Scanner;

/**
 * Document this class
 * @version 09/27/22
 * @author 24penry
 */
public class SimpleIOMath {
    private String name; //these are my instance variables
    private int age;
    private int favNumber;

    /**
     * Prompts user for input and stores information in variables
     */
    public void promptUser() {
        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = in.nextLine();
        System.out.print("Enter your age: ");
        age = in.nextInt();
        System.out.print("Enter your favorite number: ");
        favNumber = in.nextInt();
    }


    /**
     * Prints out the modifies information and reprints the inputted information on the screen.
     */
    public void printInfo ()   {
        System.out.println("I\'m gonna teach you how to sing it out \n" +
                        "Come on, come on, come on \n" +
                "Let me tell you what it's all about \n" +
                "Reading, writing, arithmetic \n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is " + name );
        System.out.println("Your age is " + age);
        System.out.println("At your next birthday, you will turn " + (age + 1));
        System.out.println("The first prime factor of " + age + " is: " + smallestPrimeFactor(age));
        System.out.println("Your favorite number is " + favNumber);
        System.out.println("Your favorite number squared is " + (favNumber * favNumber));
        System.out.println("* end of program *");
    }

    private boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    private int smallestPrimeFactor(int num) {
        for(int i = 2; i < Math.sqrt(num)+1; i++) {
            if(isPrime(i))  {
                if(num % i == 0)
                    return i;
            }
        }
        return num;
    }
    /**
     * Main method for class SimpleIOMath
     * @param args command-Line arguments, if needed
     */
    public static void main(String[] args) {
        SimpleIOMath app = new SimpleIOMath();
        app.promptUser();
        app.printInfo();

    }
}
