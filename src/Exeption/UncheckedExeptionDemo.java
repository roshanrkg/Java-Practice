package Exeption;

class calc{
    public int x=25;
    public int y=0;
    
    
    public void result(){
        try
        {
        int z=x+y;
        System.out.println("The result is: "+z);
        }
        catch(ArithmeticException ae){ // predictable exception to avoid checking
          //  ae.printStackTrace(); // exception handeling message 
            System.out.println(ae.getMessage()); // we can do this also but is shows less information.
        }
        catch(Exception ex){ // to find any exception if the first exception is no there.
            ex.printStackTrace();
        }
        finally{
            System.out.println("Always executed");
        }
    }
    public void show(){
        System.out.println(x);
    }

}

public class UncheckedExeptionDemo {
    public static void main(String[] args) {
        calc c1=new calc();
        c1.result();
        c1.show();
    }
}
