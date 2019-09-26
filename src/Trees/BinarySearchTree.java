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
        }

        return;
    }

    public void preTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node temp) {
        if(temp != null) {
            System.out.println(temp.getData().toString());
            preOrderTraversal(temp.getLeft());
            preOrderTraversal(temp.getRight());
        }
        return;
    }

    public void inTraversal() {
       inOrderTraversal(root);
       return;
    }

    private void inOrderTraversal(Node temp) {
        if(temp != null) {
            inOrderTraversal(temp.getLeft());
            System.out.println(temp.getData().toString());
            inOrderTraversal(temp.getRight());
        }
        return;
    }

    public void postTraversal() {
        postOrderTraversal(root);
        return;
    }

    private void postOrderTraversal(Node temp) {
        if(temp != null) {
            postOrderTraversal(temp.getLeft());
            postOrderTraversal(temp.getRight());
            System.out.println(temp.getData().toString());
        }
        return;
    }

}
