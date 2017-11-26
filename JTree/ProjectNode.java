package JTree;

import Parser.Project;
import Parser.SourceFile;

import javax.swing.tree.DefaultMutableTreeNode;

public class ProjectNode extends DefaultMutableTreeNode {

    public ProjectNode(Project project) {
        super("Project");

        for(SourceFile file : project.getSourceFiles()) {
            this.add(new ClassNode(file.getContainedClass()));
        }
    }
}
