/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.stage.Stage;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author samir
 */
public class CheckingPaperSceneController implements Initializable {

    @FXML
    private MenuButton MenuMenuBar;
    @FXML
    private MenuButton settignsMenuBar;
    @FXML
    private ComboBox<String> studentIDComboBox;
    @FXML
    private TextArea answerTextArea;
    @FXML
    private TextField marksTextField;
    @FXML
    private Hyperlink viewAnswersOnlineHyperlink;
    @FXML
    private ComboBox<String> examTypeComboBox;
    private ArrayList<String> studentIds = new ArrayList<>();
    private ArrayList<String> examTypes = new ArrayList<>();
    private String selectedExamType = "";
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         loadStudentIds();
        loadExamTypes();
         studentIDComboBox.setItems(FXCollections.observableArrayList(studentIds));
        examTypeComboBox.setItems(FXCollections.observableArrayList(examTypes));
    }
 private void loadStudentIds() {
        // Load student ids from file or database
        studentIds.add("12345");
        studentIds.add("23456");
        studentIds.add("34567");
        studentIds.add("45678");
    }

    private void loadExamTypes() {
        examTypes.add("Edexcel IGCSE");
        examTypes.add("Edexcel IAL");
        examTypes.add("CIE O Levels");
        examTypes.add("CIE A Levels");
    }
   

        // TODO
    
         

    @FXML
    private void goHomeButtonOnClick(ActionEvent event) {
          SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/ExaminerDashboardScene.fxml");
    }


    @FXML
    private void goToNextSceneButtonOnClick(ActionEvent event) {
         SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(),"/FXMLScenes/Users/samira/ExaminerDashboardScene.fxml");
        
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewAnswersButtonOnClick(ActionEvent event) {
         String studentId = studentIDComboBox.getSelectionModel().getSelectedItem();
        String answer = "";
        try (Scanner scanner = new Scanner(new File("answers.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith(studentId)) {
                    answer = line.substring(line.indexOf(":") + 1);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        answerTextArea.setText(answer);
  }    

    @FXML
    private void LoadMarkSchemeButtonOnClick(ActionEvent event) {
        String url = "";
        if (selectedExamType.equals("Edexcel IGCSE")) {
            url = "https://qualifications.pearson.com/content/dam/pdf/GCSE/History/2016/Specification%20and%20sample%20assessments/9781446914364_GCSE2016_History_Spec_Issue%202.pdf";
        } else if (selectedExamType.equals("Edexcel IAL")) {
            url = "https://qualifications.pearson.com/content/dam/pdf/International%20Advanced%20Level/History%20%282015%29/Specification%20and%20sample%20assessments/IAL_History_Spec_2015_Issue_1.pdf";
        } else if (selectedExamType.equals("CIE O Levels")) {
            url = "https://www.cambridgeinternational.org/Images/415904-2022-2024-syllabus.pdf";
        } else if (selectedExamType.equals("CIE A Levels")) {
            url = "https://www.cambridgeinternational.org/Images/415923-2022-2024-syllabus.pdf";
        }
       viewAnswersOnlineHyperlink.setText(url);
       
          
       
    }

    @FXML
    private void examTypeComboBoxSelected(ActionEvent event) {
     selectedExamType = examTypeComboBox.getSelectionModel().getSelectedItem();
    }
}
