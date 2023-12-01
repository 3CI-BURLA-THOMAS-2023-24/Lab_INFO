/**
 * Letti n  numeri double (2<n<=10), restituirne il prodotto dei valori positivi.
 * @author Thomas Burla 
 */
import javax.swing.*;
public class Es3{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int n, i;
        double x, p;
        //inizializzazione delle variabili
        p = 1;
        //controllo dell'input
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Quanti numeri vuoi moltiplicare?Almeno 3 valori e massimo 10."));
            if((n <= 2) || (n > 10)){
                JOptionPane.showMessageDialog(null, "Errore! Inserire un valore seguendo le indicazioni.");
            }
        }while((n <= 2) || (n > 10));
        //elaborazione
        for(i = 0; i < n; i++){
            x = Double.parseDouble(JOptionPane.showInputDialog("Inserire un valore per visualizzare il prodotto fra i numeri positivi inseriti"));
            if(x > 0){
                p = p * x;
            }
        }
        //output
        if(p == 1){
            JOptionPane.showMessageDialog(null, "Il prodotto dei numeri positivi che hai digitato è: 0");
        }else{
            JOptionPane.showMessageDialog(null, "Il prodotto dei numeri positivi che hai digitato è: "+p);
        }
    }
}