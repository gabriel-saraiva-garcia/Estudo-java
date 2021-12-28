package com.contador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador extends JFrame {
    private JPanel mainPanel;
    private JLabel lblContagem;
    private JButton btnContar;

    public TelaContador (String title){
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        btnContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cc = 1;
                String contagem = "";

                while (cc<=10){
                  contagem += cc + " ";
                cc++;
                lblContagem.setText(contagem);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame tela = new TelaContador("Tela do Contador");
        tela.setVisible(true);
    }
}
