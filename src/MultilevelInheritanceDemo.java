class Student{
    public int rollno=1;
    public String sname ="Robin";

    public void show(){
        System.out.println("Roll no = "+rollno+ "\nStudent name= "+sname);
    }
}

class Exam extends Student{
    int p,c,m;
    public String sub1="PHYSICS";
    public String sub2="Chemistry";
    public String sub3="Maths";

    public int score (int p, int c , int m){
        System.out.println(sub1 +" "+p );
        System.out.println(sub2+" "+c);
        System.out.println(sub3+" "+m);
        return p+c+m;
    }
}

class Semester extends Exam{
    public String sem="3RD semester";
    public String yr="2nd year";

    public void details(){
        System.out.println(sem);
        System.out.println(yr);
    }
    
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        
        Semester sh= new Semester();
        sh.show();
        int x =sh.score(51, 75, 25);
        System.out.println(x);
        sh.details();
    }
}
