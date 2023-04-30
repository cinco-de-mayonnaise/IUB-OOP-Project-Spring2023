/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXMLScenes.Users.protik.IELTSCandidate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import projectbritishcouncil.Users.protik.IELTSCandidate;
import projectbritishcouncil.common.util.SceneSwitcher;

/**
 * FXML Controller class
 *
 * @author Protik Hasan
 */
public class IELTSRegistrationSceneController implements Initializable {
    
    //String[] dhakaVenues = {"Mentors Education Mirpur","Mentors Education Uttara", "Futureed Ahmed Tower Banani", "Wings Learning Center Dhanmondi", "Penstone English Institute Uttara"};
    //String[] chittagongVenues = {"Radisson Blu Chittagong"};
    //String[] sylhetVenues = {"British Council,Sylhet"};
    //String[] rajshahiVenues = {"Project Headway Rajshahi"};
    //String[] khulnaVenues = {"Lexicon Ava Center Khulna"};
    
    @FXML
    private TextField namefxid;
    @FXML
    private TextField mothersnamefxid;
    @FXML
    private TextField passportnofxid;
    @FXML
    private TextField fathersnamefxid;
    @FXML
    private TextField contactnofxid;
    @FXML
    private RadioButton maleradiofxid;
    @FXML
    private RadioButton femaleradiofxid;
    @FXML
    private ComboBox<String> cityCombobox;
    @FXML
    private ComboBox<String> disabilityCombobox;
    @FXML
    private ComboBox<String> venueCombobox;
    @FXML
    private ComboBox<String> testTypeCombobox;
    private ToggleGroup tg;
    @FXML
    private ComboBox<String> timeCombobox;
    @FXML
    private ComboBox<String> monthCombobox;
    @FXML
    private Label labelfxId;
    
    private final ObservableList<String> dhakaVenues = FXCollections.observableArrayList("Mentors Education Mirpur","Mentors Education Uttara", "Futureed Ahmed Tower Banani", "Wings Learning Center Dhanmondi", "Penstone English Institute Uttara");
    private ObservableList<String> chittagongVenues = FXCollections.observableArrayList("Radisson Blu Chittagong");
    private ObservableList<String> sylhetVenues = FXCollections.observableArrayList("British Council,Sylhet");
    private ObservableList<String> rajshahiVenues = FXCollections.observableArrayList("Project Headway Rajshahi");
    private ObservableList<String> khulnaVenues = FXCollections.observableArrayList("Lexicon Ava Center Khulna");

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg = new ToggleGroup();
        maleradiofxid.setToggleGroup(tg);
        femaleradiofxid.setToggleGroup(tg);
        //maleradiofxid.setSelected(true);
        
        disabilityCombobox.getItems().addAll("None","Enlarged Print Test Paper", "Braille Test Paper", "Amanuensis", "Amplification Equipment", "Voice Activated Software");
        testTypeCombobox.getItems().addAll("Academic on Paper", "Academic on Computer", "General Training on Paper","General Training on Computer");
        cityCombobox.getItems().addAll("Dhaka", "Rajshahi", "Sylhet", "Khulna", "Chattogram");
        timeCombobox.getItems().addAll("9am to 11.30am", "12.30pm to 3pm", "4pm to 6.30pm");
        monthCombobox.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        cityCombobox.setOnAction(event -> {
        String selectedCity = cityCombobox.getValue();
        if(selectedCity.equals("Dhaka")) {
            venueCombobox.setItems(dhakaVenues);
        } else if(selectedCity.equals("Rajshahi")) {
            venueCombobox.setItems(rajshahiVenues);
        } else if(selectedCity.equals("Sylhet")) {
            venueCombobox.setItems(sylhetVenues);
        } else if(selectedCity.equals("Khulna")) {
            venueCombobox.setItems(khulnaVenues);
        } else if(selectedCity.equals("Chittagong")) {
            venueCombobox.setItems(chittagongVenues);
        }  
    }
        );
    }    

    @FXML
    private void goBackbuttonOnClick(ActionEvent event) {
    Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    stage.close();
    }

    @FXML
    private void RegisterbuttonOnClick(ActionEvent event) {
    String name = namefxid.getText();
    String mothersName = mothersnamefxid.getText();
    String fathersName = fathersnamefxid.getText();
    String contactNo = contactnofxid.getText();
    String passportNo = passportnofxid.getText();
    String gender = maleradiofxid.isSelected() ? "Male" : "Female";
    String month = monthCombobox.getValue();
    String city = cityCombobox.getValue();
    String venue = venueCombobox.getValue();
    String time = timeCombobox.getValue();
    String testType = testTypeCombobox.getValue();
    String disability = disabilityCombobox.getValue();
    
    File f = null;
    FileOutputStream fos = null;      
    ObjectOutputStream oos = null;
        
    try {
        f = new File("RegistrationObjects.bin");
        if(f.exists()){
            fos = new FileOutputStream(f,true);
            oos = new AppendableObjectOutputStream(fos);                
        }
        else{
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);               
        }
        IELTSCandidate e = new IELTSCandidate(
            namefxid.getText(),
            mothersnamefxid.getText(),    
            fathersnamefxid.getText(),
            contactnofxid.getText(),
            passportnofxid.getText(),
            maleradiofxid.isSelected() ? "Male" : "Female",
            monthCombobox.getValue(),
            cityCombobox.getValue(),
            venueCombobox.getValue(),
            timeCombobox.getValue(),
            testTypeCombobox.getValue(),
            disabilityCombobox.getValue()
        );
            oos.writeObject(e);

        } catch (IOException ex) {
            Logger.getLogger(IELTSRegistrationSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(IELTSRegistrationSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /*public void writeToFile(String name,String mothersName,String fathersName, String contactNo, String passportNo, 
            String gender, String month, String city, String venue, String time, String testType, String disability) {
    try {
        FileWriter writer = new FileWriter("Registration Data.txt", true);
        writer.write("Name:"+name+", Mothers Name: "+mothersName+", Fathers Name: "+fathersName+", Contact No: "+contactNo+", Passport No: "+passportNo+
     ", Gender: "+gender+"\n"+", Month: "+month+ "City: "+ city+", Venue: "+venue+", Time: "+time+", Test Type: "+testType+", Disability: "+disability);
        writer.close();
        labelfxId.setText("Text File generated Successfully");
        } catch (IOException e) {
            labelfxId.setText("An error occurred while writing to the file");
        }
    }
*/

  
}

