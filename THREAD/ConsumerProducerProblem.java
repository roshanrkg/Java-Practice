package THREAD;

class Stock{
    public int qoh=50;
    public synchronized void demand(int req){
        try {
        if(req>qoh){
                this.wait();
            }
            System.out.println("Current stock :" +(this.qoh-req));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
    public synchronized void supply(int qty){
        this.qoh=this.qoh+qty;
        System.out.println("After supply: "+this.qoh);
        this.notify();// if any thread is in waiting stage then alive other threads.
    }
}

class Consumer extends Thread{
    Stock st; // stock object reference
    public Consumer(Stock st){
        this.st=st;
    }
    public void run(){
        st.demand(70);
    }
}
class Producer extends Thread{
    Stock st;
    public Producer(Stock st){
        this.st=st;
    }
    public void run(){
        st.supply(50);
    }
}

public class ConsumerProducerProblem {
    public static void main(String[] args) {
        Stock s1=new Stock();
        Consumer c=new Consumer(s1);
        Producer p=new Producer(s1);
        c.start();
        p.start();
    }
}
