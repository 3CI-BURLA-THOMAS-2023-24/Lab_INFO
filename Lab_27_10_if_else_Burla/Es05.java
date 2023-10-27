/**
 * Letto un intero, dire se esso è multiplo di 7.
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.*;
public class Es05{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int num;
        //inizializzazione
        num = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero intero per capire se è multiplo di 7"));
        if(num%7==0){
            System.out.println("Il numero è multiplo di 7.");
        }
        else{
            System.out.println("Il numero non è multiplo di 7.");
        }
    }
}