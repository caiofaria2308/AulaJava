/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
public class aula1 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new aula1();
            
    }
    public aula1(){
        setSize(500,500);
        setVisible(true);
                }
                    @Override
                   public void paint(Graphics g){
                       
                       g.drawRect(50,50,100,25);
                       
                       g.setColor(new Color(0,0,255));
                       g.drawOval(200,50,50,50);
                       
                       g.setColor(Color.GREEN);
                       g.fillRect(50, 200, 100, 25);
                       
                       g.setColor(Color.BLACK);
                       g.drawString("My String",200,200);
                   }
    }
    

