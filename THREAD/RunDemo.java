package THREAD;

class FirstThread extends Thread{

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

class SecondThread extends Thread {

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
    


public class RunDemo {
    public static void main(String[] args) {
        FirstThreads ft=new FirstThreads();
        SecondThreads st=new SecondThreads();
        ft.run(); // instead of writing start method if we directly run then it behaves normally first 1 will execute then 2 ( not thread facility)
        st.run();
    }
}
