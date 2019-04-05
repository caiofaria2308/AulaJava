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
public class alunoDAO {
    private Connection conn;
    
    
    alunoDAO(Connection c)
    {
    this.conn=c;
    }
    
    public void insert(String nome) throws SQLException
    {
        try{
        String sql ="insert into aluno(nome) values ('"+nome+"')";
       java.sql.PreparedStatement ps= conn.prepareStatement(sql);
       ps.executeUpdate();
       showMessageDialog(null,"Cadastrado com sucesso");
        }
        catch(SQLException ex){showMessageDialog(null,ex);}
       
    }
    
    public void update(String cod,String nNew) throws SQLException
    {
        try
        {
            String sql="update aluno set nome='"+nNew+"' where id='"+cod+"' ";
            java.sql.PreparedStatement ps= conn.prepareStatement(sql);
            ps.executeUpdate();
            showMessageDialog(null,"Atualizado com sucesso ");
            
        }catch(SQLException ex){showMessageDialog(null,ex);}
    }
    public void remove (String cod)throws SQLException
    {
        try
        {
            String sql="delete from aluno where id='"+cod+"'";
            java.sql.PreparedStatement ps=conn.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            showMessageDialog(null,"Deletado com sucesso!");
        }catch(Exception ex){showMessageDialog(null,ex);}
    }
    public void select() throws SQLException
    {
     List listar= new ArrayList();
        String sql="select* from aluno";
        
        try
        {
            java.sql.PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next())
            {
                int id= rs.getInt("id");
                String name= rs.getString("nome");
                
                listar.add("\nCÓDIGO: "+id+" \nNOME: "+name+"\n");
                
            }
            showMessageDialog(null,listar);
            
        }catch(Exception ex){showMessageDialog(null,ex);        }
        
        
    }
    
}
