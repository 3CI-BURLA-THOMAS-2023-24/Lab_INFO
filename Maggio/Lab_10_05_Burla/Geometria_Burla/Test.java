/**
 * La classe Test (main)
    -Creare 3 oggetti Punto
    -visualizzare le coordinate del punto1
    -dire se ci sono due punti coincidenti
    -...
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Test{
    public static void main(String args[]){
        //creo oggetti di classe Punto
        Punto p = new Punto(3, 9);
        Punto s = new Punto();
        Punto t = new Punto(5, 9);
        //imposto coordinate s
        s.setAscissa(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto S")));
        s.setOrdinata(Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto S")));
        //visualizzo coordinate p
        JOptionPane.showMessageDialog(null, p);
    }
}