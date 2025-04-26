package Exeption;

public class OutOfStockException extends Exception {
    public OutOfStockException(){
        System.out.println("Out of Stock Exception occured please check the current stock! ");
    }
}
