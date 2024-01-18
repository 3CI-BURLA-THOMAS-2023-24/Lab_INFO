/**
 * Inserire due numeri interi da tastiera: n (n>2), val. 
   Il programma a questo punto deve chiedere all’utente di inserire n valori interi e verificare quanti di questi sono maggiori di val e quanti sono minori di val.
 *
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.*;
public class Es5{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int n, val, numero, maggiore, minore;
        //controllo dell'input
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Quanti numeri vuoi confrontare con il valore iniziale? Inserire almeno 3 valori"));
            if(n <= 2){
                JOptionPane.showMessageDialog(null, "Errore! Dovrai inserire almeno 3 valori");
            }
        }while(n <= 2);
        //inizializzazione variabili
        val = Integer.parseInt(JOptionPane.showInputDialog("Inserire il numero con il quale si vogliono confrontare i successivi"));
        maggiore = 0;
        minore = 0;
        //ciclo per chiedere i valori da confrontare
        for(int i = 0; i < n; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero per verificare se è maggiore o minore del numero inziale"));
            if(numero == val){
                JOptionPane.showMessageDialog(null, "Il numero inserito è uguale a quello iniziale");
            }
            else if(numero < val){
                JOptionPane.showMessageDialog(null, "Il numero inserito è minore di quello iniziale");
                minore++;
            }else{
                JOptionPane.showMessageDialog(null, "Il numero inserito è maggiore di quello iniziale");
                maggiore++;
            }
        }
        JOptionPane.showMessageDialog(null, "I numeri maggiori sono: "+maggiore);
        JOptionPane.showMessageDialog(null, "I numeri minori sono: "+minore);
    }
}