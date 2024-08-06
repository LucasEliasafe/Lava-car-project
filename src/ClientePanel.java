import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientePanel extends JPanel {
    private JTextField nomeField;
    private JTextField telefoneField;
    private JTextField placaCarroField;
    private JTextField modeloCarroField;

    public ClientePanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(10);
        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField(10);
        JLabel placaCarroLabel = new JLabel("Placa carro:");
        placaCarroField = new JTextField(7);
        JLabel modeloCarroLabel = new JLabel("Modelo carro:");
        modeloCarroField = new JTextField(10);

        JButton cadastrarButton = new JButton("Cadastrar Cliente");
        cadastrarButton.setPreferredSize(new Dimension(140, 25));

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String telefone = telefoneField.getText();
                String placaCarro = placaCarroField.getText();
                String modeloCarro = modeloCarroField.getText();

                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                clearFields();


            }
        });

        add(nomeLabel);
        add(nomeField);
        add(telefoneLabel);
        add(telefoneField);
        add(placaCarroLabel);
        add(placaCarroField);
        add(modeloCarroLabel);
        add(modeloCarroField);
        add(new JLabel());
        add(cadastrarButton);

    }

    public void clearFields() {
    nomeField.setText("");
    telefoneField.setText("");
    placaCarroField.setText("");
    modeloCarroField.setText("");

    }
}
