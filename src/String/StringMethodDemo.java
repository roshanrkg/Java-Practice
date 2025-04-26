package String;

public class StringMethodDemo {
    public static void main(String[] args) {
        String s1="";
        System.out.println(s1.isEmpty());
        String s2="abcabcabcabc";
        System.out.println(s2.replace("c", "D"));
        String s3="TEST";
        System.out.println(s3.indexOf("T"));
        System.out.println(s3.lastIndexOf("T"));
        String s4=" Delhi ";
        System.out.println(s4.trim());
        String s5="Bangalore";
        System.out.println(s5.substring(5,7));
        System.out.println(s5.charAt(3));
        String s6="Chennai";
        System.out.println(s6.toUpperCase());
        String s7="Hello,My name is Roshan,I am fine";
        String m[]=s7.split(",");

        for(int i=0;i<m.length;i++){
            System.out.println(m[i]);
        }
    }
}
