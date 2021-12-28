package com.pacote;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaBonita extends JFrame{
    private JPanel mainPanel;
    private JButton clicaPraSaberOButton;
    private JLabel lblResultado;

    public TelaBonita(String title) {
        super(title);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        clicaPraSaberOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String beth;
                lblResultado.setText("Seu futuro é brilhante");
            }
        });
    }

    public static void main(String[] args) {
        JFrame tela = new TelaBonita("Minha tela bonita");
        tela.setVisible(true);
    }
}
