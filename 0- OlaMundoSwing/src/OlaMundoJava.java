import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoJava extends JFrame{
    private JPanel mainPanel;
    private JLabel lbl1Mensagem;
    private JButton btnClick;

    public OlaMundoJava(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            lbl1Mensagem.setText("Olá, Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new OlaMundoJava("Meu Olá, Mundo Swing ");
        frame.setVisible(true);

    }
}
