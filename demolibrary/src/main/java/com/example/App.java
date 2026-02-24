package com.example;
import java.util.List;
import java.util.Scanner;

import com.example.model.Book;
import com.example.service.BookServiceImpl;
import com.example.util.InputUtil;
import com.example.util.Validation;

public class App 
{
    public static void main( String[] args )
    {
        BookServiceImpl service=new BookServiceImpl();
        
        while (true) {
        System.out.println( "Choices \n ---------------" );
        System.out.println(" 1.Add \n 2.View \n 3.Search \n 4.Update \n 5.Delete \n 6.Exit");
        System.out.println( "Enter choice:" );
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
            switch (num) {
                case 1:
                    service.insert();
                    break;
                case 2:
                    List<Book> list=service.select();
                    System.out.println(list);
                    break;
                case 3:
                    System.out.println("enter id");
                    int id=sc.nextInt();
                    Book book=service.searchOne(id);
                    System.out.println(book);
                case 4:
                    {
                        System.out.println("Enter book id:");
                        int book_id=sc.nextInt();
                        if(!Validation.isValidID(book_id)){
                            System.out.println("Invalid ID...");
                            book_id=InputUtil.getInt("Enter book id:");
                        }
                        System.out.println("Enter Book Name:");
                        String name=sc.next();
                        if(!Validation.isValidName(name)){
                            System.out.println("Invalid Book Name...");
                            name=InputUtil.getString("Enter book Name:");
                        }
                        System.out.println("Enter Book Author:");
                        String auth=sc.next();
                        if(!Validation.isValid(auth)){
                            System.out.println("Invalid Book Author...");
                            auth=InputUtil.getString("Enter book Author:");
                        }
                        System.out.println("Enter Book Publisher:");
                        String pub=sc.next();
                        if(!Validation.isValid(pub)){
                            System.out.println("Invalid Book Publisher...");
                            pub=InputUtil.getString("Enter book Publisher:");
                        }
                        System.out.println("Enter book price:");
                        float price=sc.nextFloat();
                        System.out.println((service.change(new Book(book_id, name, auth, pub, price)))?"Updated Successfully...":"Updation unsuccesfull");
                        break;
                        }

                case 5:
                    System.out.println("enter id");
                    int bookid=sc.nextInt();
                    System.out.println((service.remove(bookid))?"Deleted Succesflly...":"Deletion unsucessfull");
                    break;
                case 6:
                    System.exit(0);
                default:
                    throw new AssertionError();
            }
            
        }
    }
    }

