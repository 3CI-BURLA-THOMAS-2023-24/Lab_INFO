/**
 * Il programma legge due numeri e controlla se il il maggiore è multiplo del minore
 * 
 * @author Burla Thomas 
 * @version 1.0
 */
import javax.swing.*;;
public class Es2{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double val1, val2, scambio;
        //controllo dell'input
        do{
            val1 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il primo valore. Accettati solo valori interi e positivi"));
            val2 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il secondo valore.Accettati solo valori interi e positivi"));
            if((val1 <= 0) || (val2 <= 0)){
                JOptionPane.showMessageDialog(null, "Errore, inserire solo numeri interi positivi!");
            }
            }while((val1 <= 0) || (val2 <= 0));
        //nella variabile val1 facccio in modo che ci sia sempre il numero maggiore
        if(val2 > val1){
            scambio = val1;
            val1 = val2;
            val2 = scambio;
        }
        //controllo se val1 è multiplo di val2
        if((val1 % val2) == 0){
        //output
           JOptionPane.showMessageDialog(null, "Il numero maggiore è multiplo del minore");
        }else{
            //output
            JOptionPane.showMessageDialog(null, "Il numero maggiore NON è multiplo del minore");
        }
    }
}