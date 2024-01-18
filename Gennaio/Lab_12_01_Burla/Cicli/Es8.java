/**
 * Scrivere un programma che legga da tastiera una sequenza di lunghezza ignota a priori di numeri interi positivi.
   Il programma, a partire dal primo numero introdotto, stampa ogni volta la media di tutti i numeri introdotti e quanti sono. 
   Terminare quando il numero inserito è minore o uguale a zero.
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es8{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int numero, somma, counter;
        double media;
        //inizializzazione delle variabili
        somma = 0;
        media = 0.0;
        counter = 0;
        //controllo dell'input
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero intero positivo per visualizzare la media fra esso e i numeri precedenti"));
            if(numero > 0){
            counter++;
            //output
            JOptionPane.showMessageDialog(null, "Fino ad ora, hai inserito "+counter+" numeri.");
            somma += numero;
            media = somma / counter;
            JOptionPane.showMessageDialog(null, "La media dei numeri inseriti fino ad ora è: "+media);
            }
        }while(numero > 0);
    }
}