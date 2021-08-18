/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author Haran
 */
public  class BookList {
    
    public static List booklist=new ArrayList(); 
    public static void initializeDetails(){
        booklist.add(new Book(1001,"Becoming",250,36.40f,"Biography"));
        booklist.add(new Book(1002,"You",125,12.40f,"Thriller"));
        booklist.add(new Book(1003,"Spygate",300,18.40f,"Political"));
      
    } 
    
}
