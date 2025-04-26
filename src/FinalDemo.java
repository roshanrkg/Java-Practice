 class parent6{ // if a class is final it cannot be extended
    final  public  void show(){ // if we decalare a variable as final we cannnot cange its value its is constant.
        System.out.println("Parent class");
    }
}

class child6 extends parent6{
     public void show(){
        System.out.println("Child class");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
         child6 c=new child6();
        c.show();
    }
}
