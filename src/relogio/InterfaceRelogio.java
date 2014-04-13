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
import static java.awt.BorderLayout.CENTER;
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
    
    //Mostradores bateria
    private JTextField tempo_bat = new JTextField();
    
    //private JTextField tempo_bat = new JTextField(5);
    //private JTextField fim_bat = new JTextField (" segundos.");
    
    public InterfaceRelogio(){
    super ("O Relógio");
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    Container container = getContentPane();
    container.setLayout(new BoxLayout(container, 1));
    
    //Cria paineis a serem incluidos no container
    JPanel mostrador = new JPanel();
    JPanel botoes =  new JPanel();
    JPanel bateria = new JPanel();
    bateria.setLayout (new FlowLayout());
    mostrador.setLayout(new FlowLayout());
    botoes.setLayout(new BorderLayout(28,10));
    
//Adiciona elementos aos paineis
    mostrador.add(horas);
    mostrador.add(minutos);
    mostrador.add(segundos);
    
    botoes.add (botaoaltera, WEST);
    botoes.add (botaobateria, EAST);
    
    String aux = ("Tempo restante de bateria: " + Bateria.gettempo_restante() + " segundos.");
    tempo_bat.setText(aux);
    bateria.add (tempo_bat);
    tempo_bat.setEditable (false);
    /*bateria.add (tempo_bat, CENTER);
    tempo_bat.setEditable (false);
    bateria.add (fim_bat, EAST);
    fim_bat.setEditable (false);*/
            
    //Adiciona paineis ao container
    container.add(mostrador);
    container.add(bateria);
    container.add(botoes);
    }
    /*
    public void atualizatempobateria ()
    { 
        String aux = "Tempo restante bateria:" + Bateria.gettempo_restante() + " segundos.";
        tempo_bat.setText(aux);
    }       */
}


//Criar classe oscilador
//Criar método atualizarelogio VOID q nao receba entradas e atualiza o sistema sempre que se passar um segundo decrementando o tempo de bateria e incrementando o tempo passado
//o metodo atualizarelogio deve destruir a interface atual e construiur outra ou constrir outra sobre a atual!

//Para recorrer às atualizações, pode ser usado o metodo this tbm, q alteraria a string de cada variavel!!!