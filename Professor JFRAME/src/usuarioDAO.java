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
    private String cpf;
    
    usuarioDAO(Connection c)
    {
        
    this.conn=c;
   
    }
    
    public boolean insert(String cpf, String senha,String nome) throws SQLException
    {
        usuarioDAO u=new usuarioDAO(conn);
        String testeCPF=u.verificar(cpf);
        boolean validacao=false;
        if(testeCPF.equals(cpf)){
        showMessageDialog(null,"USUARIO JA CADASTRADO");
        
        
        }else
        {
        try{
        String sql ="insert into usuario(cpf,senha) values ('"+cpf+"','"+senha+"')";
        java.sql.PreparedStatement ps= conn.prepareStatement(sql);
       ps.executeUpdate();
       validacao=true;
        }
        catch(SQLException ex){showMessageDialog(null,ex);}
         }
        return validacao;
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
                
                this.cpf=cpf;
                return log;
                
                
               
                
             
            }
            
        }catch(Exception ex){showMessageDialog(null,ex); return log;  
        }
        return log;
        
    }
    public String cpf()
    {
    return this.cpf;
    }
    
    public String verificar(String strcpf) throws SQLException
    {
     
        String sql="select* from usuario where cpf='"+strcpf+"' ";
        String cpf="";
        try
        {
            java.sql.PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next())
            {
                 cpf= rs.getString("cpf");
                return cpf;
                
            }
            
        }catch(Exception ex){showMessageDialog(null,ex);   
        }
        return cpf;
        
    }

  
    
}
