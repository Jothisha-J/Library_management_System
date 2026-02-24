package com.example.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Book;
import com.example.util.DBConnection;

public class BookDAOImpl implements  BookDAO{
    public boolean add(Book b){
        try{
        Connection con=DBConnection.getConnection();
        String str="Insert into book values(?,?,?,?,?)";
        PreparedStatement pst=con.prepareStatement(str);
        pst.setInt(1,b.getBook_id());
        pst.setString(2, b.getBook_name());
        pst.setString(3,b.getBook_auth());
        pst.setString(4,b.getBook_pub());
        pst.setFloat(5,b.getBook_price());
        pst.execute();
        System.out.println("Inserted Succesfullyy...");
        return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Book> view(){
        List<Book> list=new ArrayList<>();
        try {
            Connection con=DBConnection.getConnection();
            String q="Select * from book";
        PreparedStatement pst=con.prepareStatement(q);
        ResultSet rs=pst.executeQuery();
        while(rs.next()){
            Book b=new Book(
                rs.getInt("book_id"),
                rs.getString("book_name"),
                rs.getString("book_author"),
                rs.getString("book_publisher"),
                rs.getFloat("book_price")
            );
                list.add(b);
        }

        } catch (Exception e) {
            e.printStackTrace();
        }
                    
        return list;
    }

    public Book search(int num){
        Book b=null;
        try {
            Connection con=DBConnection.getConnection();
            String q="Select * from book where book_id=?";
            PreparedStatement pst=con.prepareStatement(q);
            pst.setInt(1, num);
            ResultSet s=pst.executeQuery();
            while(s.next()){
                b=new Book(
                s.getInt("book_id"),
                s.getString("book_name"),
                s.getString("book_author"),
                s.getString("book_publisher"),
                s.getFloat("book_price")
            );            }
        }
        catch(Exception e){
                e.printStackTrace();
            }
            return b;
    }

    public boolean update(Book b){
    try {
        Connection con =DBConnection.getConnection();
        String str="update book set book_name=?, Book_author=?, book_publisher=?, book_price=? where book_id=?";
        PreparedStatement pst=con.prepareStatement(str);
        pst.setInt(5,b.getBook_id());
        pst.setString(1,b.getBook_name());
        pst.setString(2,b.getBook_auth());
        pst.setString(3, b.getBook_pub());
        pst.setFloat(4,b.getBook_price());
        pst.execute();
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
    }

    public boolean delete(int id){
        try {
          Connection con=DBConnection.getConnection();
            String qu="delete from book where book_id=?";
            PreparedStatement pst=con.prepareStatement(qu);
            pst.setInt(1, id);
            pst.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
