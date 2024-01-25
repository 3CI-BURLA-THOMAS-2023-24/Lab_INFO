/**
 * Scrivere un programma che realizzi la r moscia: in una stringa, sostituire tutte le ‘r’ con ‘v’.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es11{
    public static void main(String args[]){
        //dichiarazione delle variabili
        String input, output;
        char erre = 'r';
        input = JOptionPane.showInputDialog("Inserire una stringa per sostituire le r con le v");
        output = "";
        //ripeto le operazioni finche non ho letto tutti i carattteri della stringa
        for(int i = 0; i < input.length(); i++){
            //se il carattere in posizione i vale r, allora lo sostituisco. In caso contrario, lo trascrivo uguale a com'è nella stringa
            if((input.charAt(i)) == erre){
                output = output + 'v';
            }else{
                output = output + input.charAt(i);
            }
        }
        //output
        JOptionPane.showMessageDialog(null, output);
    }
}