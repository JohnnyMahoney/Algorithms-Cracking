package randomAlgs;

public class MiddleNode {

    private static class LinkedListNode {
        public int data;
        public LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedListNode middleNode(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next == null){
            return slow;
        }
        else return slow.next;
    }

    public static void main(String[] args) {

        LinkedListNode linkedListNode = new LinkedListNode(4);
        LinkedListNode linkedListNode1 = new LinkedListNode(5);
        LinkedListNode linkedListNode2 = new LinkedListNode(6);
        LinkedListNode linkedListNode3 = new LinkedListNode(7);
        LinkedListNode linkedListNode4 = new LinkedListNode(8);
        LinkedListNode linkedListNode5 = new LinkedListNode(9);

        linkedListNode.next = linkedListNode1;
        linkedListNode1.next = linkedListNode2;
        linkedListNode2.next = linkedListNode3;
        linkedListNode3.next = linkedListNode4;
        linkedListNode4.next = linkedListNode5;
        LinkedListNode test = middleNode(linkedListNode);
        System.out.println(test.data);

    }
}
