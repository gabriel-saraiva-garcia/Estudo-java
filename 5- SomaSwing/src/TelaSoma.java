import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSoma extends JFrame{
    private JPanel mainPanel;
    private JTextField txtN1;
    private JTextField txtN2;
    private JButton btnSoma;
    private JLabel lblSoma;

    public TelaSoma(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float n1 = Float.parseFloat(txtN1.getText());
                float n2 = Float.parseFloat(txtN2.getText());
                float soma = n1+ n2;
                lblSoma.setText(Float.toString(soma));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new TelaSoma("Somar Valores");
        frame.setVisible(true);


    }
}
