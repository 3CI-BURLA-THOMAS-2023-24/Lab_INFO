/**
 * Contare da quante parole è composta una stringa.
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es4{
    public static void main(String args[]){
        //dichiarazione delle variabili
        String stringa;
        int counter;
        char spazio = ' ';
        //inizializzazione delle variabili
        //controllo se la stringa è vuota
        do{
            stringa = JOptionPane.showInputDialog("Inserire una stringa per contare da quante parole è composta");
            //messaggio di errore se la stringa è vuota
            if(stringa.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire almeno una parola");
            }
        }while(stringa.equals(""));
        counter = 1;
        //ripeto le operazioni finche non ho letto tutti i carattteri della stringa
        for(int i = 0; i < stringa.length(); i++){
            //se il carattere in posizione i è uno spazio incremento il contatore delle parole
            if((stringa.charAt(i)) == spazio){
                counter++;
            }
        }
        //output
        JOptionPane.showMessageDialog(null, counter);
    }
}