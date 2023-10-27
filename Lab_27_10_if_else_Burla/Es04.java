/**
 * Letto un intero, dire se è pari o dispari. 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.*;
public class Es04{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int num;
        //inizializzazione
        num = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero intero per capire se è pari o dispari"));
        if(num%2==0){
            System.out.println("Il numero è pari");
        }
        else{
            System.out.println("Il numero è dispari");
        }
    }
}