/**
 * Leggere un valore n > 5
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.*;
public class Es2{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double n;
        do{
            n = Double.parseDouble(JOptionPane.showInputDialog("Inserire un numero maggiore di 5"));
            if(n <= 5){
                JOptionPane.showMessageDialog(null, "Errore, inserire un valore maggiore di 5!");
            }
        }while(n <= 5);
    }
}
