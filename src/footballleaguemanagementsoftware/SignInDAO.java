/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballleaguemanagementsoftware;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class SignInDAO extends DAO{
    
    public Member mem=null;
    
    public SignInDAO(){
        super();
    }
    
    public int isMember(String usn,String pw){
        
        String sql="SELECT * FROM member WHERE password=? AND username=?";
        
        try {
            PreparedStatement pstm=con.prepareStatement(sql);
//            pstm.setString(1,usn);
            pstm.setString(1, pw);
            pstm.setString(2,usn);
            ResultSet rs=pstm.executeQuery();
            
            if(rs.next()){
                mem=new Member();
                mem.setFullName(rs.getString(2));
                mem.setRole(rs.getString(4));
                return checkMemberRole(mem);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(SignInDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;
            
    }
    
    public int checkMemberRole(Member m){
       if(m.getRole().toLowerCase().equals("administrator")){
           return 1;
       }
       else if(m.getRole().toLowerCase().equals("manager")){
           return 2;
       }
       else if(m.getRole().toLowerCase().equals("reporter")){
           return 3;
       }
       else if(m.getRole().toLowerCase().equals("client")){
           return 4;
       }
       else{
           return -1;
       }
    }
    
    public String memberName(){
        return mem.getFullName();
    }
}
