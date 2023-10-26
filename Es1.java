/**
 * Dati 3 valori in ingresso di tipo float, calcolare il prodotto e restituirli all’utente.
 * @author Burla Thomas 
 * @version 1.0
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Es1{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int n; 
        int c = 1; 
        int p = 1;
        while(c<4){
        //inizializzazione delle variabili
        n = Integer.parseInt(JOptionPane.showInputDialog("Inserire il fattore"));
        //elaborazione
        p = p * n;
        c = c+1;
        }
        System.out.println("Il prodotto dei numeri è: "+p);
    }
}
