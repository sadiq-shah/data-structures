package Trees;

public class TreesDemo {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(2);
        bst.insert(6);
        bst.insert(3);
        bst.preTraversal();
    }
}
