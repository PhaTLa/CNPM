/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballleaguemanagementsoftware;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ADMIN
 */
public class DAO {
    protected static Connection con;
    
    public DAO(){
        if(con==null){
            String dbUrl="jdbc:mysql://localhost:3306/footballleague";
            String dbClass="com.mysql.cj.jdbc.Driver";
            
            try{
                Class.forName(dbClass);
                con=DriverManager.getConnection(dbUrl,"root","123456789");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
