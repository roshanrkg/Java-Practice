
abstract class Shape
{
    public abstract void area(double r);
}

class Circle extends Shape
{
    public void area(double r){
        System.out.println(Math.PI *r*r);
    }
    
}

class Square extends Shape
{
    public void area(double r){
        System.out.println(r*r);
    }
}
public class DynamicBindingDemo {
    public static void main(String[] args) {
        Shape sp1; //Object reference
        Shape sp2; //Object reference
        Circle cr=new Circle();
        sp1=cr;
        Square sq=new Square();
        sp2=sq;
        sp1=sp2;//Dynamic Binding
        sp1.area(2);
    }
}
