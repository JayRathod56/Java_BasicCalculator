import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        mainM();

    }

    static void mainM(){
        try
        {
            Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("Enter first number- ");
            int a = sc.nextInt();
            System.out.print("Enter second number- ");
            int b = sc.nextInt();
            System.out.println("The Multiplication is :  "+(a*b));

            Completed();
        }

        catch (Exception e)
        {
            System.out.println("\n" + "Only Numbers Allowed!!!" + "\n\nTry Again!!!\n\n");
            mainM();
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
