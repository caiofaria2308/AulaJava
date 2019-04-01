/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio
 */
import java.sql.SQLException;
import java.sql.*;
import java.util.*;
public class alunoDAO {
    private Connection conn;
    
    
        public alunoDAO()
        {
            //classe
        }

    alunoDAO(Connection c) {
        //metodo que pega a conexão
        this.conn=c;
    }
 
      public void  inserir (String nome) throws SQLException
        {
            
            
            try{
            String sql="insert into aluno(nome) values ('"+nome+"');";
              java.sql.PreparedStatement ps= conn.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            String res=("Tudo ok");
            System.out.println(res);
            
            
            }
            catch(Exception ex){System.out.println(ex);}
          
        }
      
      public void update(String nome,String antigo)throws Exception
      {
          try
          {
              String sql="update aluno set nome='"+nome+"' where nome='"+antigo+"' ";
              java.sql.PreparedStatement ps=conn.prepareStatement(sql);
              ps.executeUpdate();
              ps.close();
              System.out.println("Nome atualizado");
              
          }catch(Exception ex){System.out.println(ex);}
      }
      public List aluno()  
      {
          String sql="select* from aluno";
          List alunos=new ArrayList();
          
          try
          {
              java.sql.PreparedStatement ps=conn.prepareStatement(sql);
              ResultSet rs=ps.executeQuery();
              while(rs.next())
              {
                  int cod=rs.getInt("codigo"); 
                  String nome=rs.getString("nome");
                  
                  temp tp=new temp();
                  tp.cod=cod;
                  tp.nome=nome;
                  alunos.add(tp);
                  return alunos;
              }
              
              ps.close();
              
          }catch(SQLException ex){
              System.out.println("Não deu"); 
          return alunos;}
          return alunos;
          
      }

         
         
   
}
