
/**
 *     2. Realizzare un programma che acquisisca da tastiera tre stringhe, 
        ◦ nome (es. Alessio)
        ◦ cognome (es. Rossi) 
        ◦ scuola (es. ITI Marconi)
    Il programma dovrà visualizzare "Ciao Alessio Rossi! La tua scuola è: ITI Marconi".                                         0,5pt
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es2{
    public static void main(String args[]){
        //dichiarazione variabili
        String nome, cognome, scuola, output;
        //leggo nome e controllo che non sia vuoto
        do{
            nome = JOptionPane.showInputDialog("Inserire il nome");
            if(nome.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while(nome.equals(""));
        //leggo cognome e controllo che non sia vuoto
        do{
            cognome = JOptionPane.showInputDialog("Inserire il cognome");
            if(cognome.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while(cognome.equals(""));
        //leggo scuola e controllo che non sia vuoto
        do{
            scuola = JOptionPane.showInputDialog("Inserire il nome della scuola");
            if(scuola.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while(scuola.equals(""));
        //elaborazione e output
        JOptionPane.showMessageDialog(null, "Ciao "+nome+" "+cognome+"! La tua scuola è: "+scuola);
    }
}