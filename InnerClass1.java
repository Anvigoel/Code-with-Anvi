//Inner class--> Member(non static), static, anonymous
//Member inner class:
class A
{
    public void show()
    {
        System.out.println("in show");
    }

    class B
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}
public class InnerClass1 {
    public static void main(String[] args) {
        A obj=new A();
        A.B obj1=obj.new B();
        obj.show();
        obj1.display();
    }
    
}
