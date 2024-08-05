import javax.swing.*;


public class LavaCarFrame extends JFrame {
    public LavaCarFrame() {
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Clientes", new ClientePanel());
        tabbedPane.addTab("Funcionários", new FuncionarioPanel());
        tabbedPane.addTab("Serviços", new ServicoPanel());
        tabbedPane.addTab("Agendamentos", new AgendamentoPanel());
        tabbedPane.add("Relatórios", new RelatorioPanel());

        add(tabbedPane);
    }
}
