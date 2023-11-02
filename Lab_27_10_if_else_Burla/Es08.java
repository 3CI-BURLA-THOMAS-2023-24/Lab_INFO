/**
 * Letto un intero, dire se esso è positivo, negativo o nullo. 
 * @author Thomas Burla
 * @version 1.0
*/
import javax.swing.*;
public class Es08{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int num;
        //inizializzazione delle variabili
        num = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero intero per stabilire se esso è positivo, negativo o nullo."));
        //elaborazione e output
        if(num < 0){
            System.out.println("Il numero inserito è negativo.");
        }else if(num > 0){
            System.out.println("Il numero inserito è positivo");
        }else{
            System.out.println("Il numero inserito è nullo.");
        }   
    }
}