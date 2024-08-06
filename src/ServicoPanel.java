import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServicoPanel extends JPanel {
    private JTextField tipoServicoField;
    private JTextField tempoEstimadoField;
    private JTextField precoField;

    public ServicoPanel() {
        setLayout(new GridLayout(4,2));

        JLabel tipoServicoLabel = new JLabel("Tipo de Servico:");
        tipoServicoField = new JTextField();
        JLabel precoLabel = new JLabel("Preço:");
        precoField = new JTextField();
        JLabel tempoEstimadoLabel = new JLabel("Tempo Estimado:");
        tempoEstimadoField = new JTextField();

        JButton cadastrarButton = new JButton("Cadastrar Serviço");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoServico = tipoServicoField.getText();
                String preco = precoField.getText();
                String tempoEstimado = tempoEstimadoField.getText();

                JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso!");
                clearFields();
            }
        });

        add(tipoServicoLabel);
        add(tipoServicoField);
        add(precoLabel);
        add(precoField);
        add(tempoEstimadoLabel);
        add(tempoEstimadoField);
        add(cadastrarButton);
    }

    public void clearFields() {
        tipoServicoField.setText("");
        precoField.setText("");
        tempoEstimadoField.setText("");
    }

}
