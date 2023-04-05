/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbritishcouncil.Users.samira;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author samir
 */
public class GradeBoundary {
    private SimpleStringProperty month, year;

    

    public GradeBoundary(String month, String year) {
        this.month = new SimpleStringProperty(month);
        this.year =  new SimpleStringProperty(year);
    }

    public String getMonth() {
        return month.get();
    }
  
    public void setMonth(SimpleStringProperty month) {
        this.month = month;
    }  
    


    public String getYear() {
        return year.get();
    }

    public void setYear(SimpleStringProperty year) {
        this.year = year;
    }
    
}
