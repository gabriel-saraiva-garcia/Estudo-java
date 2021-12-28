package com.programaparimpar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaParImpar extends JFrame {
    private JPanel mainPanel;
    private JTextField txtValor;
    private JButton btnVerificar;
    private JLabel lblResultado;

    public TelaParImpar(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v = Integer.parseInt(txtValor.getText());
                if (v%2==0){
                    lblResultado.setText("Numero Par.");
                }else {
                    lblResultado.setText("Numero Ímpar.");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame tela = new TelaParImpar("Tela Par ou Impar");
        tela.setVisible(true);

    }
}
