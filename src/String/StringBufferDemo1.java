package String;

public class StringBufferDemo1 {
    public static void main(String[] args) {
        StringBuffer sb1= new StringBuffer("Ajay");
        StringBuffer sb2= new StringBuffer("Ajay");
        System.out.println(sb1.equals(sb2)); // shows false does not check contents
        System.out.println(sb1==sb2);// checks whether the address is same thats why show false in case of string
        // both == and .equals are defined in the object class which is parent of every class .
        // .equals always checks address as same as == but in case of string class it overrides the .equals to chekc for contents but in case of string buffer it does not override the .equals function.
        
        
    }
}
