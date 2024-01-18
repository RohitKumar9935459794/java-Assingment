

public class copyConst {
    public static void main(String[] args) {
        test obj = new test("Anshu");
        test obj2= new test(obj);
        obj.display();
        obj2.display();
    }
}
class test{
    String name;
    test(String name){
        this.name=name;
    }
    test(test a){
        this(a.name);
        System.out.println("Inside Copy constructor");
    }
    void display(){
        System.out.println("Name : "+name);
    }
}