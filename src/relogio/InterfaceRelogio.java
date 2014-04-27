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
import java.awt.event.*;
import javax.swing.*;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.WEST;

        
public class InterfaceRelogio extends JFrame{
    //Manipulador de botões
    ManipulaButtonField manipuladorbotao = new ManipulaButtonField ();
    
    //Caixas mostradoras de tempo
    private JTextField horas = new JTextField(2);
    private JTextField minutos = new JTextField(2);
    private JTextField segundos = new JTextField(2);
    
    //Botoes para extender bateria e alterar hora
    private JButton botaobateria = new JButton ("Extender bateria");
    private JButton botaoaltera = new JButton  ("  Alterar hora  ");
    
    
    //Mostradores bateria
    /*private JTextField tempo_bat = new JTextField();*/
    
    private JLabel rotulo = new JLabel ("Relógio no formato 24h:");
    private JLabel dois_pontos  = new JLabel (":");
    private JLabel dois_pontos1  = new JLabel (":");
    private JLabel tempo_bat = new JLabel();
    
    private Container container = getContentPane();
    private JPanel label_relogio = new JPanel();
    private JPanel mostrador = new JPanel();
    private JPanel botoes =  new JPanel();
    private JPanel bateria = new JPanel();
    
    
    //private JTextField tempo_bat = new JTextField(5);
    //private JTextField fim_bat = new JTextField (" segundos.");
    
    //Monta InterfaceRelógio com os parâmetros dados de hora
    InterfaceRelogio(){
    super ("O Relógio");
    
    //Seta as horas iniciadas
    horas.setText(Integer.toString(Oscilador.horas));
    minutos.setText(Integer.toString(Oscilador.minutos));
    segundos.setText(Integer.toString(Oscilador.segundos));
    
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    container.setLayout(new BoxLayout(container, 1));
    //Cria paineis a serem incluidos no container

    label_relogio.setLayout (new FlowLayout());
    bateria.setLayout (new FlowLayout());
    mostrador.setLayout(new FlowLayout());
    botoes.setLayout(new BorderLayout(28,10));
    
//Adiciona elementos aos paineis
    mostrador.add(horas);
    mostrador.add(dois_pontos);
    mostrador.add(minutos);
    mostrador.add(dois_pontos1);
    mostrador.add(segundos);
    horas.setEditable (false);
    minutos.setEditable(false);
    segundos.setEditable(false);
    
    botaoaltera.addActionListener(manipuladorbotao);
    botaobateria.addActionListener(manipuladorbotao);
    
    botoes.add (botaoaltera, WEST);
    botoes.add (botaobateria, EAST);
    
    String aux = ("Tempo restante de bateria: " + Bateria.gettempo_restante() + " segundos.");
    tempo_bat.setText(aux);
    bateria.add (tempo_bat);
    //tempo_bat.setEditable (false);
    
    label_relogio.add(rotulo);
            
    //Adiciona paineis ao container
    container.add(label_relogio);
    container.add(mostrador);
    container.add(bateria);
    container.add(botoes);
}   
    //Atualiza o tempo
    public void atualizainterface ()
    {
        //Seta as horas iniciadas
        horas.setText(Integer.toString(Oscilador.horas));
        minutos.setText(Integer.toString(Oscilador.minutos));
        segundos.setText(Integer.toString(Oscilador.segundos));
        String aux = "Tempo restante de bateria: " + Bateria.gettempo_restante() + " segundos.";
        tempo_bat.setText(aux);
    }
    
    public void alterahora()
    {
        container.remove(bateria);
        botoes.remove(botaoaltera);
        botoes.remove(botaobateria);
        botoes.setLayout(new FlowLayout());
        botaoaltera.setText("Ok");
        botoes.add(botaoaltera);
        
    }
    
    private class ManipulaButtonField implements ActionListener{
        public void actionPerformed(ActionEvent evento)
        {
            //Retornar Bateria ao valor inicial (2000000000 segundos)
            if(evento.getSource() == botaobateria)
                {
                    evento.getActionCommand();
                    Bateria.tempo_restante = Bateria.bateria_total;
                    JOptionPane.showMessageDialog(null, "Bateria extendida para 2000000000 segundos");
                }
            if (evento.getSource()==botaoaltera)
            {
               
            }
        }
    
    }
}

//Criar classe oscilador
//Criar método atualizarelogio VOID q nao receba entradas e atualiza o sistema sempre que se passar um segundo decrementando o tempo de bateria e incrementando o tempo passado
//o metodo atualizarelogio deve destruir a interface atual e construiur outra ou constrir outra sobre a atual!

//Para recorrer às atualizações, pode ser usado o metodo this tbm, q alteraria a string de cada variavel!!!