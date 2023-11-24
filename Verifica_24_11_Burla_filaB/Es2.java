/**
 * Visualizzare l’ultima cifra di un numero inserito se dispari.
 * @author Thomas Burla 
 */
import javax.swing.*;
public class Es2{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int num, cifra;
        //inizializzazione delle variabili
        num = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero intero per visualizzare l'ultima cifra, se è dispari."));
        if((num % 2) != 0){
            JOptionPane.showMessageDialog(null, "L'ultima cifra del numero è: ");
        }
    }
}