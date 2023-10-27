
/**
 * Letti due numeri, stampare il maggiore.
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.*;
public class Es03{
    public static void main(String args[]){
        //dichiarazione delle variabili
        double a;
        double b;
        //inizializzazione delle variabili
        a = Double.parseDouble(JOptionPane.showInputDialog("Inserire un qualsiasi numero"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Inserire il secondo numero"));
        if(a==b){
            //output
            System.out.println("I due numeri sono uguali.");
        }
        else if(a>b){
                //output
                System.out.println("Il primo numero è maggiore del secondo.");
            }
            else{
                //output
                System.out.println("Il secondo numero è maggiore del primo");
            }
        }
    }