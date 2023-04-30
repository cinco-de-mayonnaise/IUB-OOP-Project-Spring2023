/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.abdullah;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import projectbritishcouncil.Users.abdullah.Librarian;
import projectbritishcouncil.common.util.CommonInstancesClass;
import static projectbritishcouncil.common.util.Identifiers.CURRENT_USER;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Abdullah
 */
public class LibrarianDashboardController implements Initializable {

    private int dashboard_state = 0;
    
    private Librarian cur_user;
    
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
    private BorderPane LibrarianDashboard_BorderPane;
    @FXML
    private GridPane Librarian_InteractiveDashboard_GridPane;
    @FXML
    private Line BorderLine;
    @FXML
    private Text Text_LibrarianNameInDashboard;
    @FXML
    private Label LibraryMembersInLibraryCountView;
    @FXML
    private Label StaffInLibraryCountView;
    @FXML
    private Label GuestsInLibraryCountView;
    @FXML
    private Label TotalInLibraryCountView;
    @FXML
    private Label ActiveLibraryMembersCountView;
    @FXML
    private Label InactiveLibraryMembersCountView;
    @FXML
    private Label TotalLibraryMembersCountView;
    @FXML
    private Label BooksBorrowedOutCountView;
    @FXML
    private Label BooksRemainingCountView;
    @FXML
    private Label TotalBooksCountView;
    @FXML
    private MenuItem MenuItem_ChangeDatabaseFile;
    @FXML
    private MenuItem MenuItem_CreditsWindow;
    @FXML
    private Hyperlink Btn_SendNotices;
    @FXML
    private Hyperlink Btn_DetailedMemberStatusView;
    @FXML
    private ScrollPane TheScrollPaneInHere;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        BorderLine.endXProperty().bind(LibrarianDashboard_BorderPane.widthProperty());
        CommonInstancesClass CIC = CommonInstancesClass.getInstance();
        this.cur_user = (Librarian) CIC.getObject(CURRENT_USER);
        
        if (this.cur_user != null)
        {
            Text_LibrarianNameInDashboard.setText(this.cur_user.getName());
        }
    }    

    

    @FXML
    private void click_MI_ChangeDatabaseFile(ActionEvent event)
    {
        
    }

    @FXML
    private void click_MI_Credits(ActionEvent event)
    {
        
    }

    @FXML
    private void click_InitAddRemoveBook(ActionEvent event)
    {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/abdullah/Librarian_AddRemoveBookPhase/Librarian_AddRemBookPhase_StartScene.fxml", true);
    }

    @FXML
    private void click_InitSeeMemberQueries(ActionEvent event)
    {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/abdullah/Librarian_MemberQueriesSuggestionsPhase/Librarian_MemberQuerSuggPhase_Main__frame.fxml", false);
    }

    @FXML
    private void click_InitMembershipRenewal(ActionEvent event)
    {
        
    }

    @FXML
    private void click_InitReviewApplicationForms(ActionEvent event)
    {
        SceneSwitcher.raiseAlert_NotImplemented();
    }

    @FXML
    private void click_InitSendNotice(ActionEvent event)
    {
        
    }

    @FXML
    private void click_InitDetailedLibraryStatusView(ActionEvent event)
    {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/abdullah/Librarian_BorrowersListPhase/Librarian_BorrowersListPhase_Main.fxml", true);
    }

    @FXML
    private void click_DetailedMemberStatus(ActionEvent event)
    {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/abdullah/Librarian_MembersListPhase/Librarian_MembersListPhase_Main.fxml", true);
    }
    
    
}
