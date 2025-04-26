package THREAD;

class FstThread implements Runnable {// runnable class

    @Override
    public void run() {
        try {
            for(int i=1;i<=100;i++){
                System.out.println("Thread 1= "+i);
              
                    Thread.sleep(100);
                }
                } 
            catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
}

class ScndThread implements Runnable{

    @Override
    public void run() {
        try {
            for (int i=101;i<=175;i++){
                System.out.println("Thread 2 "+i);
               
                    Thread.sleep(100);
            }
        }
            catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
    
}

public class ThreadImplDemo {
    public static void main(String[] args) {
        Thread th1=new Thread(new FstThread());
        Thread th2=new Thread(new SecondThread());
        th1.start();
        th2.start();
        
    }
}
