package randomAlgs.LinkedList;

public class RemoveNthLastNode {
    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {

        LinkedListNode dummy = new LinkedListNode(0);
        dummy.next = head;

        LinkedListNode first = dummy;
        LinkedListNode second = dummy;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedListNode linkedListNode1 = new LinkedListNode(1);
        LinkedListNode linkedListNode2 = new LinkedListNode(2);
        LinkedListNode linkedListNode3 = new LinkedListNode(3);
        LinkedListNode linkedListNode4 = new LinkedListNode(4);
        LinkedListNode linkedListNode5 = new LinkedListNode(5);
        linkedListNode1.next = linkedListNode2;
        linkedListNode2.next = linkedListNode3;
        linkedListNode3.next = linkedListNode4;
        linkedListNode4.next = linkedListNode5;
        LinkedListNode modifiedHead = removeNthLastNode(linkedListNode1, 2);

        while (modifiedHead != null) {
            System.out.print(modifiedHead.data + " -> ");
            modifiedHead = modifiedHead.next;
        }
        System.out.println("NULL");
    }
}
