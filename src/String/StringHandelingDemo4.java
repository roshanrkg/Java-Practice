package String;

public class StringHandelingDemo4 {
    public static void main(String[] args) {
        String s1=new String("Spring");
        s1.concat("hibernate");
        String s2=s1.concat("Springboot");
        s2.concat("Microservice");
        
        System.out.println(s1);
        System.out.println(s2);
    }
}
