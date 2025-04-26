package THREAD;

class Fthread extends Thread{
    public void run(){
        for(int i =300;i<=400;i++){
            System.out.println("First thread : "+i);
        }
    }
}

class Sthread extends Thread{
    public void run(){
        for (int i=400;i<=500;i++){
            System.out.println("Second Thread: "+i);
        }
    }
}

public class ThreadSchedulingDemo {
    public static void main(String[] args) {
        Fthread ft=new Fthread();
        Sthread st=new Sthread();
        ft.setPriority(10);
        st.setPriority(1);
        ft.start();
        st.start();
    }
}
