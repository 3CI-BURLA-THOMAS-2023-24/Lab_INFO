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
        int counter2 = 0;
        parola2 = "";
        int counter3 = 0;
        parola3 = "";
        boolean fine1, fine2, fine3;
        //inizializzazione variabili
        output = "";
        //controllo input stringa 1
        do{
            input1 = JOptionPane.showInputDialog("Il seguente programma legge tre stringhe e ne restituisce una con le parole prese, alternativamente, da ognuna delle stringhe di input. Inserire quindi la prima stringa");
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
        //prendo una parola da ogni stringa finchè non ho esaurito tutte le parola dalla stringa che ne contiene di meno
        do{
            //reset delle parole
            parola1 = "";
            parola2 = "";
            parola3 = "";
            //prelevo la prima parola dalla stringa input1
            do{
                fine1 = false;
                parola1 = parola1 + input1.charAt(counter1);
                counter1++;
                if(counter1 == input1.length()){
                    fine1 = true;
                    //decremento di uno il contatore altrimenti il check dei caratteri del ciclo do-while sborda
                    counter1--;
                }
            }while((fine1 == false) && (input1.charAt(counter1) != ' ') && (counter1 < input1.length()));
            //ripristino contatore
            counter1++;
            //prelevo la prima parola dalla stringa input2
            do{
                fine2 = false;
                parola2 = parola2 + input2.charAt(counter2);
                counter2++;
                if(counter2 == input2.length()){
                    fine2 = true;
                    //decremento di uno il contatore altrimenti il check dei caratteri del ciclo do-while sborda
                    counter2--;
                }
            }while((fine2 == false) && (input2.charAt(counter2) != ' ') && (counter2 < input2.length()));
            //ripristino contatore
            counter2++;
            //prelevo la prima parola dalla stringa input3
            do{
                fine3 = false;
                parola3 = parola3 + input3.charAt(counter3);
                counter3++;
                if(counter3 == input3.length()){
                    fine3 = true;
                    //decremento di uno il contatore altrimenti il check dei caratteri del ciclo do-while sborda
                    counter3--;
                }
            }while((fine3 == false) && (input3.charAt(counter3) != ' ') && (counter3 < input3.length()));
            //ripristino contatore
            counter3++;
            //unisco le tre parole
            output = output + parola1 + " " + parola2 + " "  + parola3 + " " ;
        }while((counter1 < input1.length()) && (counter2 < input2.length()) && (counter3 < input3.length()));
        //output
        JOptionPane.showMessageDialog(null, output);
    }
}