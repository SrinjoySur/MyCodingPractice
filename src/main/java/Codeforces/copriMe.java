package Codeforces;

import io.cucumber.java.sl.In;

import java.util.Arrays;


public class copriMe {
    public static void main(String[] args) {
        int n=4,m=15;
        int[] a=new int[]{4,7,9,15};
        int[] res=new int[4];
        Arrays.fill(res,0);
    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
//        System.out.println(a+" "+b);
        return gcd(b,a%b);
    }
}
