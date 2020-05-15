import java.util.Scanner;

public class Factorial_and_Fibonaicc {

    public static void main(String[] args) {
        main();
    }
    static void main() {
        Scanner inp = new Scanner(System.in);
        System.out.println("What You Want to Do ? ");
        System.out.println("1 : Factorial\n2: Fibonaicc");
        int ans = inp.nextInt();

        if (ans == 1) {
            Factorial();
        }
        else if (ans == 2 ) {
            Fibonaicc();


        }
        else {
            System.out.println("Wrong Choice \n Please Try Again\n\n");
            main();
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
    static void Factorial() {
        Scanner Fac = new Scanner(System.in);
        System.out.println("Enter The Number You Want to Find The Factorial :");
        int Facnum = Fac.nextInt();
        if (Facnum == 0) {
            System.out.println("Factorial of 0 is : 1");
        }
        else {
            int n = Facnum;
            while (n > 1) {
                n = n - 1 ;
                Facnum = Facnum * n;
            }
            System.out.println("\n\nThe Factorial is :" + Facnum);
            Completed();
        }
    }

    static void Fibonaicc() {
        Scanner Fib = new Scanner(System.in);
        System.out.println("Till which number you want to print the fibonaicc series");
        int Fibnum = Fib.nextInt();
        if (Fibnum <= 0){
            System.out.println("Fibonaicc Series of -ve number cannot be printed !!!");
        }
        else {
            int a = 0;
            int b = 1;
            int sum;
            System.out.println("\n\nFibonaicc SEries :");
            System.out.println(a);
            System.out.println(b);
            for (int counter=1;counter <= Fibnum;counter = counter +1) {
                sum = a + b;
                System.out.println(sum);
                a = b;
                b = sum;
            }
            Completed();
        }

    }
}
