package Exeption;

class Stock{
    public int qoh=50;
    public void issue(int req) throws OutOfStockException{
        if(req>qoh){
            OutOfStockException oe=new OutOfStockException(); // throw the exception created
            throw oe;
        }
        else{
            System.out.println("Issued");
        }
    }
}

public class UserDefinedException {
    public static void main(String[] args) throws OutOfStockException {
        Stock st=new Stock();
        st.issue(60);
    }
}
