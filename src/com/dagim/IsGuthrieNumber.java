package com.dagim;

import java.util.ArrayList;
import java.util.Arrays;

public class IsGuthrieNumber {
    static int a0=1;
    static int a1=2;
    static int an_1=4;
    static int an;
    static int counter = 0;
    public static void main(String[] args) {
       System.out.println(isGuthrie(22));

       // isGuthrie(4);

    }
    //not optimized
    static int isGuthrie(int n){
        int[] guthrie = new int[]{1, 2, 4, 7, 11, 16};   // an = a0 + n(n+1)/2
        // an = an-1 + n
        // a2 =4
        // a2 = a1 + 2
        ArrayList<Integer> guthrieArr = new ArrayList<Integer>(Arrays.asList(1,2,4));
        int a0=1; int a1=2; int an_1=4;
       // System.out.print(a0 + ", " + a1 + ", " + an_1 + ", ");
        int an = 0;
        int a = 3;
        // while the last element in the generated series is less than/equals to the input num
       while ( an <= n){
           an = an_1 + a;
           // System.out.print(an + ", ");
            guthrieArr.add(an);
            an_1 = an;
            a++;
        }
        System.out.println(guthrieArr);
        if(guthrieArr.contains(n)){
            System.out.println("the number " + n + " is guthrie");
            return 1;
        }
        else {
            System.out.println("the number  " + n + " is NOT guthrie");
            return 0;
        }

    }

}
