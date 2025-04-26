package Exeption;
import java.sql.*;
class TestConnection
{
    public void testConnection(){
        try {
            Class.forName("java.oracle.driver");
            Connection cn=DriverManager.getConnection("scott");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException se){
            se.printStackTrace();
        }
        
    }
}

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        
    }
}
