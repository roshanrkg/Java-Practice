class Company{
    public String compnm="CTS";
    public String loc="Kolkata";
    
    public void display(){
        System.out.println(compnm +"\n"+loc);
    }
}

class Job extends Company{
    public String tech;
    public double exp;
    public String enddt;
    public String city;

    public void offer(String tech,double exp){
        System.out.println(tech);
        System.out.println(exp);
    }
    public void offer(String tech, double exp, String city){
        System.out.println(tech);
        System.out.println(exp);
        System.out.println(city);
    }
    public void offer(String tech, double exp, String city,String enddt){
        System.out.println(tech);
        System.out.println(exp);
        System.out.println(city);
        System.out.println(enddt);
    }
}

class Candidate extends Job implements Interview{

    public String candnm;
    public String phno;
    public String email;
    public String tech;

    @Override
    public void Schedule() {
       System.out.println("25-10-2025");
    }

    Candidate(String candnm,String phno,String email,String tech){
        this.candnm=candnm;
        this.phno=phno;
        this.email=email;
        this.tech=tech;
    }
    
    public void show(){



        System.out.println(this.candnm);
        System.out.println(this.phno);
        System.out.println(this.email);
        System.out.println(this.tech);
    }
}


public class CaseStudy {
    public static void main(String[] args) {
        Candidate c1=new Candidate("Roshan","6297195226","roshanguptarkg@gmail.com","Node.js");
        c1.show();
        c1.display();
        c1.offer("java", 2);
        c1.offer("php", 2,"kolkata");
        c1.offer("Node.js", 0,"Bangalore","22-2-2023");
        c1.Schedule();

    }
}
