/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
package relogio;
import java.awt.*;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.WEST;
import javax.swing.*;
        
public class InterfaceRelogio extends JFrame{
    //Caixas mostradoras de tempo
    private JTextField horas = new JTextField(2);
    private JTextField minutos = new JTextField(2);
    private JTextField segundos = new JTextField(2);
    
    //Botoes para extender bateria e alterar hora
    private JButton botaobateria = new JButton ("Extender bateria");
    private JButton botaoaltera = new JButton  ("  Alterar hora  "); 
    
    public InterfaceRelogio(){
    super ("O Relógio");
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    Container container = getContentPane();
    container.setLayout(new FlowLayout());
    
    //Cria paineis a serem incluidos no container
    JPanel mostrador = new JPanel();
    JPanel botoes =  new JPanel();
    mostrador.setLayout(new FlowLayout());
    botoes.setLayout(new BorderLayout(28,10));
    //botoes.setHgap
    //Adiciona elementos aos paineis
    mostrador.add(horas);
    mostrador.add(minutos);
    mostrador.add(segundos);
    
    botoes.add (botaoaltera, WEST);
    botoes.add (botaobateria, EAST);
    //Adiciona paineis ao container
    container.add(mostrador);
    container.add(botoes);
    }
}
