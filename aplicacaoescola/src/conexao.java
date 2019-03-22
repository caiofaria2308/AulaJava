/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
import java.sql.*;
public class conexao {
    
    public conexao()
    {
           
        
        
    }
    Connection conectar() {
          Connection conn=null;
        try
        {
            String driver="com.mysql.jdbc.Driver";
            Class.forName(driver);
            
            
            String url="jdbc:mysql://localhost/aulajava";
            conn=DriverManager.getConnection(url,"root","");
            return conn;
        }
        catch(Exception ex)
        {
           System.out.println(ex);
           return conn;
           
        }
    
        
        
    }
    
        
    }
    

