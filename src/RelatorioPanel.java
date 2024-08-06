import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RelatorioPanel extends JPanel {
    private JTextArea relatorioArea;

    public RelatorioPanel() {
        setLayout(new BorderLayout());

        relatorioArea = new JTextArea();
        relatorioArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(relatorioArea);

        JButton gerarRelatorioButton = new JButton("Gerar Relatorio");
        gerarRelatorioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                relatorioArea.setText("Relatório gerado");
            }
        });

        add(scrollPane, BorderLayout.CENTER);
        add(gerarRelatorioButton, BorderLayout.SOUTH);
    }
}
