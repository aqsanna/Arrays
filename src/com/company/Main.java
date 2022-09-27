package com.company;

public class Main {

    public static void main(String[] args) {
        int i;
        int[] array = new int[1];
        array[0] = 10;
        System.out.println(array[0]);
        int[] day = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (i = 0; i <= 10; i++) {
            System.out.print(day[i] + " ");
        }
        int[] array1 = new int[11];
        int a = 10;
        for (i = 0; i < array1.length; i++) {
            array1[i] = a + i;
        }
        System.out.println();
        for (i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        int[][] matric = new int[4][5];
        int m = 0;
        for (i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                matric[i][j] = m++;
                System.out.print(matric[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("hashvel arrayi tareri gumary");
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int sum5 = 0;
        for (i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);


        System.out.println("hashvel arrayi tareri gumary for eachov");
        for (int x : num) {
            sum5 += x;
        }
        System.out.println(sum5);

        int[][] num2 = new int[3][5];
        int sum2 = 0;
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                num2[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] x : num2) {
            for (int y : x) {
                sum2 += y;
            }
        }
        System.out.println("Sum2 = " + sum2);

        int[] num3 = {6, 8, 3, 7, 5, 6, 1, 4};
        int z = 5;
        boolean val = false;
        for (int x : num3) {
            if (x == z) {
                val = true;
                break;
            }
        }
        if (val) {
            System.out.println("gtnvec 5-y");
        }

        double[] num4 = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (i = 0; i < 5; i++) {
            result = result + num4[i];
        }
        System.out.println("Results is : " + result / 5);

        //Sort arrays :  ascending

        int[] asc = {5, 2, -6, 1, 80, 0};
        int def = 0;
        for (i = 0; i < asc.length; i++) {
            for (int j = i + 1; j < asc.length; j++) {
                if (asc[i] > asc[j]) {
                    def = asc[i];
                    asc[i] = asc[j];
                    asc[j] = def;
                }
            }
        }
        for (i = 0; i < asc.length; i++) {
            System.out.print(asc[i] + " ");
        }

        // Sort arrays :  descending

        System.out.println("\nSort arrays :  descending");
        for (i = 0; i < asc.length; i++) {
            for (int j = i + 1; j < asc.length; j++) {
                if (asc[i] < asc[j]) {
                    def = asc[i];
                    asc[i] = asc[j];
                    asc[j] = def;
                }
            }
        }
        for (i = 0; i < asc.length; i++) {
            System.out.print(asc[i] + " ");
        }

        // Calculate sum of diagonal lines for matrix

        int[][] matrix = {{11, 2, 3, 6},
                {5, 6, 8, 8},
                {9, 11, 11, 12},
                {13, 14, 15, 16}};
        int sum3 = 0, sum4 = 0;
        for (i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum3 += matrix[i][j];
                }
                if ((i + j) == (matrix.length - 1)) {
                    sum4 += matrix[i][j];
                }
            }
        }
        System.out.print(sum3 + " ");
        System.out.print(sum4 + " ");
        System.out.println();

        System.out.println("Sort matrix: ascending");  // sorta anum amen ira toxum bayc yndhanury chi anum
        int[][] arr = {{2, 3, 1},
                {5, 4, 60},
                {8, 70, 9}};

        int j, k, temp;
        for (k = 0; k < arr.length; k++) {
            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr.length; j++) {
                    if (arr[k][i] < arr[k][j]) {
                        temp = arr[k][i];
                        arr[k][i] = arr[k][j];
                        arr[k][j] = temp;

                    }
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

