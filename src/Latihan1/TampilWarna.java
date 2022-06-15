package Latihan1;
import javax.swing.JFrame;

public class TampilWarna {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Menggunakan warna - imam hadid gunawan 2011019");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        WarnaJPanel WarnaJPanel = new WarnaJPanel();
        frame.add(WarnaJPanel);
        frame.setSize(800, 180);
        frame.setVisible(true);
    }    
}
