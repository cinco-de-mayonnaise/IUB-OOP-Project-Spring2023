/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author samir
 */
public class ExaminerWriteQuestionsSceneController implements Initializable {

    @FXML
    private MenuButton menuMenuBar;
    @FXML
    private MenuButton settingsMenuBar;
    @FXML
    private ComboBox<Integer> numFieldsCombo;
    @FXML
    private VBox textFieldsVbox;
    @FXML
    private TextArea textArea;
    
    
    private ArrayList<TextField> textFieldsList = new ArrayList<>();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ObservableList<Integer> options = FXCollections.observableArrayList();
        for (int i = 1; i <= 10; i++) {
             options.add(i);
        }
        numFieldsCombo.setItems(options);
    }    

    @FXML
    private void goHomeButtonOnClick(ActionEvent event) throws IOException {
      
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ExaminerDashboardScene.fxml"));
        Parent root = loader.load();
        Scene nextScene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(nextScene);
        currentStage.show();

    }

    @FXML
    private void checkAnswers(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckingPaperScene.fxml"));
        Parent root = loader.load();
        Scene nextScene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(nextScene);
        currentStage.show();
    }

    @FXML
    private void viewGradeBoundary(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewGradeBoundaryScene.fxml"));
            Parent root = loader.load();
            Scene nextScene = new Scene(root);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.setScene(nextScene);
            currentStage.show();
    
    }

    @FXML
    private void checkMarkScheme(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckingPaperScene2.fxml"));
        Parent root = loader.load();
        Scene nextScene = new Scene(root);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(nextScene);
        currentStage.show();
    }

    @FXML
    private void reportCandidate(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("ReportCandidateScene.fxml"));
         Parent root = loader.load();
         Scene nextScene = new Scene(root);
         Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         currentStage.setScene(nextScene);
         currentStage.show();
    }

    @FXML
    private void pulishResults(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("CalcculateMarksScene.fxml"));
         Parent root = loader.load();
         Scene nextScene = new Scene(root);
         Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         currentStage.setScene(nextScene);
         currentStage.show();
    }

    @FXML
    private void applyForLeave(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("ApplyForLeaveScene.fxml"));
         Parent root = loader.load();
         Scene nextScene = new Scene(root);
         Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         currentStage.setScene(nextScene);
         currentStage.show();
    }

  

    @FXML
    private void help(ActionEvent event) {
        
    }

    @FXML
    private void logout(ActionEvent event) throws IOException {
       Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
       alert.setTitle("Logout");
       alert.setHeaderText("Are you sure you want to Logout?");
       alert.setContentText("Click OK to Confirm");
       
       Optional <ButtonType> result = alert.showAndWait();
       if(result.get() == ButtonType.OK){
           FXMLLoader loader = new FXMLLoader(getClass().getResource("ExaminerDashboardScene.fxml"));
           Parent homePageParent = loader.load();
           Scene homaPageScene = new Scene(homePageParent);
           
           Stage currentStage = (Stage) settingsMenuBar.getScene().getWindow();
           currentStage.setScene(homaPageScene);
           currentStage.show();
           
       }
       
       else{
           
       }
    }

   

    @FXML
    private void generateTextFields(ActionEvent event) {
           int numFields = numFieldsCombo.getValue();
         textFieldsVbox.getChildren().clear();
         textFieldsList.clear();
         for (int i = 1; i <= numFields; i++) {
             TextField textField = new TextField();
                textFieldsVbox.getChildren().add(textField);
                textFieldsList.add(textField);
    }
    }

    @FXML
    private void showQuestions(ActionEvent event) {
        textArea.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String str="";
       try {
            f = new File("EmpObjects.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            if(!f.exists()){
                textArea.setText("Oops! EmpData.bin binary file does not exist...");
            }
            else{
                
                try {
                    fis = new FileInputStream(f);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ExaminerWriteQuestionsSceneController.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    while (fis.available() > 0) {
                        str += ois.readObject() + "\n";
                    }       } catch (Exception e) {
                        textArea.setText(str);
                         
                    }
            }
       }   catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }           
    }


    @FXML
    private void saveTextFields(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("EmpObjects.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos); 
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
          for (TextField textField : textFieldsList) {
            oos.writeObject(textField.getText());
        }
       } catch (IOException ex) {
            Logger.getLogger(ExaminerWriteQuestionsSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(ExaminerWriteQuestionsSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }  
    }
    
}


