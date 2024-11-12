public class LinkedList {

    class Node {
        private int data;
        Node nexNode;

        public Node(int data) {
            this.data = data;
            this.nexNode = null;
        }

        @Override
        public String toString() {
            return "Node [data=" + data + "]";
        }

    }

    Node head;
    Node tail;

    public void addFirst(int num) {
        Node node = new Node(num);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.nexNode = head;
        head = node;
        return;
    }

    public void displayLL() {
        if (head == null) {
            System.out.println("enter to data in the ll");
            return;
        }
        Node temNode = head;
        while (temNode != null) {
            System.out.print("-> " + temNode.data);
            temNode = temNode.nexNode;
        }
        System.out.println("->" + "null");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.displayLL();
        linkedList.addFirst(1);
        linkedList.addFirst(10);
        linkedList.addFirst(1);
        linkedList.addFirst(10);
        linkedList.displayLL();
    }

}