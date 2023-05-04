/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package FXMLScenes.Users.samira;

import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import projectbritishcouncil.common.util.SceneSwitcher;
import javafx.stage.Stage;
import projectbritishcouncil.Users.samira.Employee;


/**
 * FXML Controller class
 *
 * @author samir
 */
public class ApplyForLeaveSceneController implements Initializable {

    @FXML
    private TextArea applicationTextArea;
    @FXML
     private TextField employeeIdTextField;
     private AnchorPane scenePane;
     Stage stage;
    @FXML
    private MenuButton MenuMenuBar;
    @FXML
    private MenuButton settignsMenuBar;
    @FXML
    private ComboBox<String> employeeCategoryComboBox;
     private ArrayList<Employee> employeeList = new ArrayList<>();
    @FXML
    private Label showLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       employeeList.add(new Employee("Samira Binte Khair", "Admin"));
       employeeList.add(new Employee("Samira Binte Khair", "Examiner"));
       employeeList.add(new Employee("Ahnaf Abdullah", "Librarian"));
       employeeList.add(new Employee("Mr John", "IELTS instructor"));

        for (Employee employee : employeeList) {
           employeeCategoryComboBox.getItems().add(employee.getName());
        }
        // TODO
    }    

    private void goHomeButtonOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/FXMLScenes.Users.samira/ExaminerDashboardScene.fxml", true);
    }

    private void submitApplicationButtonOnClick(ActionEvent event) throws IOException {
        String employeeId = employeeIdTextField.getText();
        String employeeType = employeeCategoryComboBox.getValue();
        String application = applicationTextArea.getText();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("application.txt", true))) {
            writer.write("Employee ID: " + employeeId + "\n");
            writer.write("Employee Type: " + employeeType + "\n");
            writer.write("Application:\n" + application + "\n");
            writer.write("------------------------------\n");

            employeeIdTextField.clear();
            employeeCategoryComboBox.getSelectionModel().clearSelection();
            applicationTextArea.clear();
              showLabel.setText("Your application has been submitted.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
  }
    @FXML
    private void goHomeButtonOnClick(javafx.event.ActionEvent event) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/FXMLScenes.Users.samira/ExaminerDashboardScene.fxml", true);
    }

    @FXML
    private void goBackButtonOnClick(javafx.event.ActionEvent event) {
          Alert alert = new Alert(AlertType.CONFIRMATION);
    alert.setTitle("Go Back");
    alert.setHeaderText("You're about to leave this page");
    alert.setContentText("Are you sure you want to leave this page?");

    ButtonType confirmButtonType = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
    ButtonType cancelButtonType = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
    alert.getButtonTypes().setAll(confirmButtonType, cancelButtonType);

    Optional<ButtonType> result = alert.showAndWait();
    if (result.isPresent() && result.get() == confirmButtonType) {
        SceneSwitcher.createStagewithScene("/FXMLScenes/Users/samira/FXMLScenes.Users.samira/ExaminerDashboardScene.fxml", true);
     }
  }

    @FXML
    private void submitApplicationButtonOnClick(javafx.event.ActionEvent event) {
    }
}
