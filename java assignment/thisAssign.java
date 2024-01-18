import java.util.Scanner;

class test {
    int length;
    int breadth;

    public void testSet(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}

public class thisAssign {
    public static void main(String[] args) {
        test ob = new test();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        ob.testSet(length, breadth);
        System.out.println("Area: " + ob.area());
        sc.close();
    }
}
