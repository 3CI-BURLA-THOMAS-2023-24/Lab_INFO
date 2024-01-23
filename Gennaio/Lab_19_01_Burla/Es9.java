/**
 * Scrivere un programma per invertire una stringa.
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import java.util.Scanner;
public class Es9 {
    public static void main(String args[]){
        //dichiarazione delle variabili
        String input, output;
        //inizializzazione variabili
        Scanner inp = new Scanner(System.in);
        System.out.println("Inserire una stringa per visualizzare in output la stringa invertita");
        input = inp.nextLine();
        output = "";
        for(int j = input.length() - 1; j >= 0; j--){
            output = output + input.charAt(j);
        }
        System.out.println("Ecco la stringa invertita: "+output);
        inp.close();
    }
}
