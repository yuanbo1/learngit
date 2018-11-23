package com.lkwd;

public interface De {

     void run ();


     default String cry(String name ){
         return "cry";
     }

     default String hhh(String hhh){
         return "hhh";
     }

}
