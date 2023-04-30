package projectbritishcouncil.Users.protik;

import java.util.Date;
import projectbritishcouncil.common.BasicUser;

public class IELTSCandidate extends BasicUser{
    private String mothersName,fathersName,contactNo,passportNo,gender,month,city,venue,time,testType,disability;
    
    public IELTSCandidate(String Name, String Email, String Password, Date DOJ, Date DOB) {
        super(Name, Email, Password, DOJ, DOB);
    }

    public IELTSCandidate(String mothersName, String fathersName, String contactNo, String passportNo, String gender, String month, String city, String venue, String time, String testType, String disability, String Name, String Email, String Password, Date DOJ, Date DOB) {
        super(Name, Email, Password, DOJ, DOB);
        this.mothersName = mothersName;
        this.fathersName = fathersName;
        this.contactNo = contactNo;
        this.passportNo = passportNo;
        this.gender = gender;
        this.month = month;
        this.city = city;
        this.venue = venue;
        this.time = time;
        this.testType = testType;
        this.disability = disability;
    }
    
    

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }
    
    
}
