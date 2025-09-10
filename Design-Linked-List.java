class MyLinkedList {

    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node cnode = head;
        for (int i = 0; i < index; i++) {
            cnode = cnode.next;
        }
        return cnode.val;
    }

    public void addAtHead(int val) {
        Node nnode = new Node(val);
        nnode.next = head;
        head = nnode;
        size++;
    }

    public void addAtTail(int val) {
        Node tnode = new Node(val);
        if (head == null) {
            head = tnode;
        } else {
            Node cnode = head;
            while (cnode.next != null) {
                cnode = cnode.next;
            }
            cnode.next = tnode;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node nnode = new Node(val);
        Node cnode = head;
        for (int i = 0; i < index - 1; i++) {
            cnode = cnode.next;
        }
        nnode.next = cnode.next;
        cnode.next = nnode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node cnode = head;
            for (int i = 0; i < index - 1; i++) {
                cnode = cnode.next;
            }
            cnode.next = cnode.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */