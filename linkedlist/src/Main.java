public class Main {

    public static void main(String[] args) {
        System.out.println("Data Structures: Linked List");
        executeOnNode(new LinkedListImpl());
    }

    static void executeOnNode(LinkedList linkedList) {
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.print();
        linkedList.prepend(0);
        linkedList.print();
        linkedList.deleteByValue(4);
        linkedList.print();
    }
}
