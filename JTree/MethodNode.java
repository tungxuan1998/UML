package JTree;

import Parser.Method;

import javax.swing.tree.DefaultMutableTreeNode;

public class MethodNode extends DefaultMutableTreeNode {


    public MethodNode(Method method) {
        super(new ComponentDetail(method.getName(), "\\Icon\\Method\\" + method.getAccessModifier() + ".png"));
    }
}

