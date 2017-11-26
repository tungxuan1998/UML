package JTree;

import javax.swing.*;

import Parser.*;

public class JTreePanel {
    private JPanel jPanel = new JPanel();
    private JScrollPane jScrollPane;

    public JTreePanel() {
        JTree tree = new JTree(new ProjectNode(new Project("C:\\Users\\tungx_000\\Downloads\\UML-Visualizer-master\\src\\parser")));
        tree.setCellRenderer(new ComponentTreeCellRenderer());
        tree.setRootVisible(true);
        tree.setShowsRootHandles(true);

        jScrollPane = new JScrollPane(tree);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel.add(tree);
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public JScrollPane getjScrollPane() {
        return jScrollPane;
    }
}
