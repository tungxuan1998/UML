package JTree;

import Parser.Attribute;
import Parser.Class;
import Parser.Method;

import javax.swing.tree.DefaultMutableTreeNode;

public class ClassNode extends DefaultMutableTreeNode {
    String type;


    public ClassNode(Class aClass) {
        super(new ComponentDetail(aClass.getName(), "\\Icon\\Class\\" + aClass.getType() + ".png"));

        for (Attribute atts : aClass.getAttributes()) {
            this.add(new AttributeNode(atts));
        }

        for (Method method : aClass.getMethods()) {
            this.add(new MethodNode(method));
        }
    }


}
