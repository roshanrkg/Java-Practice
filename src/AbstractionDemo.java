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

public class AbstractionDemo {
    public static void main(String[] args) {
        Circle c= new Circle();
        c.area(12);
        Square s=new Square();
        s.area(15);
        

    }
}
