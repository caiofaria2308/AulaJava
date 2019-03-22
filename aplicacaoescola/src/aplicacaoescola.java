
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
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
       Pessoa p1=new Professor("Wagnão Maravilhoso");
       System.out.println(p1.getNome());
        Professor pf=new Professor("Zé");
        pf.DarAula();
        alunoDAO al= new alunoDAO();
        
        
    }
}
      

