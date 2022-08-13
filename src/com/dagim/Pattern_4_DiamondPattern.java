package com.dagim;

public class Pattern_4_DiamondPattern {
    public static void main(String[] args) {
        diamondPattern(5);
    }
    static void diamondPattern(int n){
        int totalRows = 2 * n -1;
        for (int row = 1; row <= totalRows ; row++) {
            int colCount = row <= n ?  row : totalRows - row + 1 ;
            for (int col = 1; col <= n - colCount   ; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= colCount ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
