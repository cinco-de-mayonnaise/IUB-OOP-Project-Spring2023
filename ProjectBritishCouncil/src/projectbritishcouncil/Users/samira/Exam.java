/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.Users.samira;
import java.util.ArrayList;

/**
 *
 * @author samir
 */
public class Exam {
    
     private String title;
     private ArrayList<Question> questions;

    public Exam(String title, ArrayList<Question> questions) {
        this.title = title;
        this.questions =  questions;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
    
}
