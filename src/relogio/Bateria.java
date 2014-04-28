package relogio;
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
