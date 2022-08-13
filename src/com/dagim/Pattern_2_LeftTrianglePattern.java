package com.dagim;

public class Pattern_2_LeftTrianglePattern {
    public static void main(String[] args) {
        leftTrianglePattern(5);
    }
    static void leftTrianglePattern(int n){
        for (int row = 1; row <= n ; row++) {
            //for loop that print the spaces
            for (int col = 1; col <= n - row ; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
