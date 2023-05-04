/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXMLScenes.Users.sopen;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Mohd. Inkead Sopen
 */
public class InstructorDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void registrationOnclick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Instructor/StudentRegistration.fxml", false);
    }

    @FXML
    private void room(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Instructor/ClassroomInformation.fxml", false);
    }

    @FXML
    private void classroomresourseOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Instructor/ClassroomResources.fxml", false);
    }

    @FXML
    private void messageOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Instructor/Message.fxml", false);
    }

    @FXML
    private void mocktestOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Instructor/MockTest.fxml", false);
    }
    
    @FXML
    private void resultOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Instructor/Result.fxml", false);
    }
    
    @FXML
    private void announcementOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Instructor/Announcement.fxml", false);
    }
    
    @FXML
    private void itsupportOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Instructor/ITSupport.fxml", false);
    }
}
