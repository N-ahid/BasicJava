package classObject;

public class Cylinder extends Circle {
    double height;

    public Cylinder(){
        this.height=1.0;
    }
    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height=height;
    }

    @Override
    public double getArea() {
        return super.getArea()+10;
    }

    public static void main(String[] args) {
        Cylinder c=new Cylinder();
    }
}
