/**
 * Implementare l'algoritmo per il calcolo del codice fiscale.
   https://it.wikipedia.org/wiki/Codice_fiscale
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class CodiceFiscale{
    public static void main(String args[]){
        //dichiarazione variabili
        String nome, cognome, luogo_n, provincia_n, data_n, sesso, nome_max, cognome_max, nome_fisc, cognome_fisc, anno_fisc;
        //variabili per il controllo della data
        int gg, mm, aaaa;
        boolean data = false;
        //inizializzazione variabili
        nome_fisc = "";
        cognome_fisc = "";
        //leggo e controllo il nome
        do{
            nome = JOptionPane.showInputDialog("Inserire il nome");
            if((nome.equals("")) || ((nome.charAt(0)) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }
        }while((nome.equals("")) || ((nome.charAt(0)) == ' '));
        //leggo e controllo il cognome
        do{
            cognome = JOptionPane.showInputDialog("Inserire il cognome");
            if((cognome.equals("")) || ((cognome.charAt(0)) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }
        }while((cognome.equals("")) || ((cognome.charAt(0)) == ' '));
        //leggo e controllo il luogo di nascita
        do{
            luogo_n = JOptionPane.showInputDialog("Inserire il luogo di nascita");
            if((luogo_n.equals("")) || ((luogo_n.charAt(0)) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }
        }while((luogo_n.equals("")) || ((luogo_n.charAt(0)) == ' '));
        //leggo e controllo la provincia di nascita
        do{
            provincia_n = JOptionPane.showInputDialog("Inserire la provincia di nascita");
            if((provincia_n.equals("")) || ((provincia_n.charAt(0)) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }
        }while((provincia_n.equals("")) || ((provincia_n.charAt(0)) == ' '));
        //leggo e controllo il sesso
        do{
            sesso = JOptionPane.showInputDialog("Inserire il sesso. Scrivere maschio o femmina, senza spazi.");
            if((nome.equals("")) || ((nome.charAt(0)) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }else if((!(sesso.equals("maschio"))) && (!(sesso.equals("femmina")))){
                JOptionPane.showMessageDialog(null, "ERRORE di input!");
            }
        }while(((nome.equals("")) || ((nome.charAt(0)) == ' ')) || ((!(sesso.equals("maschio"))) && (!(sesso.equals("femmina")))));
        //leggo e controllo data
        do{
            do{
              gg = Integer.parseInt(JOptionPane.showInputDialog("Inserire un giorno. Accettati solo numeri interi e positivi"));
              mm = Integer.parseInt(JOptionPane.showInputDialog("Inserire il numero di un mese per verificare se la data è valida. Accettati solo numeri interi e positivi"));
              aaaa = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'anno. Accettati solo numeri interi e positivi."));
              if((gg <= 0) || (mm <= 0) || (mm > 12) || (aaaa <=0 )){
                JOptionPane.showMessageDialog(null, "Errore! Una data non può avere termini negativi o nulli");
              }
            }while((gg <= 0) || (mm <= 0) || (mm > 12) || (aaaa <=0 ));
            switch(mm){
                  case 1:
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 2:
                    if((aaaa % 4) == 0){
                      if(gg <= 29){
                        JOptionPane.showMessageDialog(null, "Data valida");
                        data = true;
                      }
                    }else if(gg <= 28){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 3:
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 4:
                    if(gg <= 30){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 5:
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 6:
                    if(gg <= 30){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 7:
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 8:
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 9:
                    if(gg <= 30){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 10:
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 11:
                    if(gg <= 30){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 12:
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
            }
        }while(data == false);
        //ricavo le prime 3 lettere del codice fiscale, che derivano solitamente dalle prime 3 consonanti del cognome
        //converto il cognome in una stringa di sole maiuscole
        cognome_max = cognome.toUpperCase();
        for(int i = 0; (i < cognome_max.length()) && (cognome_fisc.length() <= 3); i++){
            switch(cognome_max.charAt(i)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': break;
                default : cognome_fisc = cognome_fisc.concat((cognome_max.charAt(i) + ""));
            }
        }
        while(cognome_fisc.length() < 3){
            cognome_fisc.concat("X");
        }
        //ricavo le successive 3 lettere del codice fiscale, che derivano solitamente dalle prime 3 consonanti del nome
        //converto il nome in una stringa di sole maiuscole
        nome_max = nome.toUpperCase();
        for(int i = 0; (i < nome_max.length()) && (nome_fisc.length() <= 3); i++){
            switch(nome_max.charAt(i)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': break;
                default : nome_fisc = nome_fisc.concat((nome_max.charAt(i) + ""));
            }
        }
        while(nome_fisc.length() < 3){
            nome_fisc.concat("X");
        }
        //ricavo le ultime 2 cifre dell'anno che compongono il codice fiscale
        anno_fisc = 
    }
}