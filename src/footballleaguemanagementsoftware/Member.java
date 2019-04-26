/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballleaguemanagementsoftware;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Member implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    private int id;
    private String fullName;
    private String userName;
    private String password;
    private String role;
    
    public Member(){
        
    }
    public Member(String fullName,String userName, String password,String role){
        this.fullName=fullName;
        this.password=password;
        this.userName=userName;
        this.role=role;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public void setRole(String role) {
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
