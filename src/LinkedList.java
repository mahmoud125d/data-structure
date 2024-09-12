public class LinkedList {
    static int counter = 0;
    Node head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(int value) {
        counter++;
        Node newNode = new Node();
        newNode.value = value;
        if (isEmpty()) {
            newNode.next = null;
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertBefore(int value, int element) {
        if (isFound(element)) {
            counter++;
            Node temp = head;
            Node newNode = new Node();
            newNode.value = value;
            while (temp != null && temp.next.value != element) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }
    public void append(int value){
        counter++;
        Node temp = head;
        Node newNode = new Node();
        newNode.value =value;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }
    public void delete(int value){
        if(value == head.value){
            head = head.next;
        }else{
            Node temp = head;
            Node prev = null;

            while (temp.value != value) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public boolean isFound(int value) {
        Node temp = head;
        boolean isFound = false;
        while (temp != null) {
            if (value == temp.value) {
                isFound = true;
                break;
            }
            temp = temp.next;
        }
        return isFound;
    }

    public String toString() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        return "";
    }

    public int count() {
        return counter;
    }
}
