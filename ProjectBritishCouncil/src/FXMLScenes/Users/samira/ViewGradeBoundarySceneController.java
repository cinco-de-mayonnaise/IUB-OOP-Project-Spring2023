/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author samir
 */
public class ViewGradeBoundarySceneController implements Initializable {

    @FXML
    private ComboBox<String> menuComboBox;
    @FXML
    private ComboBox<String> settingsComboBox;
    @FXML
    private TableView<GradeBoundary> gbTtableView;
    @FXML
    private TableColumn<GradeBoundary, String> monthColumn;
    @FXML
    private TableColumn<GradeBoundary, String> yearColumn;
    @FXML
    private ComboBox<?> yearComboBox;
    @FXML
    private ComboBox<?> monthComboBox;
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
    @FXML
    private AnchorPane anchorpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        monthColumn.setCellValueFactory(new PropertyValueFactory<GradeBoundary, String>("month"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<GradeBoundary, String>("year"));
        
       gbTtableView.setItems(getPeople());
        // TODO
    }    
    
    
    public ObservableList<GradeBoundary> getPeople(){
        ObservableList<GradeBoundary> people =FXCollections.observableArrayList();
        people.add(new GradeBoundary("Jan", "2017"));
        people.add(new GradeBoundary("Jan", "2017"));
        people.add(new GradeBoundary("Jan", "2017"));
        people.add(new GradeBoundary("Jan", "2017"));
        people.add(new GradeBoundary("Jan", "2017"));
        
        
        return people;
}
    @FXML
    private void goHomeButtonOnClick(ActionEvent event) {
         SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/ExaminerDashboardScene.fxml", false);
    }

    @FXML
    private void viewGradeBoundaryButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
         Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         stage.close();
    }

   /* @FXML
    private void hyperlink(ActionEvent event) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(java.net.URI.create("https://www.google.com/search?q=igcse+2017+mark+schemes&rlz=1C1BNSD_enBD1030BD1030&oq=igcse+2017+mark+schemes&aqs=chrome..69i57j0i22i30l2j0i390i650l2.11687j0j15&sourceid=chrome&ie=UTF-8"));
    }

    @FXML
    private void hyperlink2(ActionEvent event) {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(java.net.URI.create("https://www.google.com/search?q=igcse+june+2017+mark+schemes&rlz=1C1BNSD_enBD1030BD1030&sxsrf=APwXEdeSGrM75pNYOHCYAmoTn_5s-zF8lw%3A1680730818396&ei=wuotZID0F7C74-EP7oGfkAo&ved=0ahUKEwiA3ZKb2pP-AhWw3TgGHe7AB6IQ4dUDCA8&uact=5&oq=igcse+june+2017+mark+schemes&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIFCAAQogQyBQgAEKIEMgUIABCiBDoKCAAQRxDWBBCwAzoGCAAQBxAeOgUIABCABDoICAAQBRAHEB46BggAEAUQHjoICAAQigUQhgM6CAghEKABEMMESgQIQRgAUNIrWMVcYPZraAFwAHgAgAHXAYgB6QqSAQU4LjQuMZgBAKABAcgBCMABAQ&sclient=gws-wiz-serp"));
    }

    @FXML
    private void hyperlink3(ActionEvent event) {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(java.net.URI.create
    }

    @FXML
    private void hyperlink4(ActionEvent event) {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(java.net.URI.create
    }

    @FXML
    private void hyperlink5(ActionEvent event) {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(java.net.URI.create
    }*/
    
}
