
class test2 {
    int a;
    int b;

    test2() {}
    test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setValues(int a, int b) {
        // this(a, b);
        display();
    }
    void display(){
        System.out.println("a: "+ this.a +"b: "+this.b);
    }
}

class constructorFromMethod {
    public static void main(String[] args) {
        test2 ob = new test2();
        ob.setValues(10, 20);
    }

}