package com.example.util;

import java.util.Scanner;

public class InputUtil {
    static Scanner sc=new Scanner(System.in);

    public static String getString(String mssg){
        System.out.println(mssg);
        return sc.next();
    }

    public static int getInt(String mssg){
        System.out.println(mssg);
        return sc.nextInt();
    }

    public static float getFloat(String mssg){
        System.out.println(mssg);
        return sc.nextFloat();
    }
}
