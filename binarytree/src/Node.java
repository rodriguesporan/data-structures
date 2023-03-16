public class Node implements BinaryTree {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
    }

    @Override
    public void insert(int value) {
        if (value <= this.data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    @Override
    public boolean contains(int value) {
        if (this.data == value) {
            return true;
        } else if (value < this.data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    @Override
    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.print(this.data);
        System.out.print(", ");
        if (right != null) {
            right.printInOrder();
        }
    }

    @Override
    public void printPreOrder() {
        System.out.print(this.data);
        System.out.print(", ");
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    @Override
    public void printPostOrder() {
        if (left != null) {
            left.printPostOrder();
        }
        if (right != null) {
            right.printPostOrder();
        }
        System.out.print(this.data);
        System.out.print(", ");
    }
}
