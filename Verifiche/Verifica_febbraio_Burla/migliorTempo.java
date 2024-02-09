/**
 * Esercizio miglior tempo
    Bob decide di gareggiare per la «10km for fun», gara che si tiene a Roma nel mese di novembre. In vista della gara decide di cronometrarsi durante gli allenamenti del mese di ottobre e registrare quanto tempo impiega a percorrere 10km. Si realizzi un programma che permetta a Bob di inserire i tempi registrati in un mese (indicato in minuti) e che indichi quale sia il tempo migliore ed il peggiore che si sono ottenuti durante questi allenamenti, quante volte ha fatto il peggior tempo.
    Nb. i tempi registrati non dovranno essere minori di 30 e non dovranno essere maggiori di 60.     
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class migliorTempo{
    public static void main(String args[]){
        //dichiarazione variabili
        double v[];
        int l;
        //inizializzazione variabili
        
        //leggo lunghezza vettore
        do{
            l = Integer.parseInt(JOptionPane.showInputDialog("Quanti test vuoi registrare?"));
        }while(l <= 0);
        //alloco vettore
        v = new double[l];
        //riempio vettore
        for(int i = 0; i < l; i++){
            do{
                v[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserire un valore di durata del test nel vettore in minuti"));
            }while((v[i] < 30) || (v[i] >60));
        }
    }
}