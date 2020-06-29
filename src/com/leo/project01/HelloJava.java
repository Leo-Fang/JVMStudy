package com.leo.project01;

import java.util.ArrayList;

public class HelloJava {

    private static final double PI = Math.PI;
    public static final int NUM = 1;
    public static final String S = "ABC";




    public static void main(String[] args){

        System.out.println("hello java");

        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        for (int i : arr) {
        }

        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(333);
        for (Object o : list) System.out.println(o);
    }

    public void add() {
        System.out.println();

    }

    public void testUpdate(){
        //
    }

}
