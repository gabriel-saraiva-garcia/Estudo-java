package com.programapernasswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPernas extends JFrame {
    private JPanel mainPanel;
    private JTextField txtPernas;
    private JButton btnVerificar;
    private JLabel lblTipo;

    public TelaPernas(String title) {
        super(title);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pernas = Integer.parseInt(txtPernas.getText());
                String tipo;
                switch (pernas) {
                    case 1:
                        tipo = "Saci";
                        break;
                    case 2:
                        tipo = "Bipede";
                        break;
                    case 3:
                        tipo = "tripé";
                        break;
                    case 4:
                        tipo = "Quadrupede";
                        break;
                    case 6, 8:
                        tipo = "Aranha";
                        break;
                    default:
                        tipo = "E.T.";
                }
                lblTipo.setText(tipo);

            }
        });
    }

    public static void main(String[] args) {
        JFrame tela = new TelaPernas("Verificador de pernas das pessoas");
        tela.setVisible(true);

    }
}
