package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String url="jdbc:mysql://localhost:3306/course";
    private static final String user="root";
    private static final String pass="jothisha2004";

    public static Connection getConnection(){
    Connection con=null;
    try{
        con=DriverManager.getConnection(url,user,pass);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return con;
}
    
}
