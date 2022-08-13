package com.dagim;

public class Pattern_5_PyramidNumbers {
    public static void main(String[] args) {
        numberDiamondPattern(5);
    }
    static void numberDiamondPattern(int n){
        for (int row = 1; row <= n ; row++) {

            for (int col = 1; col <= n - row  ; col++) {
                System.out.print("  ");
            }
          //the first part of the pattern
            for (int firstP = row; firstP >= 1 ; firstP--) {
                System.out.print(firstP + " " );
            }
            //the second part of the pattern
            for (int secondP = 2; secondP <= row ; secondP++) {
                System.out.print(secondP + " ");
            }
            System.out.println();
        }
    }
}
