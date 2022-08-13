package com.dagim;

public class TwoTrianglesJoined {
    public static void main(String[] args) {
        //twoTrianglesjoindPattern(5);
        BesttwoTrianglesjoindPattern(5);
    }
    static void twoTrianglesjoindPattern(int n){
        int totalRows = 2 * n -1;
        for (int row = 1; row <= totalRows; row++) {
            if(row <= n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(col + " ");
                }
            }
            else {
                for (int col = 1; col <= totalRows - row + 1; col++) {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
    }
    static void BesttwoTrianglesjoindPattern(int n){
        int totalRows = 2 * n -1;
        for (int row = 1; row <= totalRows; row++) {
            // ternary operator that determine the inner loop exit condition
            int colcount = row <= n ? row : totalRows - row + 1;
            for (int col = 1; col <= colcount; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
