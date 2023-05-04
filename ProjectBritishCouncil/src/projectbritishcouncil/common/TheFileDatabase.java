/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Date;
import projectbritishcouncil.Users.abdullah.AbdullahFileChunk;
import projectbritishcouncil.Users.abdullah.Librarian;
import projectbritishcouncil.Users.abdullah.PrivateCandidate;
import projectbritishcouncil.Users.protik.LibraryMember;
import projectbritishcouncil.Users.protik.ProtikFileChunk;
import projectbritishcouncil.Users.samira.Admin;
import projectbritishcouncil.Users.samira.Examiner;
import projectbritishcouncil.Users.samira.SamiraFileChunk;
import projectbritishcouncil.Users.sopen.Invigilator;
import projectbritishcouncil.Users.sopen.SopenFileChunk;
import projectbritishcouncil.common.util.CommonInstancesClass;
import static projectbritishcouncil.common.util.Identifiers.ABDULLAH_FILE_CHUNK;
import static projectbritishcouncil.common.util.Identifiers.COMMONS_FILE_CHUNK;
import static projectbritishcouncil.common.util.Identifiers.PROTIK_FILE_CHUNK;
import static projectbritishcouncil.common.util.Identifiers.SAMIRA_FILE_CHUNK;
import static projectbritishcouncil.common.util.Identifiers.SOPEN_FILE_CHUNK;

/**
 *
 * @author Abdullah
 */
public class TheFileDatabase implements Serializable
{
    private final static TheFileDatabase INSTANCE = new TheFileDatabase();
    
    // This is the object that will be written and saved into a single "database.dat" file.
    private static File dir;
    
    
    //****// File Structure: The following things exist in order, and must be read/written to in the same order or will crash
    //*** User Information: Store all users that can login/that exist, in here
    public CommonsFileChunk commonFile;
    
    public AbdullahFileChunk abdFile;
    public SamiraFileChunk samFile;
    public ProtikFileChunk proFile;
    public SopenFileChunk sopFile;

    private TheFileDatabase()
    {}
    
    public static TheFileDatabase getInstance()
    {
        return INSTANCE;
    }
    
    public static void setFile(File f) throws IOException
    {
        if (f.canRead() && f.canWrite())
        {
            dir = f;
            return;
        }
                
        throw new IOException("Could not open the database file for use!");
    }
    
    public int WriteToFile()
    {
        // backup not default
        if (dir == null)
            return 1;
        
        ObjectOutputStream oos;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(dir));
            oos.writeObject(this.commonFile);
            oos.writeObject(this.abdFile);
            oos.writeObject(this.samFile);
            oos.writeObject(this.proFile);
            oos.writeObject(this.sopFile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        return 0;
    }
    
    
    public int ReadFromFile() throws Exception
    {
        if (dir == null)
            return 1;
        
        ObjectInputStream ois;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(dir));
            
            commonFile = (CommonsFileChunk) ois.readObject();
            abdFile = (AbdullahFileChunk) ois.readObject();
            samFile = (SamiraFileChunk) ois.readObject();
            proFile = (ProtikFileChunk) ois.readObject();
            sopFile = (SopenFileChunk) ois.readObject();
            
            // also make handles to these file chunks available to everyone via CIC
            // overwrite previous instance because a different file may be re-read.
            CommonInstancesClass CIC = CommonInstancesClass.getInstance();
            CIC.overwriteObject(COMMONS_FILE_CHUNK, commonFile);
            CIC.overwriteObject(ABDULLAH_FILE_CHUNK, commonFile);
            CIC.overwriteObject(SAMIRA_FILE_CHUNK, commonFile);
            CIC.overwriteObject(PROTIK_FILE_CHUNK, commonFile);
            CIC.overwriteObject(SOPEN_FILE_CHUNK, commonFile);
        }
        catch (Throwable t)
        {
            t.printStackTrace();  // file reading failed, you should exit...
            throw t;
        }
        
        return 0;
    }
    
    public int CreateNewFile()   
    {
        // this function is called when a file does not exist, create new instances of everything and write to file...
        // this also does the work of ReadFromFile, so calling that is not necessary... (wait first)
        commonFile = new CommonsFileChunk();
        abdFile = new AbdullahFileChunk();
        samFile = new SamiraFileChunk();
        proFile = new ProtikFileChunk();
        sopFile = new SopenFileChunk();
        
        // write some users to allow logging in on an empty file
        commonFile.allusers = new ArrayList<BasicUser>();
        commonFile.allusers.add(new Librarian("Testing Librarian", "testlibrarian@britishcouncil.com", "1234", new Date(), new Date()));
        commonFile.allusers.add(new PrivateCandidate("Testing PrivateCandidate", "testprivatecandidate@britishcouncil.com", "1234", new Date(), new Date()));
        commonFile.allusers.add(new Admin("Testing Admin", "testadmin@britishcouncil.com", "1234", new Date(), new Date()));
        commonFile.allusers.add(new LibraryMember("Testing LibraryMember", "testlibrarymember@britishcouncil.com", "1234", new Date(), new Date()));
        commonFile.allusers.add(new Examiner("Testing Examiner", "testexaminer@britishcouncil.com", "1234", new Date(), new Date()));
        commonFile.allusers.add(new Invigilator("Testing Invigilator", "testinvigilator@britishcouncil.com", "1234", new Date(), new Date()));
        
        WriteToFile();
        
        return 0;
    }
}
