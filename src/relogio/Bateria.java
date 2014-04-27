package relogio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class Bateria {

    //Tempo total máximo da bateria
    static final protected long bateria_total = 2000000000;
    //Tempo atual da bateria
    static protected long tempo_restante = bateria_total;

    static public long gettempo_restante(){
        return tempo_restante;
    }

    static public void atualizatemporestante(){
       tempo_restante--;
    }
}
