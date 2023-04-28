/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.Users.abdullah;

import projectbritishcouncil.common.DataImage;

/**
 *
 * @author Abdullah
 */
public class Book
{
    String Name;
    String ISBN;
    String Category;
    DataImage BookCover;

    public Book(String Name, String ISBN, String Category, DataImage BookCover)
    {
        this.Name = Name;
        this.ISBN = ISBN;
        this.Category = Category;
        this.BookCover = BookCover;
    }
    
}
