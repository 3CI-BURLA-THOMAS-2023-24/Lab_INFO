/**
 * Calcolare il prodotto di due valori interi e positivi utilizzando la sommatoria
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.*;
public class Es3{
    public static void main(String args []){
        //dichiarazione delle variabili
        int x, y, i;
        //inizializzazione delle variabili
        do{
            x = Integer.parseInt(JOptionPane.showInputDialog("Inserire il numero intero positivo da moltiplicare"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Quante volte si vuole moltiplicare tale numero per se stesso? Indicare solo numeri interi positivi"));
        }while((x <= 0) || (y <=0));
    }
}