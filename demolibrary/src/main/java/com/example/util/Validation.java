package com.example.util;

public class Validation {

    public static boolean isValidID(int id){
        return id>0;
    }

    public static boolean isValid(String str){
        return str.matches("^[A-Za-z ]+$");
    }

    public static  boolean isValidName(String str){
        return str.matches("^[A-Za-z ]+$");
    }
    
}
