class TestStatic{
    public static int x=25;
    public static int y=0;
    public static void show (){
        System.out.println("x: "+x);
        System.out.println("Y: "+y);
    }
    static{ // if we write any static block in the program it will execute first.
        y=x*4;
    }
}

class NewStatic // classes can not directly be static 
{
    static class t1{// nested classes can be static
        
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        TestStatic.show();
    }
}
