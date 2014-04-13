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
static private int tempo_restante = 1000000;

static public int gettempo_restante(){
    return tempo_restante;
}

public void atualizatemporestante(){
   tempo_restante--;
}
}
