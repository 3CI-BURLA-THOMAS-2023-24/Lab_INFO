/**
 *  Calcolare e visualizzare  il prodotto di n valori interi
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.*;
public class Es2{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int n, x, p, i;
        //inizializzazone delle variabili
        p = 1;
        //controllo dell'input per il numero di valori da moltiplicare
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Quanti sono i valori da moltiplicare?"));
        }while(n < 0);
        //elaborazione
        for(i = 0; i < n; i++){
            x = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore da moltiplicare"));
            //se un numero vale 0, il prodotto vale 0 a prescindere
            if(x == 0){
                p = 0;
                i = n;
            }else{
            p = p * n;
            }
        }
        //output
        JOptionPane.showMessageDialog(null, "Il prodotto è "+p);
    }
}