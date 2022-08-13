package com.dagim;

public class Main {
    public static void main(String[] args) {
        boxPattern(5);

    }
    static void boxPattern(int n){
        for(int row = 1; row <= n; row ++){
            for(int col = 0; col < n; col ++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


}
