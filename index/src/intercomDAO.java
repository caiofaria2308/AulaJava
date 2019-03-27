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
public class intercomDAO {
    private Connection conn;
    intercomDAO(Connection c)
    {
    this.conn=c;
    }
    
    public void teste(String prevenda,String venda)
    {
        try
        {
           String sql="update vendas set numeroprevenda='"+prevenda+"' where numero='"+venda+"' ";
              java.sql.PreparedStatement ps= conn.prepareStatement(sql);
              ps.executeUpdate();
              showMessageDialog(null,"Atualizado com sucesso");
           
            
        }catch(Exception ex){showMessageDialog(null,ex); System.out.println(ex);}
    
    }
}
