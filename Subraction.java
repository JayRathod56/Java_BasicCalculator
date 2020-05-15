import java.util.Scanner;

public class Subraction {
    public static void main(String[] args) {

        mainS();

    }

    static void mainS(){
        try
        {
            Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("Enter first number- ");
            int a = sc.nextInt();
            System.out.print("Enter second number- ");
            int b = sc.nextInt();
            System.out.println("The Subraction is :  "+(a-b));

            Completed();
        }

        catch (Exception e)
        {
            System.out.println("\n" + "Only Numbers Allowed!!!" + "\n\nTry Again!!!\n\n");
            mainS();
        }


    }

    static void Completed () {
        System.out.println("Have You Completed ? :");
        Scanner sc = new Scanner(System.in);
        String ans123 = sc.nextLine();
        if (ans123.equals("y") || ans123.equals("y") || ans123.equals("yes") || ans123.equals("Yes") || ans123.equals("Y"))
        {
            System.out.println("Thankyou for using My Program ^_^");

        }
        else
        {
            BasicCalculator.main();
        }

    }
}
