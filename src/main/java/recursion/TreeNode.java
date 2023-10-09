package recursion;

import java.util.LinkedList;

public class TreeNode {
    private String name;
    private TreeNode parent;
    private LinkedList<TreeNode> children = new LinkedList<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public LinkedList<TreeNode> getChildren() {
        return children;
    }

    public void addChild(TreeNode child) {
        child.setParent(this);
        children.add(child);
    }

    public void removeChild(TreeNode child) {
        children.remove(child);
    }
}