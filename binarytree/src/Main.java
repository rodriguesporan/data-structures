public class Main {

    public static void main(String[] args) {
        executeOnNode(new Node(10));
    }

    private static void executeOnNode(BinaryTree tree) {
        tree.insert(5);
        tree.insert(15);
        tree.insert(8);
        tree.insert(12);
        tree.insert(17);
        tree.insert(3);
        tree.insert(4);
        tree.printInOrder();
        System.out.print("\n");
        tree.printPreOrder();
        System.out.print("\n");
        tree.printPostOrder();
    }
}
