
public class outerinnerClass {
    public static void main(String[] args) {
        testOuter obj = new testOuter();
        testOuter.innerTest obj2 = obj.new innerTest("Anshu", 123);
        obj.display();
        obj2.display();
    }
}

class testOuter {
    String str;
    int x;

    void display() {
        System.out.println("Value of Str: " + str);
        System.out.println("Value of X: " + x);
    }

    class innerTest {
        innerTest(String str, int x) {
            testOuter.this.str = str;
            testOuter.this.x = x;
        }

        void display() {
            System.out.println("Inner Value of Str: " + str);
            System.out.println("Inner Value of X: " + x);
        }
    }
}