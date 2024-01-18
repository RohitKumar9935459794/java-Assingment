
class rectangle{
    int length;
    int breadth;
    int factor=2;
    rectangle set(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        return this;
    }
    void display(){
        System.out.println("Factor by 2: \nLength-> "+ (this.length*this.factor) + 
                            "\nBreadth-> "+ (this.breadth*this.factor));
    }
}
public class rectangleFactor {
    public static void main(String[] args) {
        rectangle ob=new rectangle();
        ob= new rectangle().set(10, 15);
        ob.display();
    }    
}
