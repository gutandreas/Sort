package recursion;
import java.util.LinkedList;

public class Tree {

    private TreeNode rootNode;

    public Tree(TreeNode rootNode) {
        this.rootNode = rootNode;
    }

    public  void addNode(TreeNode child, TreeNode parent){
        child.setParent(parent);
        parent.addChild(child);
    }

    public TreeNode getRoot() {
        return rootNode;
    }
}
