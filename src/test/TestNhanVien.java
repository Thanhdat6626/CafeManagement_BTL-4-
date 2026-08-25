package test;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import view.NhanVienPanel;

public class TestNhanVien {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("QUẢN LÝ NHÂN VIÊN");

            frame.setContentPane(new NhanVienPanel());

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setSize(1200, 700);
            frame.setLocationRelativeTo(null);

            frame.setResizable(true);

            frame.setVisible(true);
        });
    }
}
