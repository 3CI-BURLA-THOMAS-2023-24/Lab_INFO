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
        boolean errore;
        //controllo che venga inserita solo una parola e che la stringa non sia vuota
        do{
            errore = false;
            input = JOptionPane.showInputDialog("Inserire una parola per sostituire le vocali con un asterisco");
            //controllo che la stringa non sia vuota
            if(input.equals("")){
                errore = true;
            }else{
                //ripeto le operazioni finche non ho letto tutti i carattteri della stringa
                for(int j = 0; j < input.length(); j++){
                    //se il carattere in posizione j è uno spazio o la stringa è vuota, metto a true errore.
                    if(((input.charAt(j)) == ' ')){
                        errore = true;
                    }
                }
            }
            //messaggio di avviso in caso di errore
            if(errore == true){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire solo una parola");
            }
        }while(errore == true);
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