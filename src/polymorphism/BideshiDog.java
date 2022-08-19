package polymorphism;

public class BideshiDog extends Dog{
    @Override
    public void getType(){
        //super.getType();
        System.out.println("bideshi dog");
        //return "bidesh";
    }

    public String getName(){
        return "poodle";
    }
}
