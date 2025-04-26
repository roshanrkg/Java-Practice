
class Parcel{
      static class Destination{
        static   public void desti (String a){
            System.out.println("Destination is: " + a);
        }
    }

    class Contents{
        public void weight (double a){
            System.out.println("Weight is : "+a+"kg");
        }
    }
}

public class pareceldemo {
    public static void main(String[] args) {
        Parcel p=new Parcel();
        Parcel.Destination.desti("Kolkata"); // Using static class no object creation took place.
        Parcel.Contents cont=p.new Contents();
        // dest.desti("Kolkata");
        cont.weight(50.00);
    }
}
