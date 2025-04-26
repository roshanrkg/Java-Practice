package THREAD;

class Newth extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Thread 1: "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) { 
                e.printStackTrace();
            }
        }
    }
}

public class DemonThread {
    public static void main(String[] args) {
        Newth newt=new Newth();
        newt.setDaemon(true);  // When main ends it terminates the thread.
        newt.start();

        for(int i=101;i<=150;i++){
            System.out.println("Main thread "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
