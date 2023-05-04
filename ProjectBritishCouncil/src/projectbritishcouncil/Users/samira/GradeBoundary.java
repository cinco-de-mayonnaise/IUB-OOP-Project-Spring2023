/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.Users.samira;
import java.util.Date;
import projectbritishcouncil.common.BasicUser;
import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author samir
 */
    public class GradeBoundary extends BasicUser {
       private SimpleStringProperty month, year;

    public GradeBoundary(String month, String year, String Name, String Email, String Password, Date DOJ, Date DOB) {
        super(Name, Email, Password, DOJ, DOB);
        this.month = new SimpleStringProperty(month);
        this.year = new SimpleStringProperty(year);
    }

    public SimpleStringProperty getMonth() {
        return month;
    }

    public void setMonth(SimpleStringProperty month) {
        this.month = month;
    }

    public SimpleStringProperty getYear() {
        return year;
    }

    public void setYear(SimpleStringProperty year) {
        this.year = year;
    }
       
       
    }

 

 
 
    
