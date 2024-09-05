package randomAlgs.LinkedList;

import java.util.HashSet;

public class ReverseLinkedList {

    /*
        In-Place manipulation means space complexity O(1)
        Time complexity - O(n)
     */
    public static LinkedListNode reverse(LinkedListNode head) {

        LinkedListNode prev = null;
        LinkedListNode current = head;
        LinkedListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void main(String[] args) {

        LinkedListNode node0 = new LinkedListNode(1);
        LinkedListNode node1 = new LinkedListNode(2);
        LinkedListNode node2 = new LinkedListNode(3);
        LinkedListNode node3 = new LinkedListNode(4);
        LinkedListNode node4 = new LinkedListNode(5);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node0.next = node1;
        LinkedListNode current = reverse(node0);

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }
}
