/**
 * Visualizzare l’ultima cifra di un numero intero inserito se pari.
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.*;
public class Es03{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int val, resto;
        //inizializzazione delle variabili
        val = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore intero per visualizzare la sua ultima cifra, se pari"));
        //elaborazione
        if(val < 0){
            resto = -(val % 10);
        }else{
            resto = val % 10;
        }
        //output
        if((val % 2) == 0){ 
            JOptionPane.showMessageDialog(null, "L'ultima cifra è: "+resto);
        }else{
            JOptionPane.showMessageDialog(null, "Il numero è dispari");
        }
    }
}