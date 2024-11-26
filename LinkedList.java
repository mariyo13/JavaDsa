import java.util.Scanner;

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
            tail = head;
            return;
        }
        node.nexNode = head;
        head = node;
        return;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.nexNode = node;
        tail = node;
        return;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("nothing to delete");
            return;
        }
        head = head.nexNode;
        return;
    }

    public void deleteLast() {
        if (tail == null) {
            System.out.println("nothing to delete");
            return;
        }
        Node curr = head;
        Node nextNode = head.nexNode;
        if (nextNode == null) {
            tail = curr;
        }
        while (nextNode != tail) {
            curr = nextNode;
            nextNode = nextNode.nexNode;
        }
        tail = nextNode;
        return;
    }

    public void displayLL() {
        if (head == null) {
            System.out.println("enter to data in the ll");
            return;
        }
        Node temNode = head;
        while (temNode != tail.nexNode) {
            System.out.print("-> " + temNode.data);
            temNode = temNode.nexNode;
        }
        System.out.println("->" + "null");
    }

    public boolean search(int data) {
        if (head == null) {
            return false;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("         **********************             ");
            System.out.println("press 1 addFirst");
            System.out.println("press 2 display");
            System.out.println("press 3 exit");
            System.out.println("press 4 addlast");
            System.out.println("press 5 deletefirst");
            System.out.println("press 6 deletelast");
            System.out.println("press 7  search");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("enter the value to add");
                    linkedList.addFirst(sc.nextInt());
                    break;
                case 2:
                    linkedList.displayLL();
                    break;
                case 3:
                    System.exit(0);
                    break;
                case 4:
                    System.out.println("enter the value to add");
                    linkedList.addLast(sc.nextInt());
                    break;
                case 5:
                    linkedList.deleteFirst();
                    break;
                case 6:
                    linkedList.deleteLast();
                    break;
                case 7:
                    System.out.println("enter the value to search");
                    boolean rs = linkedList.search(sc.nextInt());
                    System.out.println(rs ? "the value is present" : "the value not present");
                    break;
                default:
                    System.out.println("no service for this value");
            }
        }
    }

}
