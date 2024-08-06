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
        JLabel funcaoLabel = new JLabel("Função:");
        funcaoField = new JTextField();
        JLabel horarioLabel = new JLabel("Hora:");
        horarioField = new JTextField();
        JLabel salarioLabel = new JLabel("Salario:");
        salarioField = new JTextField();

        JButton cadastrarButton = new JButton("Cadastrar Funcionario");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String funcao = funcaoField.getText();
                String horario = horarioField.getText();

                JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
                clearFields();

            }
        });

                add(nomeLabel);
                add(nomeField);
                add(funcaoLabel);
                add(funcaoField);
                add(salarioLabel);
                add(salarioField);
                add(horarioLabel);
                add(horarioField);
                add(cadastrarButton);
            }

            private void clearFields(){
                nomeField.setText("");
                funcaoField.setText("");
                salarioField.setText("");
                horarioField.setText("");


            }
        }
