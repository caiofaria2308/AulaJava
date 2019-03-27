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
import static javax.swing.JOptionPane.showMessageDialog;

public class conexao {
    Connection conectar() throws SQLException, Exception
    {
            Connection conn=null;
            try
            {
                String driver="com.googlecode.paradox.Driver";
                Class.forName(driver);
                String caminho="c:/automac";
                String url="jdbc:paradox:/"+caminho;
                conn=DriverManager.getConnection(url);
                return conn;
            }catch(SQLException ex){showMessageDialog(null,ex); System.out.println(ex);return conn;}
    }
}
