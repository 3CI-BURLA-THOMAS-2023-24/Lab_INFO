/**
 * Letti n  numeri interi (3<n<14) , calcolare la somma dei valori pari.
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.*;
public class Es02{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int n, val, somma;
        somma = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Quanti valori vuoi inserire? Minimo 4 e massimo 13"));
            if((n <= 3) || (n >= 14)){
                JOptionPane.showMessageDialog(null, "Errore! Inserire solo numeri maggiori di 3 e minori di 14");
            }
        }while((n <= 3) || (n >= 14));
        for(int i = 0; i < n; i++){
            val = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore per visualizzare la somma tra i numeri pari"));
            if((val % 2) == 0){
                somma = somma + val;
            }
        }
        JOptionPane.showMessageDialog(null, "La somma dei numeri pari che hai inserito �: "+somma);
    }
}