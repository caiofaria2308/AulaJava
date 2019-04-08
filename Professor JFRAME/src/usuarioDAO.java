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
        String sql ="insert into usuario(nome,cpf,senha) values ('"+nome+"','"+cpf+"','"+senha+"')";
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
    public String select(String strcpf, String senha) throws SQLException
    {
     
        String sql="select* from usuario where cpf='"+strcpf+"' and senha='"+senha+"'";
        String nome="";
        try
        {
            java.sql.PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next())
            {
                int id= rs.getInt("id");
                String cpf= rs.getString("cpf");
                 nome=rs.getString("nome");
                return nome;
               
                
             
            }
            
        }catch(Exception ex){showMessageDialog(null,ex); nome=""; return nome;  
        }
        return nome;
        
    }

  
    
}
