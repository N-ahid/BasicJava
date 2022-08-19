package polymorphism;

public class DogTest {
    static Dog dog1=new Dog();
    static Dog dog2=new DeshiDog();
    //Dog dogg=new BideshiDog();
    //Dog dog3=new BideshiDog();

    public static void main(String[] args) {
        //System.out.println(dog1.getType());
        //dog1.gettype();
        //dog2.gettype();
        //dog3.gettype();
        Dog dog3=new BideshiDog();
        dog3.getType();
        dog1.getType();
        dog2.getType();
    }
}
