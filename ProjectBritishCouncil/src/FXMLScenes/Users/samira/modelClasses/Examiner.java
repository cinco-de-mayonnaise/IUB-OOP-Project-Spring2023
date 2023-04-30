/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FXMLScenes.Users.samira.modelClasses;

import java.util.ArrayList;

/**
 *
 * @author samir
 */
public class Examiner {
    
   private ExaminerInfo examinerInfo;
   private ArrayList<Exam> exams; 

    public Examiner() {
    }

    public Examiner(ExaminerInfo examinerInfo, ArrayList<Exam> exams) {
        this.examinerInfo = examinerInfo;
        this.exams = new ArrayList<>();
    }

    public ExaminerInfo getExaminerInfo() {
        return examinerInfo;
    }

    public void setExaminerInfo(ExaminerInfo examinerInfo) {
        this.examinerInfo = examinerInfo;
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Exam> exams) {
        this.exams = exams;
    }
  
}
