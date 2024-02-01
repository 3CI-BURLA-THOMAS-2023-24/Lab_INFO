/**
 * Scrivere un programma che dica se una stringa è ordinata.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es30 {
    public static void main(String args[]){
        //dichiarazione variabili
        String input, lower;
        int counter = 1;
        boolean ordinata;
        //controllo se la input è vuota
        do{
            input = JOptionPane.showInputDialog("Inserire una stringa per verificare se è ordinata in modo crescente");
            //messaggio di errore se la input è vuota
            if(input.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire almeno una parola");
            }
        }while(input.equals(""));
        //converto la stringa di input in una stringa con tutte lettere minuscole
        lower = input.toLowerCase();
        do{
            ordinata = true;
            //al primo giro non effettuo alcun confronto siccome non esiste il carattere in posizione -1. A tal proposito, il contatore è inizializzato a 1.
            if((lower.charAt(counter)) < (lower.charAt(counter - 1))){
                ordinata = false;
            }
            counter++;
        }while((ordinata == true) && (counter < lower.length()));
        //output
        if(ordinata == true){
            JOptionPane.showMessageDialog(null, "La stringa è ordinata");
        }else{
            JOptionPane.showMessageDialog(null, "La stringa NON è ordinata");
        }
    }
}