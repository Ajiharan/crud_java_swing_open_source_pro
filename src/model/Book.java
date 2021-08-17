/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Haran
 */
public class Book  {
    private int bookId;
    private String bookName;
    private int quantity;
    private float price;
    private String category;

    public Book(int bookId, String bookName, int quantity, float price, String category) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }
    
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public String toString(){
       return getBookName()+","+getCategory()+","+getQuantity()+","+getPrice();
    }
    
    public boolean equals(Book book){
        return this.getBookId()==book.getBookId();
    }
    
    
}
