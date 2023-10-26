/**
 * Dati due valori inseriti in due variabili, scrivere un algoritmo per scambiarli.
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.*;
public class Es5{
    public static void main(String args[]){
        //dichiarazione variabili
        int a;
        int b;
        int c;
        //elaborazione
        a = Integer.parseInt(JOptionPane.showInputDialog("Dammi un numero intero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Dammi il secondo numero intero"));
        c=(a);
        a=(b);
        b=(c);
        //output
        System.out.println("I due valori, una volta invertiti risultano essere nel seguente ordine: "+a+ ";" +b);
    }
}