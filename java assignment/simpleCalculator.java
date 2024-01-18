
import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        int a = sc.nextInt();
        System.out.print("Enter operand: ");
        String op = sc.next();
        System.out.print("Enter second operand: ");
        int b = sc.nextInt();
        char opr = op.charAt(0);
        switch (opr) {
            case '+':
                System.out.println("Sum is " + (a + b));
                break;
            case '-':
                System.out.println("Difference is " + (a - b));
                break;
            case '*':
                System.out.println("Product is " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Divided by 0 not possible.");
                }
                System.out.println("Quotient is " + (a / b));
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Divided by 0 not possible.");
                }
                System.out.println("Remainder is " + (a % b));
                break;

            default:
                System.out.println("Erron expression...");
        }

        sc.close();
    }
}
