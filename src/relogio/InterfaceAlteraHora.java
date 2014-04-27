/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package relogio;
/*Tratar casos em que hora>24*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Raul
 */
public class InterfaceAlteraHora extends JDialog {
    int h, m,s;
    
    ManipulaButtonField manipuladorbotao = new ManipulaButtonField();
    
    //Caixas de texto
    private JTextField horas = new JTextField(2);
    private JTextField minutos = new JTextField(2);
    private JTextField segundos = new JTextField(2);
    //Botão de confirmação da alteração
    private JButton confirma = new JButton();
    private JButton cancela = new JButton();
    //Rotulo
    private JLabel rotulo = new JLabel("Ajuste as horas, minutos e segundos");
    private JLabel dois_pontos  = new JLabel (":");
    private JLabel dois_pontos1  = new JLabel (":");
    
    private Container container = getContentPane();
    private JPanel label = new JPanel();
    private JPanel mostrador = new JPanel();
    private JPanel botoes =  new JPanel();
    
    InterfaceAlteraHora(InterfaceRelogio relogio){
        super (relogio ,"Alteração da Hora");
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        container.setLayout(new BoxLayout(container, 1));
        
        confirma.setText("Confirma Hora");
        cancela.setText ("Cancela");
        
        //Cria paineis a serem incluidos no container

        label.setLayout (new FlowLayout());
        mostrador.setLayout(new FlowLayout());
        botoes.setLayout(new FlowLayout());

        //Adiciona elementos aos paineis
        mostrador.add(horas);
        mostrador.add(dois_pontos);
        mostrador.add(minutos);
        mostrador.add(dois_pontos1);
        mostrador.add(segundos);
        
        confirma.addActionListener(manipuladorbotao);
        cancela.addActionListener(manipuladorbotao);
        botoes.add (confirma);
        botoes.add (cancela);
        
        label.add(rotulo);
        
        container.add(label);
        container.add(mostrador);
        container.add(botoes);

        
    }
    private String Entrada;
    private int get_ent_Hora()
    {
        Entrada=horas.getText();
        h=Integer.parseInt(Entrada);
        while (h>24)
            h=h-24;
        return h;
    }
    private int get_ent_Minuto()
    {
        Entrada=minutos.getText();
        m=Integer.parseInt(Entrada);
        while (m>60)
            m=m-60;
        return m;
    }
    private int get_ent_Segundo()
    {
        Entrada=segundos.getText();
        s=Integer.parseInt(Entrada);
        while (s>60)
            s=s-60;
        return s;
    }
    
    private class ManipulaButtonField implements ActionListener{
                    public void actionPerformed(ActionEvent evento){
                        //Salva as variaveis e fecha JDialog
                        if(evento.getSource() == confirma)
                            {
                               Oscilador.setminutos(get_ent_Minuto());
                               Oscilador.setsegundos(get_ent_Segundo());
                               Oscilador.sethoras(get_ent_Hora());
                               dispose();
                            }
                        //fecha JDialog
                        if(evento.getSource() == cancela)
                            {
                               evento.getActionCommand();
                               dispose();
                            }
                    }
    }

}
