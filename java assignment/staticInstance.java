
class staticInstanceCall{
    String str="instance_variable";
    static String str2="static_variable";
    staticInstanceCall(){
        display();
        System.out.println("Exiting main constructor");
      
    }
    void display (){
        System.out.println("Hello this is instance method");
        System.out.println(this.str);
        displaystatic();
        displaySecondmethod();
    }
    static void displaystatic(){
        System.out.println("Displaying Static method");
        System.out.println("accessing "+ str2);
    }
    void displaySecondmethod(){
        System.out.println("Displaying Second Instance Method");
    }
}
public class staticInstance {
    public static void main(String[] args) {
        new staticInstanceCall();
    }
}
