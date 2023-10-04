
public class Main {
    public static void main(String[] args){
        //
        Phone phone1 = new Phone("Samsung","Noir",4.0);
        Phone phone2 = new Phone ("Iphone", "Bleue",4.0);
       
        phone1.setModel("Samsung");
        phone1.setColor("Noir");
        phone1.setCamera(4);
        
       // System.out.println ("Model:"+phone1.getModel());
      //  System.out.println ("Color:"+phone1.getColor());
        //System.out.println ("Camera:"+phone1.getCamera());
        
        System.out.println("Phone1");
        System.out.println (phone1);
       
        System.out.println("Phone2");
        System.out.println (phone2);

        System.out.println("Phone1 le même que Phone2 ?");
        System.out.println(phone1.equals(phone2));

    }
 
    






}