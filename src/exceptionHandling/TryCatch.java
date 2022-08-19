package exceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        int result=0;
        try{
            result=a/b;
        }catch (ArithmeticException e){
            System.out.println("you can not divide "+a+" by "+b);
        }
        System.out.println("result:"+result);
    }
}
