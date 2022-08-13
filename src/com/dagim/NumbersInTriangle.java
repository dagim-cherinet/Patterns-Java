package com.dagim;

public class NumbersInTriangle {
    public static void main(String[] args) {
      numbersRightAngleTriangle(5);
    }
    static void numbersRightAngleTriangle(int n){
        for(int row = 1; row <= n; row ++){
            // for every row run the column
            // number of column element within this particular row
            // and identify the type of column row and don't forget to usr print()
            for(int col = 1; col <= row; col ++){
                System.out.print(col + " ");
            }
            // when one row is printed, we need to add a new line the next row --> sout("")
            System.out.println();
        }
    }
}
