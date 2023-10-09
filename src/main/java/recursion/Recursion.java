package recursion;

import java.util.LinkedList;

public class Recursion {

    public static void main(String[] args) {
        LinkedList<TreeNode> treeAsList = new LinkedList<>();
        Tree tree = getDefaultTree();
        addNodeToListRecursive(tree.getRoot(), treeAsList);
        printList(treeAsList);

    }

    public static LinkedList<TreeNode> addNodeToListRecursive(TreeNode currentNode, LinkedList<TreeNode> list) {

        list.add(currentNode);

        if (currentNode.getChildren().isEmpty()){
            return list;
        }

        for (int i = 0; i < currentNode.getChildren().size(); i++){
            TreeNode child = currentNode.getChildren().get(i);
            addNodeToListRecursive(child, list);}

        return list;
    }




    // Diese Methode nicht verändern!
    public static Tree getDefaultTree(){

        // Erste Ebene
        TreeNode root = new TreeNode("Albert");
        Tree tree = new Tree(root);

        // Zweite Ebene
        TreeNode n1 = new TreeNode("Fritz");
        TreeNode n2 = new TreeNode("Karl");
        TreeNode n3 = new TreeNode("Hans");

        // Dritte Ebene
        TreeNode n4 = new TreeNode("Konrad");
        TreeNode n5 = new TreeNode("Peter");
        TreeNode n6 = new TreeNode("Martin");
        TreeNode n7 = new TreeNode("Felix");
        TreeNode n8 = new TreeNode("Manfred");

        // Vierte Ebene
        TreeNode n9 = new TreeNode("Otto");
        TreeNode n10 = new TreeNode("Hugo");
        TreeNode n11 = new TreeNode("Theo");
        TreeNode n12 = new TreeNode("Anton");

        // Zuweisung der Kinderknoten zu den Elternknoten
        tree.addNode(n1, root);
        tree.addNode(n2, root);
        tree.addNode(n3, root);

        tree.addNode(n4, n1);
        tree.addNode(n5, n1);
        tree.addNode(n6, n2);
        tree.addNode(n7, n2);
        tree.addNode(n8, n3);

        tree.addNode(n9, n4);
        tree.addNode(n10, n4);
        tree.addNode(n11, n6);
        tree.addNode(n12, n6);

        return tree;
    }

    public static void printList(LinkedList<TreeNode> linkedList){
        for (TreeNode node : linkedList){
            System.out.println(node.getName());
        }
    }


}
