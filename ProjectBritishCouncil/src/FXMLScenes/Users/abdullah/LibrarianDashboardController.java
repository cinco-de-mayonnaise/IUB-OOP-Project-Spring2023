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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void click_InitAddRemoveBook(MouseEvent event)
    {
        //SceneSwitcher.switchToScene((Stage)((Node)event.getSource()).getScene().getWindow(), "FXMLScenes/Users/abdullah/AddRemoveBookPhase/Librarian_AddRemBookPhase_StartScene.fxml");
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/abdullah/Librarian_AddRemoveBookPhase/Librarian_AddRemBookPhase_StartScene.fxml", true);
    }

    @FXML
    private void click_InitSeeMemberQueries(MouseEvent event)
    {
        // load node into center region of borderpane!!
        
        LibrarianDashboard_BorderPane.setCenter(SceneSwitcher.getRootNodeFromURL("/FXMLScenes/Users/abdullah/Librarian_MemberQueriesSuggestionsPhase/Librarian_MemberQuerSuggPhase_Main__frame.fxml"));
    }
    
    @FXML
    private void click_InitMembershipRenewal(MouseEvent event) {
    }

    @FXML
    private void click_InitDetailedLibraryStatusView(MouseEvent event) {
    }

    @FXML
    private void click_InitReviewApplicationForms(MouseEvent event) {
    }
    
}
