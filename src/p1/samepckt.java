package p1;

class Test{
    public int x=25;
    private int y =30;
    protected int z=60;
    int d=45;
    public void show_x(){
        System.out.println("x: "+x);
    }
    private void show_y(){
        System.out.println("y: "+y);
    }
    protected void show_z(){
        System.out.println("Z: "+z);
    }
    void show_d(){
        System.out.println("D: "+d);
    }
}



public class samepckt extends Test {
    public static void main(String[] args) {
        samepckt sm=new samepckt();
        sm.show_x();
        sm.show_z();
        sm.show_d();
        System.out.println(sm.x);        
        System.out.println(sm.z);        
        System.out.println(sm.d);        
    }
}
