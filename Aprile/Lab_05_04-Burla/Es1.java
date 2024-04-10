/**
 * Leggere una stringa e dire se contiene la parola "anna".
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es1{
    public static void main(String args[]){
        //dichiarazione variabili
        String input;
        int k = 0;
        boolean trovato = false;
        //leggo input e lo controllo
        do{
            input = JOptionPane.showInputDialog("Inserire una stringa");
            if((input.equals("")) || (input.equals(" "))){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota" , "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while((input.equals("")) || (input.equals(" ")));
        //cerco la parola anna
        for(int i = 0; i < input.length(); i++){
            if((input.charAt(i) == 'a') && (i + 3 < input.length())){
                if((input.charAt(i + 1) == 'n') && (input.charAt(i + 2) == 'n') && (input.charAt(i + 3) == 'a')){
                    trovato = true;
                }
            }
        }
        //output
        if(trovato == true){
            JOptionPane.showMessageDialog(null, "Parola trovata nella stringa");
        }else{
            JOptionPane.showMessageDialog(null, "Parola NON trovata nella stringa");
        }
    }
}