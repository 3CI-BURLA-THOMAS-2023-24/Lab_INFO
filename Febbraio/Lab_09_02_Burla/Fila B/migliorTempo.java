/**
 * Esercizio miglior tempo
    Bob decide di gareggiare per la «10km for fun», gara che si tiene a Roma nel mese di novembre. 
    In vista della gara decide di cronometrarsi durante gli allenamenti del mese di ottobre e registrare quanto tempo impiega a percorrere 10km. 
    Si realizzi un programma che permetta a Bob di inserire i tempi registrati in un mese (indicato in minuti) e che indichi quale sia il tempo migliore ed il peggiore che si sono ottenuti durante questi allenamenti, quante volte ha fatto il peggior tempo.
    Nb. i tempi registrati non dovranno essere minori di 30 e non dovranno essere maggiori di 60.     
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class MigliorTempo{
    public static void main(String args[]){
        //dichiarazione variabili
        double v[], migliore, peggiore;
        int l, counter;
        //inizializzazione variabili
        migliore = 0.0;
        peggiore = 0.0;
        counter = 1;
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
                if((v[i] < 30) || (v[i] > 60)){
                    JOptionPane.showMessageDialog(null, "ERRORE! Tempo non valido");
                }
            }while((v[i] < 30) || (v[i] > 60));
            //il primo valore letto lo prendo come riferimento, contandolo sia come valore migliore che peggiore
            if(i == 0){
                migliore = v[i];
                peggiore = v[i];
            //controllo se il valore è il più basso e, in caso affermativo, lo assegno al peggiore impostando il contatore del peggior tentativo a 1
            }else if(v[i] < peggiore){
                peggiore = v[i];
                counter = 1;
            //se il valore è uguale al peggiore, incremento il counter del peggiore di 1
            }else if(v[i] == peggiore){
                counter++;
            //se il valore supera il migliore, lo sostituisco
            }else if(v[i] > migliore){
                migliore = v[i];
            }
        }
        //output
        JOptionPane.showMessageDialog(null, "Il tempo migliore, in minuti, è: "+migliore);
        JOptionPane.showMessageDialog(null, "Il tempo peggiore, in minuti, è: "+peggiore+" ed è stato totalizzato ben "+counter+" volte");
    }
}