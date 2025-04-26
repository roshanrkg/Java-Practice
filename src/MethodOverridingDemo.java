class Parent{
    public void show(){
        System.out.println("I am in parent classs");
    }
}

class Child extends Parent{
    public void show(){   // Function overriding because of same function signature
        System.out.println("I am in Child class");
        super.show();//super keyword encountered the control passed to parent class
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Child ch= new Child();
        ch.show();
    }    
}
