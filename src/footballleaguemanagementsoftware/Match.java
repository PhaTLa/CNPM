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
public class Match implements Serializable{
    private static final long serialVersionUID=1L;
    private String clubANam,clubBName,date,timeS,timeE,scorerName,playerYellowName,playerRedName,winner;
    private int id,clubAGoal,clubBGoal,yellowCard,redCard;
    
    public Match(){
        
    }

    public Match(String clubANam, String clubBName, String date, String timeS, String timeE, String scorerName, String playerYellowName, String playerRedName, int id, int clubAGoal, int clubBGoal, int yellowCard, int redCard) {
        this.clubANam = clubANam;
        this.clubBName = clubBName;
        this.date = date;
        this.timeS = timeS;
        this.timeE = timeE;
        this.scorerName = scorerName;
        this.playerYellowName = playerYellowName;
        this.playerRedName = playerRedName;
        this.id = id;
        this.clubAGoal = clubAGoal;
        this.clubBGoal = clubBGoal;
        this.yellowCard = yellowCard;
        this.redCard = redCard;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
    
    
    
    public String getClubANam() {
        return clubANam;
    }

    public void setClubANam(String clubANam) {
        this.clubANam = clubANam;
    }

    public String getClubBName() {
        return clubBName;
    }

    public void setClubBName(String clubBName) {
        this.clubBName = clubBName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeS() {
        return timeS;
    }

    public void setTimeS(String timeS) {
        this.timeS = timeS;
    }

    public String getTimeE() {
        return timeE;
    }

    public void setTimeE(String timeE) {
        this.timeE = timeE;
    }

    public String getScorerName() {
        return scorerName;
    }

    public void setScorerName(String scorerName) {
        this.scorerName = scorerName;
    }

    public String getPlayerYellowName() {
        return playerYellowName;
    }

    public void setPlayerYellowName(String playerYellowName) {
        this.playerYellowName = playerYellowName;
    }

    public String getPlayerRedName() {
        return playerRedName;
    }

    public void setPlayerRedName(String playerRedName) {
        this.playerRedName = playerRedName;
    }

    public int getClubAGoal() {
        return clubAGoal;
    }

    public void setClubAGoal(int clubAGoal) {
        this.clubAGoal = clubAGoal;
    }

    public int getClubBGoal() {
        return clubBGoal;
    }

    public void setClubBGoal(int clubBGoal) {
        this.clubBGoal = clubBGoal;
    }

    public int getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(int yellowCard) {
        this.yellowCard = yellowCard;
    }

    public int getRedCard() {
        return redCard;
    }

    public void setRedCard(int redCard) {
        this.redCard = redCard;
    }

    @Override
    public String toString() {
        return "Match{" + "clubANam=" + clubANam + ", clubBName=" + clubBName + ", date=" + date + ", timeS=" + timeS + ", timeE=" + timeE + ", scorerName=" + scorerName + ", playerYellowName=" + playerYellowName + ", playerRedName=" + playerRedName + ", clubAGoal=" + clubAGoal + ", clubBGoal=" + clubBGoal + ", yellowCard=" + yellowCard + ", redCard=" + redCard + '}';
    }
    
    
}
