
class Furniture
{
    private double length =100.00; // instance variable 
    private  double width =200.00;
    private  double height = 300.00;

    public void volume()
    {
        double vol = length*width*height;
        System.out.println(vol+" <--Volume");
    }
}

class customer
{
    private String cid= "C1";
    private String cname ="SUMAN";
    private String cphno ="544554";

    public void show(){
        System.out.println("Customer id= "+cid+"\nCustomer name"+cname+"\nCustomer phone number"+cphno);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        customer newcustomer= new customer();
        newcustomer.show();
    }
}
