/**
 * Scrivere un programma che, letta una parola, sostituisca tutte le vocali con un asterisco.
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es13{
    public static void main(String args[]){
        //dichiarazione delle variabili
        String input, output;
        input = JOptionPane.showInputDialog("Inserire una stringa per sostituire le r con le v");
        output = "";
        //ripeto le operazioni finche non ho letto tutti i carattteri della stringa
        for(int i = 0; i < input.length(); i++){
            //se il carattere in posizione i è una vocale, allora lo sostituisco. In caso contrario, lo trascrivo uguale a com'è nella stringa
            if(((input.charAt(i)) == 'a') || ((input.charAt(i)) == 'A') || ((input.charAt(i)) == 'e') || ((input.charAt(i)) == 'E') || ((input.charAt(i)) == 'i') || ((input.charAt(i)) == 'I') || ((input.charAt(i)) == 'o') || ((input.charAt(i)) == 'O') || ((input.charAt(i)) == 'u') || ((input.charAt(i)) == 'U')){
                output = output + '*';
            }else{
                output = output + input.charAt(i);
            }
        }
        //output
        JOptionPane.showMessageDialog(null, output);
    }
}