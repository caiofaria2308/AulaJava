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
public class professorDAO implements IDAO<ProfessorObj>{
    private Connection conn;
    
    
    professorDAO(Connection c)
    {
    this.conn=c;
    }
    
    public void insert(ProfessorObj p) throws SQLException
    {
        try{
        String sql ="insert into professor(nome) values ('"+p.getNome()+"')";
       java.sql.PreparedStatement ps= conn.prepareStatement(sql);
       ps.executeUpdate();
       showMessageDialog(null,"Cadastrado com sucesso");
        }
        catch(SQLException ex){showMessageDialog(null,ex);}
       
    }
    
    public void update(ProfessorObj p) throws SQLException
    {
        try
        {
            String sql="update professor set nome='"+p.getNome()+"' where id='"+p.getCod()+"' ";
            java.sql.PreparedStatement ps= conn.prepareStatement(sql);
            ps.executeUpdate();
            showMessageDialog(null,"Atualizado com sucesso ");
            
        }catch(SQLException ex){showMessageDialog(null,ex);}
    }
    public void remove (ProfessorObj p)throws SQLException
    {
        try
        {
            String sql="delete from professor where id='"+p.getCod()+"'";
            java.sql.PreparedStatement ps=conn.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            showMessageDialog(null,"Deletado com sucesso!");
        }catch(Exception ex){showMessageDialog(null,ex);}
    }
    public void select() throws SQLException
    {
     List listar= new ArrayList();
        String sql="select* from professor order by id";
        
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
        }catch(Exception ex){showMessageDialog(null,ex);                showMessageDialog(null,"NENHUM REGISTRO ENCONTRADO");
    }
        
        
    }

  

    
}
