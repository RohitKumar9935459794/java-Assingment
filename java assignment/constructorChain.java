class chain {
    chain() {
        this(10);
        System.out.println("Default constructor");
    }

    chain(int x) {
        this(10, 20);
        System.out.println("chain for single parameter");
    }

    chain(int x, int y) {
        System.out.println("Chain for double constructor.");
        System.out.println("Sum: " + (x + y));
    }
}

public class constructorChain {
    public static void main(String[] args) {
        new chain();
    }
}
