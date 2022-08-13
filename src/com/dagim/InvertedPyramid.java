package com.dagim;

public class InvertedPyramid {
    public static void main(String[] args) {
        invertedPyramidPattern(5);
    }
    static void invertedPyramidPattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
