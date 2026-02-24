package com.example.model;

public class Book {
    private int book_id;
    private String book_name;
    private String book_auth;
    private String book_pub;
    private float book_price;

    public Book(int book_id,String book_name, String book_auth,String book_pub, float book_price){
        this.book_id=book_id;
        this.book_name=book_name;
        this.book_auth=book_auth;
        this.book_pub=book_pub;
        this.book_price=book_price;
    }
    

    /**
     * @return int return the book_id
     */
    public int getBook_id() {
        return book_id;
    }

    /**
     * @param book_id the book_id to set
     */
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    /**
     * @return String return the book_name
     */
    public String getBook_name() {
        return book_name;
    }

    /**
     * @param book_name the book_name to set
     */
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    /**
     * @return String return the book_auth
     */
    public String getBook_auth() {
        return book_auth;
    }

    /**
     * @param book_auth the book_auth to set
     */
    public void setBook_auth(String book_auth) {
        this.book_auth = book_auth;
    }

    /**
     * @return String return the book_pub
     */
    public String getBook_pub() {
        return book_pub;
    }

    /**
     * @param book_pub the book_pub to set
     */
    public void setBook_pub(String book_pub) {
        this.book_pub = book_pub;
    }

    /**
     * @return float return the book_price
     */
    public float getBook_price() {
        return book_price;
    }

    /**
     * @param book_price the book_price to set
     */
    public void setBook_price(float book_price) {
        this.book_price = book_price;
    }

    @Override
    public String toString(){
        return "Book_id:"+book_id+"Book_name:"+book_name+"Book_author:"+book_auth+"Book_publisher:"+book_pub+"Book_price:"+book_price;
    }

}
