package com.dagim;

public class Pattern_6_DiamondWithNumbers {
    public static void main(String[] args) {
        numberPyramidPattern(5);
    }
    static void numberPyramidPattern(int n){
        for (int row = 1; row <= 2*n -1 ; row++) {
            int colCount = row <= n ? row : 2*n - row;
            for (int spaces = 1; spaces <= n - colCount ; spaces++) {
                System.out.print("  ");
            }
            for (int firstPart = colCount; firstPart >= 1 ; firstPart--) {
                System.out.print(firstPart + " ");
            }
            for (int secondPart = 2; secondPart <= colCount ; secondPart++) {
                System.out.print(secondPart + " ");
            }
            System.out.println();
        }
    }
}
