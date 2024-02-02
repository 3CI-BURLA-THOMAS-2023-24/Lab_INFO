/**
 * Implementare un programma che lette tre stringhe realizza una stringa prendendo una parola dalla prima, una dalla seconda e una dalla terza alternativamente
 *
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es1{
    public static void main(String args[]){
        //dichiarazione variabili
        String input1, input2, input3, output, parola1, parola2, parola3;
        int counter1 = 0;
        parola1 = "";
        //inizializzazione variabili
        output = "";
        //controllo input stringa 1
        do{
            input1 = JOptionPane.showInputDialog("Il seguente programma legge tre stringhe e ne restituisce una con i caratteri presi, alternativamente, da ognuna delle stringhe di input. Inserire quindi la prima stringa");
            if(input1.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while(input1.equals(""));
        //controllo input stringa 2
        do{
            input2 = JOptionPane.showInputDialog("Inserire la seconda stringa");
            if(input2.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while(input2.equals(""));
        //controllo input stringa 3
        do{
            input3 = JOptionPane.showInputDialog("Inserire l'ultima stringa");
            if(input3.equals("")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota");
            }
        }while(input3.equals(""));
        //prelevo la prima parola dalla stringa input1
        do{
            parola1 = parola1 + input1.charAt(counter1);
        }while((input1.charAt(counter1) != ' ') && (counter1 < input1.length()));
    }
}