/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FXMLScenes.Users.samira.modelClasses;
  

  public class ExaminerInfo {
    private final String name;
    private String email;
    private String age;
    private String address;
    private String phone;
    private String qualification;
    // Other fields related to examiner's info can be added here
    
    public ExaminerInfo(String name, String email, String password, String address, String phone, String qualification) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.qualification = qualification;
        
        
        
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
  
    

    @Override
    public String toString() {
        return "ExaminerInfo{" + "name=" + name + ", email=" + email + ", age=" + age + ", address=" + address + ", phone=" + phone + ", qualification=" + qualification + '}';
    }
            
}
/**
 *
 * @author samir
 */
