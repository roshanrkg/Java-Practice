package THREAD;

//Syncronization puts lock on shared resource which is currently handeled by any thread.
class Account{
    public double balance =15000.00;
    public synchronized void credit(double amount){
        this.balance=this.balance+amount;
        System.out.println("After Credit: "+this.balance);
        this.notify();
    }
    public synchronized void debit(double amount){ 
       if(this.balance<amount){
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 
       }
       else{
        this.balance=balance-amount;
       }
        System.out.println("After Debit: "+this.balance);
    }
}

class Customer1 implements Runnable{

    Account acc;// we cannot create new account object as it will create new account evey thime so we use object reference
    public Customer1(Account acc){
        this.acc=acc;
    }
    @Override
    public void run() {
        acc.debit(9000.00);
    }

}

class Customer2 implements Runnable{

    Account acc;// we cannot create new account object as it will create new account evey thime so we use object reference
    public Customer2(Account acc){
        this.acc=acc;
    }
    @Override
    public void run() {
        acc.debit(7000.00);
    }

}

class Customer3 implements Runnable{

    Account acc;// we cannot create new account object as it will create new account evey thime so we use object reference
    public Customer3(Account acc){
        this.acc=acc;
    }
    @Override
    public void run() {
        acc.credit(5000.00);
    }

}
class Customer4 implements Runnable{

    Account acc;// we cannot create new account object as it will create new account evey thime so we use object reference
    public Customer4(Account acc){
        this.acc=acc;
    }
    @Override
    public void run() {
        acc.debit(5000.00);
    }

}

public class SyncronizationDemo {
    public static void main(String[] args) {
        Account a=new Account();
        Thread c1=new Thread(new Customer1(a));
        Thread c2=new Thread(new Customer2(a));
        Thread c3=new Thread(new Customer3(a));
        Thread c4=new Thread(new Customer4(a));
        c1.start();
        c2.start();
        c3.start();
        c4.start();

    }
}
