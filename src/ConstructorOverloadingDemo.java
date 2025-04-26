class Cake{
    public Cake(){
        System.out.println("Happy birthday!");
    }

    public Cake(String msg, String Shape){
        System.out.println( "Messege "+msg+" Shape"+Shape );
    }
    public Cake(String msg, String Shape ,double price ){
        System.out.println( "Messege "+msg+" Shape"+Shape +" price"+price );
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
    Cake C1= new Cake();
    Cake C2=new Cake("happy Birthday", " cricle");
    Cake C3=new Cake("happy Birthday", " cricle",  500.00);
    }
}
