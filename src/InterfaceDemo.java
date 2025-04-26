 class Lecturer implements Speak,Speak1
{

    @Override
    public void talk() {
        System.out.println("Says about some topic");
    }

    @Override
    public void display() {
        System.out.println("Java");
    }

}

class priest implements Speak,Speak1
{
    @Override
    public void talk(){
        System.out.println("Says about GOD");
    }

    @Override
    public void display() {
        System.out.println("Hindi");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Lecturer lt=new Lecturer();
        priest prs= new priest();
        lt.talk();
        lt.display();
        prs.talk();
        prs.display();
    }
}
