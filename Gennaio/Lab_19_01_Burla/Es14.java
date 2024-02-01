/**
 * Scrivere un programma che, letta una parola, ne restituisca un'altra data da tutte le lettere in posizione pari seguite da tutte le lettere in posizione dispari della prima parola.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es14 {
    public static void main(String args[]){
        //dichiarazione variabili
        String input, output, pari, dispari;
        boolean errore;
        //inizializzazione variabili
        output = "";
        pari = "";
        dispari = "";
        //controllo che venga inserita solo una parola e che la stringa non sia vuota
        do{
            errore = false;
            input = JOptionPane.showInputDialog("Inserire una parola per ricevere in output una parola formata da tutte le lettere in posizione pari seguite da tutte le lettere in posizione dispari della prima parola.");
            //controllo che la stringa non sia vuota
            if(input.equals("")){
                errore = true;
            }else{
                //ripeto le operazioni finche non ho letto tutti i carattteri della stringa
                for(int j = 0; j < input.length(); j++){
                    //se il carattere in posizione j è uno spazio, metto a true errore.
                    if(((input.charAt(j)) == ' ')){
                        errore = true;
                    }
                }
            }
            //messaggio di avviso in caso di errore
            if(errore == true){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire solo una parola");
            }
        }while(errore == true);
        //leggo ogni carattere finchè non ho passato l'intera parola
        for(int i = 0; i < input.length(); i++){
            //controllo se il carattere in analisi è in posizione pari o dispari
            if((i % 2) == 0){
                pari = pari + input.charAt(i);
            }else{
                dispari = dispari + input.charAt(i);
            }
        }
        //concateno le due stringhe ottenute in precedenza
        output = pari + dispari;
        //output
        JOptionPane.showMessageDialog(null, output);
    }
}
