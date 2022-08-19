package beginers_java;

public class Bicycle {
    public int candence=0;
    int speed=0;
    int gear=0;
    public void changeCandence(int newValue){
        candence=newValue;
    }
    public void changeGear(int newValue){
        gear=newValue;
    }
    public void speedUp(int increment){
        speed=speed+increment;
    }
    public void applyBrakes(int decrement){
        speed=speed-decrement;
    }
    public void printStates(){
        System.out.println("Candence"+candence+"Speed:"+speed+"Gear:"+gear);
    }

}
