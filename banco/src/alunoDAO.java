/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
import static java.lang.System.in;
import java.sql.*;
public class alunoDAO {
    private Connection conn;
    
    public alunoDAO(Connection c)
    {
        this.conn=c;
    }
    public void insere(alunoDAO a) throws SQLException
    {
        String sql= ("insert into aluno(rm,nome) values ("+a.getRM()+",'"+a.getNome()+"'");
        PreparedStatement ps=this.conn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }

    public String getRM() {
      System.out.print("Digite o seu rm: ");
      
      
    }

    private String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
