package Latihan2contoh1;
import javax.swing.JFrame;

public class GambarBusur {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menggambar Busur 2011019 - Imam hadid gunawan: IFB2B");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BusurJpanel busurJPanel = new BusurJpanel();
        frame.add(busurJPanel);
        frame.setSize(300,210);
        frame.setVisible(true);
    }
}
