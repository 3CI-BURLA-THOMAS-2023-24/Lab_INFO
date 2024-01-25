/**
 * Trasformare una stringa in modo che abbia l’iniziale maiuscola e tutte le altre lettere minuscole.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es7 {
    public static void main(String args[]){
        //dichiarazione delle variabili
        String input, output;
        output = "";
        //controllo se la stringa è vuota
        do{
            input = JOptionPane.showInputDialog("Inserire una stringa per traformarla in una stringa con l'iniziale maiuscola e tutte le altre lettere minuscole.");
            //messaggio di errore se la stringa è vuota
            if(input.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire almeno una parola");
            }
        }while(input.equals(""));
        //
        for(int i = 0; i < input.length(); i++){
            if(i == 0){
                output = output + (input.charAt(i) + "").toUpperCase();
            }else{
                output = output + (input.charAt(i) + "").toLowerCase();
            }
        }
        //output
        JOptionPane.showMessageDialog(null, output);
    }
}
