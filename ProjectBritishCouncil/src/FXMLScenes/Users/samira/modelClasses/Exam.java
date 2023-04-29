/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FXMLScenes.Users.samira.modelClasses;

import java.util.List;

/**
 *
 * @author samir
 */
class Exam {
    
     private String title;
    private List<Question> questions;

    public Exam(String title, List<Question> questions) {
        this.title = title;
        this.questions = questions;
    }

    public String getTitle() {
        return title;
    }

    public List<Question> getQuestions() {
        return questions;
    }
    
}
