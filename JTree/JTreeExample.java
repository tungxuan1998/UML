package JTree;

import javax.swing.*;
import java.awt.*;

public class JTreeExample extends JFrame {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JTreeExample app = new JTreeExample();

                app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                app.setTitle("JTree hierarchy");
                app.setLayout(new BorderLayout());
                app.setVisible(true);
                app.getContentPane().setLayout(new FlowLayout());
                app.setBounds(0, 0, 500, 500);

                JTreePanel MyTree = new JTreePanel();
                app.add(MyTree.getjPanel(), "Center");
            }
        });
    }
}
