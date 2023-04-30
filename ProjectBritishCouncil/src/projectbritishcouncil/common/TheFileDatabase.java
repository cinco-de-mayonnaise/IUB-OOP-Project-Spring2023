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
import java.util.ArrayList;
import projectbritishcouncil.Users.abdullah.AbdullahFileChunk;
import projectbritishcouncil.Users.protik.ProtikFileChunk;
import projectbritishcouncil.Users.samira.SamiraFileChunk;
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
    // This is the object that will be written and saved into a single "database.dat" file.
    // 
    static File dir;
    
    
    //****// File Structure: The following things exist in order, and must be read/written to in the same order or will crash
    //*** User Information: Store all users that can login/that exist, in here
    static CommonsFileChunk commonFile;
    
    static AbdullahFileChunk abdFile;
    static SamiraFileChunk samFile;
    static ProtikFileChunk proFile;
    static SopenFileChunk sopFile;

    public TheFileDatabase(File f) throws IOException
    {
        if (!f.isFile())
            if (!f.canRead() || !f.canWrite())
            {
                this.dir = f;
            }
                
        throw new IOException("Could not open the database file for use!");
    }
    
    static int WriteToDisk()
    {
        if (dir == null)
            return 1;
        
        ObjectOutputStream oos;
        try
        {
            oos = new ObjectOutputStream(new FileOutputStream(dir));
            oos.writeObject(commonFile);
            oos.writeObject(abdFile);
            oos.writeObject(samFile);
            oos.writeObject(proFile);
            oos.writeObject(sopFile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        return 0;
    }
    
    static int ReadFromFile() throws Exception
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
            CommonInstancesClass CIC = CommonInstancesClass.getInstance();
            CIC.putObject(COMMONS_FILE_CHUNK, commonFile);
            CIC.putObject(ABDULLAH_FILE_CHUNK, commonFile);
            CIC.putObject(SAMIRA_FILE_CHUNK, commonFile);
            CIC.putObject(PROTIK_FILE_CHUNK, commonFile);
            CIC.putObject(SOPEN_FILE_CHUNK, commonFile);
        }
        catch (Throwable t)
        {
            t.printStackTrace();  // file reading failed, you should exit...
            throw t;
        }
        
        return 0;
    }
}
