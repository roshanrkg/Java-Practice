
class Outer{
    private int out_x=25;
    class Inner{
        public int in_y=80;
        public void add(){
            System.out.println((in_y + out_x));
        }
    }
}

public class OuterInnerDemo {
    public static void main(String[] args) {
        Outer out=new Outer();
        Outer.Inner inn= out.new Inner();       // we can access inner only with the help of outer. 
        inn.add();
    }
}
