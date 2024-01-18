
import java.util.Scanner;
// program to find peterson Number.
public class petersonNumber {
     static int fact(int n) {
        {
            if (n == 1)
                return 1;
        }
        return n * fact(n - 1);
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
        int ori=a;
        int sum = 0;
        while (a>0) {
            int d=a%10;
            d=fact(d);
            sum+=d;
            a/=10;
        }
        if (sum==ori) {
            System.out.println("Peterson.");
        }else System.out.println("Not peterson.");
        sc.close();
    }
}