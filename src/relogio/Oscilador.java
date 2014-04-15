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
public class Oscilador {
    protected static int horas=0;
    protected static int minutos=0;
    protected static int segundos=0;
    
    public boolean oscilaseg()
    {
        long start=System.currentTimeMillis();
        while(System.currentTimeMillis()-start<1000)
        {
            System.out.println(segundos);
            if (System.currentTimeMillis()-start>=1000)
                break;
        }
        somasegundos();
        Bateria.atualizatemporestante();
        return true;
    }
    
    public void somasegundos()
    {
        segundos++;
        if (segundos==60)
        {
            segundos=0;
            somaminutos();
        }
    }
    public void somaminutos()
    {
       minutos++;
        if (minutos==60)
        {
            minutos=0;
            somahoras();
        }  
    }
    public void somahoras()
    {
         horas++;
         if (horas==24)
             horas=0;
    }

}
