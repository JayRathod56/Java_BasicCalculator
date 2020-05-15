import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        main();

    }

    static void main() {

        System.out.println("welcome TO Basic Calculator \n\n");
        System.out.println("We Can Do The Following Things\n\n");
        System.out.println("1 : Addition\n2 : Subraction\n3 : Multiplication\n4 : Division\n");
        System.out.println("Enter Your Choice :");
        Scanner input1 = new Scanner(System.in);
        String choice = input1.nextLine();
        if (choice.equals("1") || choice.equals("addition") || choice.equals("Addition")) {
            Addition.mainA();
        } else if (choice.equals("2") || choice.equals("subraction") || choice.equals("Subraction")) {
            Subraction.mainS();
        } else if (choice.equals("3") || choice.equals("Multiplication") || choice.equals("multiplication")) {
            Multiplication.mainM();
        } else if (choice.equals("4") || choice.equals("division") || choice.equals("Division")) {
            Division.mainD();
        } else if (choice.equals("5") || choice.equals("factorial") || choice.equals("Factorial")) {
            Factorial_and_Fibonaicc.Factorial();
        } else if (choice.equals("6") || choice.equals("fibonaicc") || choice.equals("Fibonaicc")) {
            Factorial_and_Fibonaicc.Fibonaicc();
        }        
        else {
            System.out.println("\nWrong Input Please Try Again...\n\n");
            main();
        }
    }

}
