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
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class usuarioDAO {
    private Connection conn;
    
    
    usuarioDAO(Connection c)
    {
    this.conn=c;
    }
    
    public void insert(String cpf, String senha,String nome) throws SQLException
    {
        try{
        String sql ="insert into usuario(cpf,senha) values ('"+cpf+"','"+senha+"')";
       java.sql.PreparedStatement ps= conn.prepareStatement(sql);
       ps.executeUpdate();
        }
        catch(SQLException ex){showMessageDialog(null,ex);}
       
    }
    
    public void update(String cpf,String senha) throws SQLException
    {
        try
        {
            String sql="update usuario set senha='"+senha+"' where cpf='"+cpf+"' ";
            java.sql.PreparedStatement ps= conn.prepareStatement(sql);
            ps.executeUpdate();
            showMessageDialog(null,"Atualizado com sucesso ");
            
        }catch(SQLException ex){showMessageDialog(null,ex);}
    }
    public void remove (String cpf)throws SQLException
    {
        try
        {
            String sql="delete from usuario where cpf='"+cpf+"'";
            java.sql.PreparedStatement ps=conn.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            showMessageDialog(null,"Deletado com sucesso!");
        }catch(Exception ex){showMessageDialog(null,ex);}
    }
    public boolean select(String strcpf, String senha) throws SQLException
    {
     
        String sql="select* from usuario where cpf='"+strcpf+"' and senha='"+senha+"'";
        String cpf="";
        boolean log=false;
        try
        {
            java.sql.PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next())
            {
                int id= rs.getInt("id");
                 cpf= rs.getString("cpf");
                log=true;
                princ p = new princ(cpf);
                p.setVisible(true);
                return log;
                
                
               
                
             
            }
            
        }catch(Exception ex){showMessageDialog(null,ex); return log;  
        }
        return log;
        
    }

  
    
}
