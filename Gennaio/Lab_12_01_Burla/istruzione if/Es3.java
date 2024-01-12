/**
 * L’utente inserisce una temperatura in Celsius e il calcolatore la converte in Fahrenheit ed in Kelvin. Se la temperatura inserita è minore dello zero assoluto (-273,15), il calcolatore segnala un errore.
    Si ricordi che:
    Fahrenheit = (9/5) · Celsius + 32
    Kelvin = Celsius + 273,15   
 * 
 * @author Burla Thomas 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es3{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double celsius, kelvin, fahrenheit;
        //controllo dell'input
        do{
            celsius = Double.parseDouble(JOptionPane.showInputDialog("Inserire un temperatura in gradi Celsius per poi visualizzare la sua conversione in gradi Kelvin e gradi Fahrenheit. ATTENZIONE: inserire solo temperature meggiori o uguali a -273.15 °C"));
            //messaggio di errore
            if(celsius < (-273.15)){
                JOptionPane.showMessageDialog(null, "Errore, la temperatura non può essere inferiore a -27.15 °C");
            }
        }while(celsius < (-273.15));
        
    }
}
