package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;

public class ReversArray {
    public static void main(String[] args) {

        // zangvaci reversy- nuyn tvery texerov poxac
        int[] nums ={5, 6, 7, 8, 9};
        System.out.println("Original array nums");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("revers array nums");
        for (int i = nums.length-1; i >=0 ; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();


        //zangvaci reversy- nuyn tvery texerov poxac Revers methodov
        Integer[] myArray ={4, 6, 15, 82, 7};
        System.out.print("Original ArrayList: " + Arrays.asList(myArray));
        System.out.println();
        revers(myArray);

        System.out.println();
        // zangvaci  krknvoxner elementnery
        int[] dublicatArray = {4, 5, 6, 4, 15, 25, 15};
        for(int i = 0; i<dublicatArray.length; i++){
            for(int j = i+1; j<dublicatArray.length; j++){
                if(dublicatArray[i]==dublicatArray[j]){
                    System.out.println("Dublicat elements: " + dublicatArray[i]);
                }
            }
        }


        System.out.println();
        // 2 zangvaci krknvox tarery
        Integer[] arr1={1, 2, 3, 4, 5};
        Integer[] arr2 = {3, 4, 5, 8, 10};
        System.out.println("Dublicat element in 2 arraylist");
        dublicatElements(arr1, arr2);


        System.out.println();
        // sorting ascending
        System.out.println("Array sort by ascending");
        int[] sort={4, 1, -5, 0, 100, 14};
        int min = 0;
        for (int i = 0; i <sort.length ; i++) {
            for (int j = i+1; j <sort.length ; j++) {
                if(sort[i] > sort[j]){
                    min=sort[i];
                    sort[i]=sort[j];
                    sort[j]=min;

                }
            }
        }
        for (int i = 0; i <sort.length ; i++) {
            System.out.print(sort[i] + " ");
        }


        System.out.println();
        System.out.println("Array sort by descending");
        for (int i = 0; i <sort.length ; i++) {
            for (int j = i+1; j <sort.length; j++) {
                if(sort[i] < sort[j]){
                    min=sort[i];
                    sort[i]=sort[j];
                    sort[j] = min;
                }

            }
        }
        for (int i = 0; i <sort.length ; i++) {
            System.out.print(sort[i] + ", ");

        }


        //сколько цифр в числе
        System.out.println();
        int n =54;
        System.out.println("сколько цифр в числе" + " " + (n + "").length());




        int m =15487;
        int count=0;
        for (int i = 0; m!=0; m/=10) {
             ++count;
        }
        System.out.println(count);

    }

    public static void revers(Integer myArray[]){
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Revers in Array: " + Arrays.asList(myArray));
    }

    public static void dublicatElements(Integer arr1[], Integer arr2[]){
        for(int i = 0; i< arr1.length; i++){
                for(int j= 0; j< arr2.length; j++){
                    if(arr1[i]==arr2[j]){
                        System.out.println(arr1[i]);
                    }
                }
        }
    }





}
