/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballleaguemanagementsoftware;

import static footballleaguemanagementsoftware.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class MatchDAO extends DAO{
    
    public MatchDAO(){
        super();
    }
    
    public ArrayList loadModel(String s){
         ArrayList <Match> alm=new ArrayList();
         ResultSet resultset=null;
        
        try {
            String sql="SELECT * FROM footballleague.`match` WHERE (clubAName='"+s+"') OR (clubBName='"+s+"')";
            Statement stm=(Statement) con.createStatement();
//            PreparedStatement stm = con.prepareStatement(sql);
//            stm.setString(1,"'"+s+"'");
//            stm.setString(2,"'"+s+"'");
            resultset=stm.executeQuery(sql);
            while(resultset.next()){
                Match m1=new Match();
                m1.setClubANam(resultset.getString(2));
                m1.setClubBName(resultset.getString(3));
                m1.setClubAGoal(resultset.getInt(7));
                m1.setClubBGoal(resultset.getInt(8));
                m1.setDate(resultset.getString(4));
                m1.setWinner(this.winnerChosing(m1));
                alm.add(m1);
            }
            
            return alm;
        } catch (SQLException ex) {
            Logger.getLogger(FootballClubDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alm;
    }
    
    public String winnerChosing(Match m){
        if(m.getClubAGoal()>m.getClubBGoal()){
            return m.getClubANam();
        }else if(m.getClubAGoal()<m.getClubBGoal()){
            return m.getClubBName();
        }else{
            return "Draw";
        }
    }
    
}
