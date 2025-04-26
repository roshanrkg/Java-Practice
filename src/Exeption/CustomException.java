package Exeption;

class Account{
    public String accno="100";
    public void checkAccount(String acc) throws AccountNotExistException{
        if(acc.equals(accno)){ // use .equals in case of string.
            System.out.println( "Account number matched");
        }
        else{
            AccountNotExistException ac= new AccountNotExistException();
            throw ac;
        }
    }
}

public class CustomException {
    public static void main(String[] args) throws AccountNotExistException {
        Account a1=new Account();
        a1.checkAccount("100");
    }
}
