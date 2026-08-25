package test;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import view.HoaDonPanel;

public class TestHoaDon {
public static void main(String[] args) {

    try {
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName()
        );
    } catch (Exception e) {
        e.printStackTrace();
    }

    SwingUtilities.invokeLater(() -> {

        JFrame frame = new JFrame("QUẢN LÝ HÓA ĐƠN");

        frame.setContentPane(new HoaDonPanel());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    });
}


}
