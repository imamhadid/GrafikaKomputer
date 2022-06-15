package Latihan3contoh2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TampilWarnaJFrame extends JFrame {
    private JButton UbahWarnaJButton;
    private Color warna = Color.LIGHT_GRAY;
    private JPanel WarnaJPanel;
    public TampilWarnaJFrame(){
        super("Menggunakan JColorChooser");

        WarnaJPanel = new JPanel();
        WarnaJPanel.setBackground(warna);

        UbahWarnaJButton = new JButton("Ubah Warna");
        UbahWarnaJButton.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    warna = JColorChooser.showDialog(
                        TampilWarnaJFrame.this, "Pilih sebuah warna", warna);

                    if(warna == null)
                    warna = Color.LIGHT_GRAY;

                    WarnaJPanel.setBackground(warna);
                }
            }
        );

        add(WarnaJPanel, BorderLayout.CENTER);
        add(UbahWarnaJButton, BorderLayout.SOUTH);

        setSize(400, 130);
        setVisible(true);
    }
}
