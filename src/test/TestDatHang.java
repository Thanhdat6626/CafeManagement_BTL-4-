package test;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import view.DatHangPanel;

public class TestDatHang {

public static void main(String[] args) {

    SwingUtilities.invokeLater(() -> {

        JFrame frame = new JFrame("QUẢN LÝ ĐẶT HÀNG");

        frame.setContentPane(new DatHangPanel());

        frame.setSize(1200,700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    });
}

}

