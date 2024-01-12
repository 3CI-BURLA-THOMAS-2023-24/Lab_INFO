/**
 * Leggere un valore compreso tra 2 e 23
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.*;
public class Es3{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double n;
        //controllo dell'input
        do{
            n = Double.parseDouble(JOptionPane.showInputDialog("Inserire un numero compreso tra 2 e 23"));
            //messaggio di errore
            if((n <= 2) || (n >= 23)){
                JOptionPane.showMessageDialog(null, "Errore, inserire un valore compreso tra 2 e 23!");
            }
        }while((n <= 2) || (n >= 23));
    }
}
