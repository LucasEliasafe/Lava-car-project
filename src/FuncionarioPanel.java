import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FuncionarioPanel extends JPanel {
    private JTextField nomeField;
    private JTextField funcaoField;
    private JTextField horarioField;
    private JTextField salarioField;


    public FuncionarioPanel() {
        setLayout(new GridLayout(4, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();

    }
}
