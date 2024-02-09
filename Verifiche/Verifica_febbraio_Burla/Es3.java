/**
 * Leggere una stringa, creare la seconda stringa senza gli spazi
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es3{
    public static void main(String args[]){
        //dichiarazione variabili
        String input, output;
        //inizializzazione variabili
        output = "";
        //leggo input e lo controllo
        do{
            input = JOptionPane.showInputDialog("Inserire una stringa per visulizzzarla senza spazi");
            if(input.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while(input.equals(""));
        //rimuovo gli spazi leggendo ogni singolo caratttere
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != ' '){
                output = output + input.charAt(i);
            }
        }
        //output
        JOptionPane.showMessageDialog(null, output);
    }
}