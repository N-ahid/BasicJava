package beginers_java;

import java.util.Scanner;

public class Factorial {
    public static int fac(int n){
        int result=0;
        if(n==1)
            result=1;
        if(n>1)
            result=n*fac(n-1);
        return result;
    }
    public static void main(String[] args) {
        int n,ans;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        ans=fac(n);
        System.out.println(ans);
    }

}
