class Student1{
    public int rollno;
    public String sname;

    public Student1(int rollno,String sname){
        this.rollno=rollno;
        this.sname=sname;
    }

    public void show(){
        System.out.println("ROll no ="+rollno+"\nStudent name= "+sname);
    }
}

class Examination1 extends Student1{
    public String paper1;
    public String paper2;
    public String paper3;

    public Examination1(int rollno, String sname,String paper1, String paper2, String paper3) {
        super(rollno, sname);
        this.paper1=paper1;
        this.paper2=paper2;
        this.paper3=paper3;
    }

    public void display(){
        System.out.println(paper1);
        System.out.println(paper2);
        System.out.println(paper3);
    }
    
}

class Semester1 extends Examination1 implements Sports{

    public String sem;
    public String yr;
     public double fees;

    public Semester1(int rollno, String sname, String paper1, String paper2, String paper3,String sem,String yr,double fees) {
        super(rollno, sname, paper1, paper2, paper3);
       this.sem=sem;
       this.yr=yr;
       this.fees=fees;
    }

    @Override
    public double credit() {

        return 55.00;
    }

    public void info(){
        System.out.println(sem);
        System.out.println(yr);
        System.out.println(fees);
    }
    
}
public class CaseStudy2 {
    public static void main(String[] args) {
        Semester1 s1=new Semester1(1, "Roshan", "maths", "Physics", "Java", "4th", "2nd", 50000);
        s1.show();
        s1.display();
        s1.info();
        double credit =s1.credit();
        System.out.println(credit);
    }
}
