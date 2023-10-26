/**
 * Dato un tempo espresso in ore, minuti e secondi, calcolare il corrispondente valore in secondi.
 * @author Burla Thomas 
 * @version 1.0
 */
import javax.swing.*;
public class Es4{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int h, min, sec;
        int conv = 0;
        //inizializzazione delle variabili
        h = Integer.parseInt(JOptionPane.showInputDialog("Inserire il numero di ore"));
        min = Integer.parseInt(JOptionPane.showInputDialog("Inserire il numero di minuti"));
        sec = Integer.parseInt(JOptionPane.showInputDialog("Inserire il numero di secondi"));
        //elaborazione
        conv = h*3600 + min*60 + sec;
        //ouput
        System.out.println("Il tempo da te indicato corrisponde a: "+conv+" secondi.");
    }
}