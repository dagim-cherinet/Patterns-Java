package com.dagim;

public class Pattern_1_RightAngleTriangle {
    public static void main(String[] args) {
        rightAngleTriangle(5);
    }
    static void rightAngleTriangle(int n){
        for(int row = 1; row <= n; row ++){
            // for every row run the column
            // number of column element within this particular row
            // and identify the type of column row and don't forget to usr print()
            for(int col = 1; col <= row; col ++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a new line the next row --> sout("")
            System.out.println();
        }
    }
}
