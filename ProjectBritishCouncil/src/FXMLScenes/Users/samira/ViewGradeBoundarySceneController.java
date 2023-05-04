/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.awt.Desktop;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import projectbritishcouncil.common.util.SceneSwitcher;
import projectbritishcouncil.Users.samira.GradeBoundary;
/**
 * FXML Controller class
 *
 * @author samir
 */
public class ViewGradeBoundarySceneController implements Initializable {

    @FXML
    private TableView<GradeBoundary> gbTtableView;
    @FXML
    private TableColumn<GradeBoundary, String> monthColumn;
    @FXML
    private TableColumn<GradeBoundary, String> yearColumn;
    @FXML
    private AnchorPane anchorpane;
    @FXML
    private MenuButton settingsMenuBar;
    ArrayList<String> yearList;
     private AnchorPane scenePane;
    ArrayList<GradeBoundary> monthList;
     private ObservableList<GradeBoundary> gradeBoundaryData = FXCollections.observableArrayList();
    @FXML
    private MenuButton menuMenuBar;
    @FXML
    private Hyperlink hyperlink;
    @FXML
    private Hyperlink hyperlink2;
    @FXML
    private Hyperlink hyperlink3;
    @FXML
    private Hyperlink hyperlink4;
    @FXML
    private Hyperlink hyperlink5;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        monthColumn.setCellValueFactory(new PropertyValueFactory<GradeBoundary, String>("month"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<GradeBoundary, String>("year"));
        
        // TODO
    }    
    
    

    
    @FXML
    private void goHomeButtonOnClick(ActionEvent event) {
         SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/ExaminerDashboardScene.fxml", false);
    }


    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
         Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Go Back");
        alert.setHeaderText("You're about to leave this page");
        alert.setContentText("Are you sure you want to leave this page?: ");
        if(alert.showAndWait().get() == ButtonType.OK){
          Stage stage = (Stage) scenePane.getScene().getWindow();
            SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/FXMLScenes.Users.samira/ExaminerDashboardScene.fxml", true);
      }
    }
    @FXML
    private void hyperlink(ActionEvent event) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(java.net.URI.create("https://qualifications.pearson.com/content/dam/pdf/Support/Grade-boundaries/International-GCSE/international-gcse-grade-boundaries-1701.pdf"));
    }

    @FXML
    private void hyperlink2(ActionEvent event) {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(java.net.URI.create("https://qualifications.pearson.com/content/dam/pdf/Support/Grade-boundaries/International-GCSE/1706-international-gcse-grade-boundaries-v2.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(ViewGradeBoundarySceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void hyperlink3(ActionEvent event) {
          Desktop desktop = Desktop.getDesktop();
        try {
        desktop.browse(java.net.URI.create("https://www.google.com/search?q=igcse+2017+mark+schemes&rlz=1C1BNSD_enBD1030BD1030&oq=igcse+2017+mark+schemes&aqs=chrome..69i57j0i22i30l2j0i390i650l2.11687j0j15&sourceid=chrome&ie=UTF-8"));
        } catch (IOException ex) {
            Logger.getLogger(ViewGradeBoundarySceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void hyperlink4(ActionEvent event) {
        Desktop desktop = Desktop.getDesktop();
        
        try {
            desktop.browse(java.net.URI.create("https://www.google.com/search?q=igcse+2017+mark+schemes&rlz=1C1BNSD_enBD1030BD1030&oq=igcse+2017+mark+schemes&aqs=chrome..69i57j0i22i30l2j0i390i650l2.11687j0j15&sourceid=chrome&ie=UTF-8"));
        } catch (IOException ex) {
            Logger.getLogger(ViewGradeBoundarySceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void hyperlink5(ActionEvent event) {
         Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(java.net.URI.create("https://www.google.com/search?q=igcse+2017+mark+schemes&rlz=1C1BNSD_enBD1030BD1030&oq=igcse+2017+mark+schemes&aqs=chrome..69i57j0i22i30l2j0i390i650l2.11687j0j15&sourceid=chrome&ie=UTF-8"));
        } catch (IOException ex) {
            Logger.getLogger(ViewGradeBoundarySceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    @FXML
    private void checkAnswers(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/CheckingPaperScene.fxml", false);
    }

    private void checkMarkScheme(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/AdminDashboardScene.fxml", false);
    }

    @FXML
    private void reportCandidate(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/ReportCandidateScene.fxml", false);
    }


    @FXML
    private void applyForLeave(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/ApplyForLeaveScene.fxml", false);
    }

    @FXML
    private void writeQuestions(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/ExaminerWriteQuestionsScene.fxml", false);
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
           
                Stage currentStage = (Stage)settingsMenuBar.getScene().getWindow();
                currentStage.setScene(homaPageScene);
                currentStage.show();
           
       }
       
       else{
           
      }
    }

    @FXML
    private void viewGradeBoundaryButtonOnClick(ActionEvent event) throws FileNotFoundException, IOException {
           FileInputStream fis = new FileInputStream("gradeBoundary.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
         ArrayList<GradeBoundary> gradeBoundaries = new ArrayList<>();
         
        
        while (true) {
            GradeBoundary gradeBoundary = null;
            try {
                gradeBoundary = (GradeBoundary) ois.readObject();
                gradeBoundaries.add(gradeBoundary);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ViewGradeBoundarySceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
             ois.close();
             fis.close();
            
            TableColumn<GradeBoundary, String> monthColumn = new TableColumn<>("Month");
            monthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));
            
            TableColumn<GradeBoundary, String> yearColumn = new TableColumn<>("Year");
            yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));
            
            gbTtableView.getColumns().clear();
            gbTtableView.getColumns().add(monthColumn);
            gbTtableView.getColumns().add(yearColumn);

            gbTtableView.getItems().clear();
            gbTtableView.getItems().addAll(gradeBoundaries);
        }
            
           
    }


    @FXML
    private void help(ActionEvent event) {
    }

}
   

    
