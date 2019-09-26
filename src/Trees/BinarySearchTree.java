package Trees;

public class BinarySearchTree {
    Node root;

    public void insert(Object value) {

        Node temp = root;
        Node newNode = new Node(value);

        if(root == null) {
            root = newNode;
            return;
        }

        while(temp != null) {
            if(value.toString().equals(temp.getData().toString())) {
                return;
            }
            else if(value.toString().compareTo(temp.getData().toString()) > 0) {

                if(temp.getRight() == null) {
                    temp.setRight(newNode);
                    return;
                }

                temp = temp.getRight();
            }
            else {
                if(temp.getLeft() == null) {
                    temp.setLeft(newNode);
                    return;
                }
                temp = temp.getLeft();
            }
            return;
        }
    }

    public void preTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node temp) {
        if(temp != null) {
            preOrderTraversal(temp.getLeft());
            System.out.println(temp.getData().toString());
            preOrderTraversal(temp.getRight());
        }
        return;
    }

}
