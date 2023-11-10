/**
 *  Calcolare e visualizzare  il prodotto di n valori interi
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.*;
public class Es2{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int n, x, p;
        //inizializzazone delle variabili
        p = 1;
        //controllo dell'input per il numero di valori da moltiplicare
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Quanti sono i valori da moltiplicare?"));
        }while(n < 0);
    }
}
