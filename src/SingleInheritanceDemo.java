class Parent{
    public int x=25;
}

class Child extends Parent{

    public int y=60;

    public void add(){
        System.out.println(y+x);// both x and y are accessible in child class
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
       Child c1= new Child();
       c1.add(); 
    }
}
