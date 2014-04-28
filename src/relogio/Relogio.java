/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package relogio;

/**
 *
 * @author Raul
 */
public class Relogio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Define a interface
        InterfaceRelogio relogio = new InterfaceRelogio();
        relogio.setSize(400, 150);
        relogio.setResizable(false);
        relogio.setVisible(true);
        
        Oscilador oscilador = new Oscilador();
        
        if (Bateria.gettempo_restante()==0)
        	oscilador.paraoscilaseg();
        else
        	oscilador.iniciaoscilaseg();
        
        while (Bateria.gettempo_restante()!=0)
        {
            if (oscilador.oscilaseg()==true)
                relogio.atualizainterface();
        }
        
    }
    
}
