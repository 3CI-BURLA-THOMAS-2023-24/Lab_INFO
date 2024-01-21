/**
 * Presa una stringa, modificarla in modo che il primo carattere sia ripetuto una volta, il secondo due, il terzo tre, e così via.
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es3{
    public static void main(String args[]){
        //dichiarazione delle variabili
        String input, output;
        //inizializzazione variabili
        input = JOptionPane.showInputDialog("Inserire una stringa per visualizzare una nuova stringa con il primo carattere ripetuto una volta, il secondo due, il terzo tre, e così via");
        output = "";
        //ciclo per stampare tutti i caratteri della stringa
        for(int i = 0; i < input.length(); i++){
            //ciclo per stampare ciascun carattere della stringa in base alla sua posizione occupata
            for(int j = i + 1; j > 0; j--){
                output = output + input.charAt(i);
            }
        }
        //output
        JOptionPane.showMessageDialog(null, output);
    }
}