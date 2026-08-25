package test;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import view.BanAnPanel;

public class TestBanAn {

public static void main(String[] args) {

    SwingUtilities.invokeLater(() -> {

        JFrame frame = new JFrame("QUẢN LÝ BÀN ĂN");

        frame.setContentPane(new BanAnPanel());

        frame.setSize(1200,700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    });
}

}

