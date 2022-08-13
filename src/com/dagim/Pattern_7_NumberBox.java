package com.dagim;

public class Pattern_7_NumberBox {
    public static void main(String[] args) {
        patternNumbersBox(4);
    }
    static void patternNumbersBox(int n){
        for (int row = 0; row < 2 * n - 1 ; row++){
            for (int col = 0; col < 2 * n -1 ; col++) {
              //  int value = row <= n ? n-row + 1: n - (2*n -1-row);
               int top = row;
               int down = 2 * n -1 - row -1;
               int left = col;
               int right = 2 * n -1 -col -1;
        int value = Math.min(Math.min(top,down), Math.min(left,right));
                System.out.print((n- value)+ " ");
            }
            System.out.println();
        }

      }
}

