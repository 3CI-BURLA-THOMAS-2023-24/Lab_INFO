/**
 * Comporre una stringa s3 prendendo alternativamente i caratteri dalle stringhe s1 e s2.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es4 {
    public static void main(String args[]){
        //dichiarazione variabili
        String s1,s2, s3;
        //inizializzazione variabili
        s3 = "";
        //controllo che la stringa s1 non sia vuota
        do{
            s1 = JOptionPane.showInputDialog("Il programma compone una stringa prendendo, in modo alterno, i caratteri da due stringhe date in input. Inserire la prima stringa");
            if(s1.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }
        }while(s1.equals(""));
        //controllo che la stringa s2 non sia vuota
        do{
            s2 = JOptionPane.showInputDialog("Inserire la seconda stringa");
            if(s2.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }
        }while(s2.equals(""));
        //elaborazione
        for(int i = 0; (i < s1.length()) && (i < s2.length());i++){
            s3 = s3 + s1.charAt(i) + s2.charAt(i);
        }
        //output
        JOptionPane.showMessageDialog(null, s3);
    }
}
