
class animal{
    String name;
    public  void  eat(){
        System.out.println("i can eat");
        class fruits{
            String name;
            public void pie(){
                System.out.println("i can pie");
            }
        }
    }
}
class dog extends animal{
    public  void display(){
        System.out.println("my name is "+name);

    }
}
public class inheritanse_multiple {
    public static void main(String[] args) {
        dog labrador=new dog();
        labrador.name="rohu";
        labrador.display();
        labrador.eat();

    }
}
