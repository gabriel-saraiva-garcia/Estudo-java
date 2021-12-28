package com.operadoresswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaValores extends JFrame {
    private JPanel mainPanel;
    private JTextField txtNum;
    private JTextField txtDen;
    private JButton dividirButton;
    private JLabel lblDiv;
    private JLabel lblRes;

    public TelaValores(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtNum.getText());
                int d = Integer.parseInt(txtDen.getText());
                float div = n/d;
                float res = (float) Math.sqrt(n);
                lblDiv.setText(Float.toString(div));
                lblRes.setText(Float.toString(res));
            }
        });
    }

    public static void main(String[] args) {
        JFrame tela = new TelaValores("Tela Valores");
        tela.setVisible(true);
    }

}
