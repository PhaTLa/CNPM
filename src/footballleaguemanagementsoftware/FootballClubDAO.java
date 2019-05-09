/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballleaguemanagementsoftware;

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
public class FootballClubDAO extends DAO{
    public FootballClub fc1;
    
    public FootballClubDAO(){
        super();    
    }
    
    public ArrayList loadModel(){
         ArrayList <FootballClub> alf=new ArrayList();
         ResultSet resultset=null;
        
        try {
            String sql="SELECT * FROM footballclub";
            Statement stm=(Statement) con.createStatement();
            resultset=stm.executeQuery(sql);
            while(resultset.next()){
                FootballClub f1=new FootballClub();
                f1.setName(resultset.getString(2));
                f1.setPlayerNum(Integer.parseInt(resultset.getString(3)));
                f1.setStadiumName(resultset.getString(4));
                f1.setStadiumLocation(resultset.getString(6));
                f1.setCoachName(resultset.getString(7));
                f1.setCoachNationarity(resultset.getString(8));
                f1.setCoachDateOfBirth(resultset.getString(9));
                f1.setDes(resultset.getString(10));
                f1.setScore(this.countScore(resultset.getString(2)));
                f1.setPlayedMatch(this.countMatch(resultset.getString(2)));
                alf.add(f1);
            }
            
            Collections.sort(alf, FootballClub.com);
            
            return alf;
        } catch (SQLException ex) {
            Logger.getLogger(FootballClubDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alf;
    }
   public int countScore(String clubname){
       ArrayList <Match> arlm=new ArrayList<>();
       int count=0;
        try {
            String sql="SELECT * FROM footballleague.`match`";
            ResultSet rs1=null;
            Statement stm=(Statement) con.createStatement();
            rs1=stm.executeQuery(sql);
            while(rs1.next()){
                Match m=new Match();
                m.setClubANam(rs1.getString(2));
                m.setClubBName(rs1.getString(3));
                m.setClubAGoal(rs1.getInt(7));
                m.setClubBGoal(rs1.getInt(8));
                arlm.add(m);
            }
            for(Match m1 : arlm){
                if(m1.getClubANam().equals(clubname)){
                    if(m1.getClubAGoal()>m1.getClubBGoal()){
                        count+=3;
                    }
                    if(m1.getClubAGoal()<m1.getClubBGoal()){
                        count-=3;
                    }
                    if(m1.getClubAGoal()==m1.getClubBGoal()){
                        count+=1;
                    }
                }
                if(m1.getClubBName().equals(clubname)){
                    if(m1.getClubAGoal()>m1.getClubBGoal()){
                        count-=3;
                    }
                    if(m1.getClubAGoal()<m1.getClubBGoal()){
                        count+=3;
                    }
                    if(m1.getClubAGoal()==m1.getClubBGoal()){
                        count+=1;
                    }
                }
                
            }
             return count;
        } catch (SQLException ex) {
            Logger.getLogger(FootballClubDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
   }
   public int countMatch(String clubname){
       ArrayList <Match> arlm=new ArrayList<>();
       int count=0;
        try {
            String sql="SELECT * FROM footballleague.`match`";
            ResultSet rs1=null;
            Statement stm=(Statement) con.createStatement();
            rs1=stm.executeQuery(sql);
            while(rs1.next()){
                Match m=new Match();
                m.setClubANam(rs1.getString(2));
                m.setClubBName(rs1.getString(3));
                arlm.add(m);
            }
            for(Match m1 : arlm){
                if(m1.getClubANam().equals(clubname)){
                    count++;
                }
                if(m1.getClubBName().equals(clubname)){
                    count++;
                }
                
            }
             return count;
        } catch (SQLException ex) {
            Logger.getLogger(FootballClubDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
   }
   
}
