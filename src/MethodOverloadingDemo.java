class Calculator{
    public int add(int a ,int b){
        return a+b;
    }
    public float add(int a ,float b){
        return a+b;
    }
    public double add(double a ,double b){
        return a+b;
    }

}

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        Calculator calculator1=new Calculator();
        
       int a= calculator1.add(5,6);
       double b= calculator1.add(5,6.7);
       double c= calculator1.add(5.5,6.5);
       System.out.println(a+"  "+b+"  "+c);
    }
}
