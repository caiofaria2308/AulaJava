/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class ProfessorObj {
    private String nome;
    private String oldcod;
    
    public void setNome(String n)
    {
        this.nome=n;
    }
    public void setCod(String n)
    {
    this.oldcod=n;
    }
    public String getNome()
    {
        return this.nome;
    } 
    public String getCod()
    {
        return this.oldcod;
    }
}
