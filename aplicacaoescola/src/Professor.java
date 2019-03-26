/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa {
   Professor(String nome)
    {
        
    super(nome);
    String a1=nome;
    
    
    }
   public void DarAula()
    {
    System.out.println("Dando aula");
    
    }
   public String getnome()
   {
      return this.nome; 
   }
   
    
}
