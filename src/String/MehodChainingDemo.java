package String;

public class MehodChainingDemo {
    public static void main(String[] args) {
;
        StringBuffer sb2= new StringBuffer("BANGALORE");
        //sb2.append("BANGALORE").delete(0, 4).reverse().replace(3  , 4, "R").replace(1, 2, "L");
        sb2.append("BANGALORE").delete(0, 4).reverse();
        String result=""+sb2.charAt(0)+sb2.charAt(3)+sb2.charAt(2)+sb2.charAt(1)+sb2.charAt(4);
        System.out.println(result);
       //System.out.println(sb2);
    }
}
