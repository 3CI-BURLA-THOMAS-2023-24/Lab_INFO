
/**
 * Calcolo della circonferenza e area del cerchio, con il tipo di dato opportuno per il raggio e il controllo sul valore espresso in input;
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.*;
public class Es1{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double r;
        double circ;
        double π;
        double area;
        //inizializzazione delle variabili
        π = 3.14;
        r = Double.parseDouble(JOptionPane.showInputDialog("Inserire il raggio del cerchio"));
        if(r>0){
            //elaborazione
            circ = 2 * π * r;
            area = π * r * r;
            //output
            System.out.println("La circonferenza misura "+circ);
            System.out.println("L'area del cerchio misura "+area);
        }
        else{
            //output
            System.out.println("Errore!");
        }
    }
}