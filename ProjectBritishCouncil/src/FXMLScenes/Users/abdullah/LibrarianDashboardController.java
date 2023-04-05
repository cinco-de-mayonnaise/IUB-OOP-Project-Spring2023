/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.abdullah;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Abdullah
 */
public class LibrarianDashboardController implements Initializable {

    @FXML
    private Hyperlink Btn_AddRemoveBook;
    @FXML
    private Hyperlink Btn_SeeMemberQueries;
    @FXML
    private Hyperlink Btn_MembershipRenewal;
    @FXML
    private Hyperlink Btn_DetailedLibraryStatusView;
    @FXML
    private Hyperlink Btn_ReviewApplicationForms;
    @FXML
    private HBox topbarimageLibrarian;
    @FXML
    private Button Btn_Logout;
    @FXML
    private Text Text_LibrarianNameInDashboard;
    @FXML
    private BorderPane LibrarianDashboard_BorderPane;
    @FXML
    private AnchorPane BlankLibrarianDashboardCenter;
    
    private Node InteractiveUserDashboard;
    
    private states dashboard_state;
    
    enum states
    {   
        UserDashboard,
        MemberQuerSuggPhase,
        
    };
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dashboard_state = states.UserDashboard;
        InteractiveUserDashboard = SceneSwitcher.getRootNodeFromURL("/FXMLScenes/Users/abdullah/Librarian_InteractiveUserDashboard/Librarian_InteractiveUserDashboard_Main__frame.fxml");
        
        LibrarianDashboard_BorderPane.setCenter(InteractiveUserDashboard);
        
    }    

    @FXML
    private void click_InitAddRemoveBook(MouseEvent event)
    {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/abdullah/Librarian_AddRemoveBookPhase/Librarian_AddRemBookPhase_StartScene.fxml", true);
    }

    @FXML
    private void click_InitSeeMemberQueries(MouseEvent event)
    {
        // load node into center region of borderpane!!
        if (dashboard_state == states.MemberQuerSuggPhase)
        {
            LibrarianDashboard_BorderPane.setCenter(BlankLibrarianDashboardCenter);
            dashboard_state = states.UserDashboard;
        }
        else
        {
            LibrarianDashboard_BorderPane.setCenter(SceneSwitcher.getRootNodeFromURL("/FXMLScenes/Users/abdullah/Librarian_MemberQueriesSuggestionsPhase/Librarian_MemberQuerSuggPhase_Main__frame.fxml"));
            dashboard_state =  states.MemberQuerSuggPhase;
        }
            
    }
    
    @FXML
    private void click_InitMembershipRenewal(MouseEvent event) {
    }

    @FXML
    private void click_InitDetailedLibraryStatusView(MouseEvent event)
    {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/abdullah/Librarian_BorrowersListPhase/Librarian_BorrowersListPhase_Main.fxml", true);
    }

    @FXML
    private void click_InitReviewApplicationForms(MouseEvent event)
    {
        SceneSwitcher.raiseAlert_NotImplemented();
    }
    
}
