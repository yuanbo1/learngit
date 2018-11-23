package com.lkwd;

import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        new Thread( ()-> System.out.println("before")).start();

        //1、匿名内部类
        new Thread (()-> System.out.println("before"));

        List<String> list = Arrays.asList("string","arr","list");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });









    }


}
