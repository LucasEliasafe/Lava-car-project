import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class AgendamentoPanel extends JPanel {
    private JTextField clienteField;
    private JTextField servicoField;
    private JTextField dataHoraField;
    private JTextField funcionarioField;


    public AgendamentoPanel() {
        setLayout(new GridLayout(5, 2));

        JLabel clienteLabel = new JLabel("Cliente:");
        clienteField = new JTextField();
        JLabel servicoLabel = new JLabel("Serviço:");
        servicoField = new JTextField();
        JLabel dataHoraLabel = new JLabel("Data Hora:");
        dataHoraField = new JTextField();
        JLabel funcionarioLabel = new JLabel("Funcionario Responsável:");
        funcionarioField = new JTextField();

        JButton agendarButton = new JButton("Agendar Serviço");
        agendarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cliente = clienteField.getText();
                String servico = servicoField.getText();
                String dataHora = dataHoraField.getText();
                String funcionario = funcionarioField.getText();

                JOptionPane.showMessageDialog(null, "Serviço agendado com sucesso!");
                clearFields();
            }

        });

        add(clienteLabel);
        add(clienteField);
        add(servicoLabel);
        add(servicoField);
        add(dataHoraLabel);
        add(dataHoraField);
        add(funcionarioLabel);
        add(funcionarioField);
        add(agendarButton);

    }

    private void clearFields() {
        clienteField.setText("");
        servicoField.setText("");
        dataHoraField.setText("");
        funcionarioField.setText("");
    }
}
