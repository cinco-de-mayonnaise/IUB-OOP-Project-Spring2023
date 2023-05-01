/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    private MenuButton menuMenuBar;
    @FXML
    private MenuButton settingsMenuBar;
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
    ArrayList<String> yearList;
    ArrayList<GradeBoundary> monthList;
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
         Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         stage.close();
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
    }

    @FXML
    private void checkMarkScheme(ActionEvent event) {
    }

    @FXML
    private void reportCandidate(ActionEvent event) {
    }

    @FXML
    private void pulishResults(ActionEvent event) {
    }

    @FXML
    private void applyForLeave(ActionEvent event) {
    }

    @FXML
    private void writeQuestions(ActionEvent event) {
    }

    @FXML
    private void help(ActionEvent event) {
    }

    @FXML
    private void logout(ActionEvent event) {
    }

    @FXML
    private void viewGradeBoundaryButtonOnClick(ActionEvent event) {
           /* monthList.add(new GradeBoundary("January"));
            monthList.add(new GradeBoundary("January"));
            monthList.add(new GradeBoundary("January"));
            monthList.add(new GradeBoundary("January"));
            monthList.add(new GradeBoundary("January"));*/
            yearList.add("2017");
            yearList.add("2017");
            yearList.add("2017");
            yearList.add("2017");
            yearList.add("2017");
            
            
           gbTtableView.getItems().clear();
           int i = 0;
           for( GradeBoundary gb : monthList ){
              // gbTtableView.getItems().add(yearList.get(), monthList.get(i));
               i++;
           }
    }
}
   

    
