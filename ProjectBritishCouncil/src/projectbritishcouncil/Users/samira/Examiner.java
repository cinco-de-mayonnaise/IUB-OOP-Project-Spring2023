/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.Users.samira;

import FXMLScenes.Users.samira.modelClasses.ExaminerInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import projectbritishcouncil.common.BasicUser;

/**
 *
 * @author samir
 */
public class Examiner extends BasicUser implements Serializable{
    private ExaminerInfo examinerInfo;
   private ArrayList<Exam> exams; 

    public Examiner(String Name, String Email, String Password, Date DOJ, Date DOB) {
        super(Name, Email, Password, DOJ, DOB);
    }
    
    
    
}
