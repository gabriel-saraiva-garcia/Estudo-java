package com.pacoteidade;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaIdade extends JFrame {
    private JPanel mainPanel;
    private JButton btnCalc;
    private JTextField txtAno;
    private JLabel lblIdade;
    private JLabel lblSituacao;

    public TelaIdade(String title){
        super(title);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ano = Integer.parseInt(txtAno.getText());
                int idade = 2021 - ano;
                lblIdade.setText(Integer.toString(idade));
                String sit = ((idade >= 16 && idade<18) || (idade > 70)) ? "Voto Opcional.":"Voto Obrigatório.";
                 lblSituacao.setText(sit);

            }
        });
    }

    public static void main(String[] args) {
        JFrame tela = new TelaIdade("Verificador de Idade");
        tela.setVisible(true);

    }
}
