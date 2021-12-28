package com.votacaoswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaVotacao extends JFrame {
    private JPanel mainPanel;
    private JTextField txtIdade;
    private JButton btnConferir;
    private JLabel lblResultado;

    public TelaVotacao (String title){
        super();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        btnConferir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nasc = Integer.parseInt(txtIdade.getText());
                int idade = 2021 - nasc;
                if (idade <16 && idade >0){
                    lblResultado.setText("Você ainda não tem idade para votar.");
                }else if(idade<0) {
                    lblResultado.setText("Data inválida.");
                } else if( (idade >= 16 && idade < 18) || (idade > 70) ){
                        lblResultado.setText("O seu voto é opcional.");
                    }else{
                        lblResultado.setText("O seu voto é obrigatório.");
                    }


            }
        });
    }

    public static void main(String[] args) {
        JFrame tela = new TelaVotacao("Tela de Votação");
        tela.setVisible(true);
    }
}
