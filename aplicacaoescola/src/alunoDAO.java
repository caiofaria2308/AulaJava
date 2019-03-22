/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
import com.mysql.jdbc.*;
import java.sql.SQLException;
public class alunoDAO {
    private Connection conn;
    
        public alunoDAO(Connection c)
        {
            this.conn=c;
            
           
        }

    alunoDAO() throws SQLException {
        
        insert(null);
    }


 
        public void  insert (Pessoa p) throws SQLException
        {
            conexao c= new conexao();
            c.conectar();
            try{
            String sql="insert into aluno(nome) values ('"+p.getNome()+"');";
              java.sql.PreparedStatement ps= this.conn.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            String res=("Tudo ok");
            
            }
            catch(Exception ex){String res="Não deu certo"; }
          
        }
}
