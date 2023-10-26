/**
 * Provo le JOptionPane
 * @author Burla Thomas 
 * @version 1.0
 */
import javax.swing.*;
public class Main{
    public static void main(String args []){
    //dichiaraione delle variabili
    int n1, n2, somma;
    //lettura delle variabili da tastiera
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo numero di cui eseguire la somma"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserire il secondo numero da sommare a quello inserito precedentemente"));
    //elaborazione
    somma = n1 + n2;
    //output
    System.out.println("La somma fra i numeri inseriti è: "+somma);
    }
}