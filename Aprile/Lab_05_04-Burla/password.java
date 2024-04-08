import javax.swing.JOptionPane;
public class password {
    public static void main(String args[]){
        String pass = "ciao";
        String pass1;
        do{
            pass1 = JOptionPane.showInputDialog("Inserire password");
            if((!(pass1.equals(pass)))){
                JOptionPane.showMessageDialog(null, "Password errata o nulla" , "Sbagliata", JOptionPane.ERROR_MESSAGE);
            }
        }while((!(pass1.equals(pass))));
    }
}