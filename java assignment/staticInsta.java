
public class staticInsta {
    public static void main(String[] args) {
        test obj = new test();
        test.testStatic("Static");
        obj.testMethod("Method");
    }
}
class test{
    String name;
    static void testStatic(String name){
        // this.name=name;
        // this keyword is non static and thats why we cannot refer non static inside static method
    }
    void testMethod(String name){
        System.out.println(name);
    }
}