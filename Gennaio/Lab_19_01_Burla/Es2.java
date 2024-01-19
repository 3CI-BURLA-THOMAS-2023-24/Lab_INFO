/**
 * Presa una stringa, separare ogni carattere con un trattino
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.*;
public class Es2{
    public static void main(String args[]){
        //dichiarazione delle variabili
        String stringa, output, trattino, carattere;
        //inizializzazione variabili
        stringa = JOptionPane.showInputDialog("Inserire una stringa per visualizzare i suoi caratteri separati da un trattino");
        trattino = "-";
        output = "";
        //elaborazione della stringa finale
        for(int i = 0; i < stringa.length(); i++){
            output = output + stringa.charAt(i);
            if(i != (stringa.length() - 1)){
                output = output + trattino;
            }
        }
        //output
        JOptionPane.showMessageDialog(null, output);
    }
}