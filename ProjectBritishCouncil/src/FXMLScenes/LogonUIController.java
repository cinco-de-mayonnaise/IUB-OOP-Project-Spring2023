/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import projectbritishcouncil.Users.abdullah.Librarian;
import projectbritishcouncil.Users.abdullah.PrivateCandidate;
import projectbritishcouncil.Users.protik.IELTSCandidate;
import projectbritishcouncil.Users.protik.LibraryMember;  // this is how you import other people's user if you need it
import projectbritishcouncil.Users.samira.Admin;
import projectbritishcouncil.Users.samira.Examiner;
import projectbritishcouncil.Users.sopen.Invigilator;
import projectbritishcouncil.common.BasicUser;
import projectbritishcouncil.common.CommonsFileChunk;
import projectbritishcouncil.common.util.CommonInstancesClass;
import static projectbritishcouncil.common.util.Identifiers.COMMONS_FILE_CHUNK;
import static projectbritishcouncil.common.util.Identifiers.CURRENT_USER;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Abdullah
 */
public class LogonUIController implements Initializable {

    @FXML
    private Label Label_Forgot_Password;
    @FXML
    private TextField TF_EmailID;
    @FXML
    private PasswordField PasswordField_AccPassword;
    @FXML
    private Button Btn_Login;
    @FXML
    private MenuItem Debug_OpenLibrarianDashboard;
    @FXML
    private MenuItem Debug_OpenIELTSCandidateDashboard;
    @FXML
    private MenuItem Debug_OpenAdminDashboard;
    @FXML
    private MenuItem Debug_OpenInstructorDashboard;
    @FXML
    private MenuItem Debug_OpenLibraryMemberDashboard;
    @FXML
    private MenuItem Debug_OpenInvigilatorDashboard;
    
    CommonInstancesClass CIC;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.CIC = CommonInstancesClass.getInstance();
    }    

    @FXML
    private void click_Forgot_Password(MouseEvent event)
    {
        
    }

    @FXML
    private void click_Login(MouseEvent event)
    {
        String ID = TF_EmailID.getText();
        String pw = PasswordField_AccPassword.getText();
        
        if (ID.equals("") || pw.equals(""))
        {
            SceneSwitcher.raiseAlert_GenericError(
                        "Invalid credentials", 
                        "", 
                        "Invalid Email/ID/Password combination, please try again. "
            );
            return;
        }
        // get list of users
        ArrayList<BasicUser> allusers = ((CommonsFileChunk)CIC.getObject(COMMONS_FILE_CHUNK)).allusers;
        
        for (BasicUser u: allusers)  // realistically we would have a hashtable of all users, because checking against every one is slow, but this is a small toy program so this is enough
        {
            if (u.getEmail().equals(ID))
            {
                if (u.verifyPassword(pw)) // password correct, move to relevant scene with data.
                {
                    // assign current user
                    CIC.putObject(CURRENT_USER, u);
                    // move to relevant scene
                    DetermineUserTypeAndSwitchScene(u);
                }
                else  // password incorrect.
                {
                    SceneSwitcher.raiseAlert_GenericError(
                        "Invalid credentials", 
                        "", 
                        "Incorrect Password entered, please try again. "
                    );
                }
                
                return;
            }
        }
        
        // wow you managed to come here, means all accounts were checked...
        SceneSwitcher.raiseAlert_GenericError(
                        "Invalid credentials", 
                        "", 
                        "An account associated with this ID does not exist. Please contact British Council if you think this is in error. "
        );
    }

    private void DetermineUserTypeAndSwitchScene(BasicUser user)
    {
        Stage cur_stage = SceneSwitcher.getStageFromNode(Btn_Login);
        if (user.getClass().equals(Librarian.class))
        {
            cur_stage.setResizable(true);
            SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/abdullah/LibrarianDashboard.fxml");
        }
        else if (user.getClass().equals(PrivateCandidate.class))
        {
            cur_stage.setResizable(true);
            SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/abdullah/PrivateCandidateDashboard.fxml");
        }
        else if (user.getClass().equals(Admin.class))
        {
            cur_stage.setResizable(true);
            SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/samira/AdminDashboardScene.fxml");
        }
        else if (user.getClass().equals(Examiner.class))
        {
            SceneSwitcher.raiseAlert_NotImplemented();
            
        }
        else if (user.getClass().equals(IELTSCandidate.class))
        {
            cur_stage.setResizable(true);
            SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/protik/IELTSCandidate/IELTSCandidateDashboard .fxml");
        }
        else if (user.getClass().equals(LibraryMember.class))
        {
            cur_stage.setResizable(true);
            SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/protik/LibraryMember/LibraryMemberDashboard.fxml");
        }
        else if (user.getClass().equals(Invigilator.class))
        {
            cur_stage.setResizable(true);
            SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/sopen/InvigilatorDeshboard.fxml");
        }
        else // impossibru error: the user is of a type whose class does not exist yet!
        {
            SceneSwitcher.raiseAlert_BugCheck("Impossible: the user is of a type whose class does not exist yet!\n" + user.toString());
        }
    }
    
    @FXML
    private void Debug_OpenDashboard(ActionEvent event)
    {
        // we only need a handle to stage, it doesnt matter what element we use to get it
        Stage cur_stage = (Stage) Btn_Login.getScene().getWindow();
                
        if (event.getSource().equals(Debug_OpenLibrarianDashboard))
        {
            //SceneSwitcher.SwitchToScene(cur_stage);
            cur_stage.setResizable(true);
            SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/abdullah/LibrarianDashboard.fxml");
        }
        
    }

    @FXML
    private void Debug_OpenIELTSCandidateDashboard(ActionEvent event){
        Stage cur_stage = (Stage) Btn_Login.getScene().getWindow();
        if (event.getSource().equals(Debug_OpenIELTSCandidateDashboard)){
            cur_stage.setResizable(true);
            SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/protik/IELTSCandidate/IELTSCandidateDashboard .fxml");
        } 
    }

    @FXML
    private void Debug_OpenAdminDashboard(ActionEvent event) {
        Stage cur_stage = (Stage) Btn_Login.getScene().getWindow();
    if (event.getSource().equals(Debug_OpenAdminDashboard)){
        cur_stage.setResizable(true);
        SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/samira/AdminDashboardScene.fxml");
    }

   }

    @FXML
    private void Debug_OpenInstructorDashboard(ActionEvent event) {
        Stage cur_stage = (Stage) Btn_Login.getScene().getWindow();
    if (event.getSource().equals(Debug_OpenInstructorDashboard)){
        cur_stage.setResizable(true);
        SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/sopen/InstructorDashboard.fxml");
    }
    }

    @FXML
    private void Debug_OpenLibraryMemberDashboard(ActionEvent event) {
        Stage cur_stage = (Stage) Btn_Login.getScene().getWindow();
    if (event.getSource().equals(Debug_OpenLibraryMemberDashboard)){
        cur_stage.setResizable(true);
        SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/protik/LibraryMember/LibraryMemberDashboard.fxml");
    }
    }

    @FXML
    private void Debug_OpenInvigilatorDashboard(ActionEvent event) {
        Stage cur_stage = (Stage) Btn_Login.getScene().getWindow();
    if (event.getSource().equals(Debug_OpenInvigilatorDashboard)){
        cur_stage.setResizable(true);
        SceneSwitcher.switchToScene(cur_stage, "/FXMLScenes/Users/sopen/InvigilatorDeshboard.fxml");
    }
    }

   
}
