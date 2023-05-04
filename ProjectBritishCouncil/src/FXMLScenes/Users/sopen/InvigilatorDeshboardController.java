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
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Mohd. Inkead Sopen
 */
public class InvigilatorDeshboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void invigilationtimeOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Invigilator/ChooseInvigilatingTime.fxml", false);
    }
    
    @FXML
    private void attendanceOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Invigilator/Attendance.fxml", false);
    }
    
    @FXML
    private void itsupportOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Invigilator/ITSupport.fxml", false);
    }
    
    @FXML
    private void leaveapplicationOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Invigilator/LeaveApplication.fxml", false);
    }
    
    @FXML
    private void observationreportOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Invigilator/ChooseInvigilatingTime.fxml", false);
    }
    
    @FXML
    private void checkstatusOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Invigilator/CheckStatus.fxml", false);
    }
    
    @FXML
    private void examscheduleOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Invigilator/ExaminationSchedule.fxml", false);
    }
    
    @FXML
    private void reportstudentOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/sopen/Invigilator/ReportCandidate.fxml", false);
    }
    
}
