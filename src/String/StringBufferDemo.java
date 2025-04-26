package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        String s1=new String("hello");
        s1.concat("World");
        System.out.println(s1);
        StringBuffer sb1= new StringBuffer("Ajay");
        sb1.append("Ray");
        System.out.println(sb1);
        StringBuffer sb=new StringBuffer("Aditya");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        
        
    }
}
