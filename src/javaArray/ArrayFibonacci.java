package javaArray;

public class ArrayFibonacci {
    public static void main(String[] args) {
        final int ARRAY_LENGTH=10;
        int [] a=new int[ARRAY_LENGTH];
        System.out.println("index\tvalue");
        for(int i=0;i<a.length;i++){
            a[i]=fib(i);
            System.out.println("  "+i+"\t\t  "+a[i]);
        }

    }

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
}
