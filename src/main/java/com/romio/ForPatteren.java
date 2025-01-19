package com.romio;

import java.util.Arrays;

public class ForPatteren {

    public static void main(String[] args) {
        char[][] matrix = new char[10][10];
        data(matrix);
        Arrays.stream(matrix)
                .forEach(System.out::println);

    }

    public static void data(char[][] matrix) {
        int row = 10;
        int col = 10;

        for(int r=0;r< row; r++) {
            for(int c=0;c<=r;c++) {

                if(c==0 || c==r+1 || r==row-1) {
                    matrix[r][c] = '*';
                } else{
                    matrix[r][c] = ' ';
                }
            }
        }
    }

    public static void print(char[][] matrix) {
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print("*");
            } else if (i == 9) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");

                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}