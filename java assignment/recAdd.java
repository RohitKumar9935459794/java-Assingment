
public class recAdd {
    public static void main(String[] args) {
        test obj = new test();
        System.out.println("Sum: " + obj.s(10));
    }
}

class test {
    int sum;

    test() {
        this.sum = 0;
    }

    int s(int n) {
        if (n == 1)
            return 1;
        return n + this.s(n - 1);
    }
}