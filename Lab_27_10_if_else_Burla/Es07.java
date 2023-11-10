/**
 *  Stabilire se tre numeri presi in ingresso possono essere le misure degli angoli di un triangolo.
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.*;
public class Es07{
    public static void main(String args[]){
        //dichiarazione delle variabili
        //dichiarazione delle variabili
        double a1;
        double a2;
        double a3;
        //inizializzazione delle avriabili
        a1 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il primo angolo del triangolo"));
        a2 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il secondo angolo del triangolo"));
        a3 = Double.parseDouble(JOptionPane.showInputDialog("Inserire il tero angolo del triangolo"));
        //elaborazione
        if((a1 < 0) || (a2 < 0) || (a3 < 0)){
            //output
            System.out.println("I valori dati NON possono corrispondere agli angoli di un triangolo");
            }
            else if((a1 + a2 + a3) != 180){
                //output
                System.out.println("I valori dati NON possono corrispondere agli angoli di un triangolo");
                }
                else{
                //output
                System.out.println("I valori dati possono corrispondere agli angoli di un triangolo");
                }
    }
}