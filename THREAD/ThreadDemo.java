package THREAD;

class FirstThreads extends Thread{

    public void run()
    {  
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

class SecondThreads extends Thread {

    public void run(){
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
    


public class ThreadDemo {
    public static void main(String[] args) {
        FirstThread ft=new FirstThread();
        SecondThread st=new SecondThread();
        ft.start();// we need to ready before running and run automatically call and its running
        st.start();
        
         
         try {
            for(int i=200;i<=300;i++){
                System.out.println("Thread 3= "+i);
              
                    Thread.sleep(100);
                }
                } 
            catch (InterruptedException e) {
                    e.printStackTrace();
                }
            
        }
    }

