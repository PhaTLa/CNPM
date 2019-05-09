/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballleaguemanagementsoftware;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class FootballClub implements Serializable{
    private static final long serialVersionUID=1L;
    private int id,playerNum,score,playedMatch;
    private String name,stadiumName,stadiumLocation,coachName,coachNationarity,des,coachDateOfBirth;
    
    public static Comparator <FootballClub> com=new Comparator <FootballClub>(){
        @Override
        public int compare(FootballClub o1, FootballClub o2) {
            if(o1.getScore()==o2.getScore()){
                if(o1.getPlayedMatch()==o1.getPlayedMatch()){
                    return(o1.getName().compareTo(o2.getName()));
                }else if(o1.getPlayedMatch()>o1.getPlayedMatch()){
                    return -1;
                }else{
                    return 1;
                }
            }else if(o1.getScore()>o2.getScore()){
                return -1;
            }else{
                return 1;
            }
        }
        
    };
    
    public FootballClub(){
        
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPlayedMatch() {
        return playedMatch;
    }

    public void setPlayedMatch(int playedMatch) {
        this.playedMatch = playedMatch;
    }

    
    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public String getStadiumLocation() {
        return stadiumLocation;
    }

    public void setStadiumLocation(String stadiumLocation) {
        this.stadiumLocation = stadiumLocation;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getCoachNationarity() {
        return coachNationarity;
    }

    public void setCoachNationarity(String coachNationarity) {
        this.coachNationarity = coachNationarity;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getCoachDateOfBirth() {
        return coachDateOfBirth;
    }

    public void setCoachDateOfBirth(String coachDateOfBirth) {
        this.coachDateOfBirth = coachDateOfBirth;
    }

    @Override
    public String toString() {
        return "FootballClub{" + "id=" + id + ", playerNum=" + playerNum + ", name=" + name + ", stadiumName=" + stadiumName + ", stadiumLocation=" + stadiumLocation + ", coachName=" + coachName + ", coachNationarity=" + coachNationarity + ", des=" + des + ", coachDateOfBirth=" + coachDateOfBirth + '}';
    }
    
    
}
