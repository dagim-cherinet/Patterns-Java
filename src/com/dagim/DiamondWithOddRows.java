package com.dagim;

public class DiamondWithOddRows {
    public static void main(String[] args) {
        diamondWithOddRows(5);
    }
    static void diamondWithOddRows(int n){
        for (int row = 1; row <= 2*n -1 ; row++) {
            int colCount = row <= n ? row  : 2*n - row;
            for (int spaces = 1; spaces <= n - colCount ; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= colCount ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
