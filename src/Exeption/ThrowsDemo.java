package Exeption;

class calcs{
    public int x=25;
    public int y=0;
    
    
    public void result()throws ArithmeticException,Exception{
        int z=x/y;
        System.out.println("The result is: "+z);
    }
}

public class ThrowsDemo  { //caller environment
    public static void main(String[] args) throws ArithmeticException,Exception {
        calcs c1= new calcs();
        c1.result();
    }
}
