/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.Users.abdullah;

import java.io.Serializable;
import java.util.Date;
import projectbritishcouncil.common.BasicUser;
import projectbritishcouncil.common.TheFileDatabase;
import projectbritishcouncil.common.util.CommonInstancesClass;
import static projectbritishcouncil.common.util.Identifiers.ABDULLAH_FILE_CHUNK;

/**
 *
 * @author Abdullah
 */
public class Librarian extends BasicUser implements Serializable
{
    public Librarian(String Name, String Email, String Password, Date DOJ, Date DOB) {
        super(Name, Email, Password, DOJ, DOB);
    }
    
    public void addBook(Book b)
    {
        AbdullahFileChunk afc = TheFileDatabase.abdFile;
        
        afc.allBooksInLibrary.add(b);
    }
    
    
}