/**
 * Letti una stringa e un carattere, dire qual è la prima posizione della stringa in cui compare quel carattere. Se esso non c’è, restituire -1.
 */
import javax.swing.JOptionPane;
public class Es17 {
    public static void main(String args[]){
        //dichiarazione variabili
        String input, confronto;
        char charconfr;
        boolean presente = false;
        int i = 0;
        //inizializzazione variabili
        //controllo se la stringa è vuota
        do{
            input = JOptionPane.showInputDialog("Inserire una stringa");
            //messaggio di errore se la stringa è vuota
            if(input.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while(input.equals(""));
        //controllo se il carattere di confronto è vuoto e che non sia una stringa o una parola
        do{
            confronto = JOptionPane.showInputDialog("Inserire un carattere per verificare se è presente nella stringa inserita precedentemente");
            if((confronto.length() != 1) || (confronto.equals(""))){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire un carattere");
            }
        }while((confronto.length() != 1) || (confronto.equals("")));
        //converto la stringa in carattere
        charconfr = confronto.charAt(0);
        //ripeto il controllo per ogni carattere finchè non trovo il carattere nella stringa
        while((i < input.length()) && (presente == false)){
            //controllo, di carattere in carattere, se è presente nella stringa
            if(input.charAt(i) == charconfr){
                presente = true;
            }
            i++;
        }
        //output
        if(presente == true){
            JOptionPane.showMessageDialog(null, i);
        }else{
            JOptionPane.showMessageDialog(null, "-1");
        }
    }
}
