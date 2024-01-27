/**
 * Scrivere un programma per eliminare la lettera ‘a’ da una stringa.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es10 {
    public static void main(String args[]){
        //dichiarazione variabili
        String input, output;
        output = "";
        //controllo se la stringa è vuota
        do{
            input = JOptionPane.showInputDialog("Inserire una stringa per eliminare la lettera a.");
            //messaggio di errore se la stringa è vuota
            if(input.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire almeno una parola");
            }
        }while(input.equals(""));
        //leggo ogni carattere della stringa in input ed effettuo il controllo
        for(int i = 0; i < input.length(); i++){
            if((input.charAt(i) == 'A') || (input.charAt(i) == 'a')){
                output = output + "";
            }else{
                output = output + input.charAt(i);
            }
        }
        //output
        JOptionPane.showMessageDialog(null, "Stringa di partenza senza il carattere a-->"+output);
    }
}
