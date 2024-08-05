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
        setLayout(new GridLayout(5, 2));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();
        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField();
        JLabel placaCarroLabel = new JLabel("Placa carro:");
        placaCarroField = new JTextField();
        JLabel modeloCarroLabel = new JLabel("Modelo carro:");
        modeloCarroField = new JTextField();

        JButton cadastrarButton = new JButton("Cadastrar Cliente");
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
        add(cadastrarButton);

    }

    public void clearFields() {


    }
}
