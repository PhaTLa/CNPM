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
public class FootballLeague implements Serializable{
    private static final long serialVersionUID=1L;
    private int id;
    private int rankOfLeague;
    private String name;
    private String des;
    
    public FootballLeague(){
        
    }

    public FootballLeague(int id, int rankOfLeague, String name, String des) {
        this.id = id;
        this.rankOfLeague = rankOfLeague;
        this.name = name;
        this.des = des;
    }

    public int getId() {
        return id;
    }

    public int getRankOfLeague() {
        return rankOfLeague;
    }

    public void setRankOfLeague(int rankOfLeague) {
        this.rankOfLeague = rankOfLeague;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "FootballLeague{" + "rankOfLeague=" + rankOfLeague + ", name=" + name + ", des=" + des + '}';
    }
    
    
}
