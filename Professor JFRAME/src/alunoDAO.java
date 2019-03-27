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
            String sql="update aluno set nome='"+nNew+"' where cod='"+cod+"' ";
            java.sql.PreparedStatement ps= conn.prepareStatement(sql);
            ps.executeUpdate();
            showMessageDialog(null,"Atualizado com sucesso "+nNew+" "+cod);
            
        }catch(SQLException ex){showMessageDialog(null,ex);}
    }
    public void remove (String cod)throws SQLException
    {
        try
        {
            String sql="delete from aluno where cod='"+cod+"'";
            java.sql.PreparedStatement ps=conn.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            showMessageDialog(null,"Deletado com sucesso!");
        }catch(Exception ex){showMessageDialog(null,ex);}
    }
    
}
