import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Making Calculator using Java with Case
        System.out.println("Enter any two number: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Enter your choice 1 for add,2 for sub,3 for multi,4 for div,5 for remainder: ");
        int ch = s.nextInt();


        switch(ch)
        {
            case 1: int c=a+b;
                System.out.println("Addition is :"+c);
                break;

            case 2: int d=a-b;
                System.out.println("Substraction is :"+d);
                break;

            case 3: int e=a*b;
                System.out.println("Multiplication is :"+e);
                break;
            case 4: int f=a/b;
                System.out.println("Division is :"+f);
                break;
            case 5: int g=a%b;
                System.out.println("Remainder is :"+g);
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}
