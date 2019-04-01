
import java.sql.Connection;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class aplicacaoescola 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, Exception {
        // TODO code application logic here
       Pessoa p1=new Professor("meu Lindo");
       System.out.println(p1.getNome());
        Professor pf=new Professor("Ricardo");
        pf.DarAula();
        conexao con=new conexao();
        alunoDAO al = new alunoDAO(con.conectar());
        al.inserir(p1.getNome());
        al.update("Wagner","zé");
        System.out.println(al.aluno());
        
        
        
        
    }
}
      

