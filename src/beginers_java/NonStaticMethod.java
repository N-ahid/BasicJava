package beginers_java;

public class NonStaticMethod {
    private int radius;
    public NonStaticMethod(int radius){
        this.radius=radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public static void main(String[] args) {
        NonStaticMethod test=new NonStaticMethod(7);
        //test.radius=5; eai vbe use korte chaile stter getter er maddome korte hbe;
        System.out.println(test.getArea());
    }
}
