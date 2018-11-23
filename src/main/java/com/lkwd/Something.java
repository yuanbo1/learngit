package com.lkwd;

public class Something {
    Something(){

    }
    Something(String something){
        System.out.println(something);
    }

    static String startWith(String s){
        return String.valueOf(s.charAt(1));
    }

    String endWith(String s){
        return String.valueOf(s.charAt(s.length()-1));
    }

}
