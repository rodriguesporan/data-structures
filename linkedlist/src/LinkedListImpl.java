class LinkedListImpl implements LinkedList {

    private Node head;

    @Override
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    @Override
    public void prepend(int value) {
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
    }

    @Override
    public void print() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            System.out.print(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.data);
        System.out.println("");
    }

    @Override
    public void deleteByValue(int value) {
        if (head == null) {
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }
        if (head.next == null) {
            return;
        }
        Node previousNode = head;
        Node currentNode = head.next;
        while (currentNode.data != value && currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode.data == value) {
            previousNode.next = null;
        }
    }
}
