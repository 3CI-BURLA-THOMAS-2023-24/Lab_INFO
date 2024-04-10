/**
 * Leggere una stringa e togliere tutti gli spazi
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es2 {
    public static void main(String args[]){
        //dichiaro variabili
        String input;
        String output = "";
        //leggo e controllo input
        do{
            input = JOptionPane.showInputDialog("Inserire una stringa per visualizzarla in output senza spazi");
            if((input.equals("")) || (input.equals(" "))){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while((input.equals("")) || (input.equals(" ")));
        //tolgo gli spazi
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != ' '){
                output+= input.charAt(i);
            }
        }
        //output
        JOptionPane.showMessageDialog(null, "La stringa senza spazi è: " + output);
    }
}
