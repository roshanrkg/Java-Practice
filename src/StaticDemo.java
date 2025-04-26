class UseStatic
{
    public static int x=25;
    public static void display(){
        System.out.println("x: "+x);
    }
}

public class StaticDemo {
    public static void main(String[] args) { // main class is static because we are not creating any object of main to run it. it is runnable class because of static variable
        
        System.out.println(UseStatic.x);// static variable can be accesssed without creating functions or objects.

    }
}

