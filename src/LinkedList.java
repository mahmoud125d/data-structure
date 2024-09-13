class LinkedList {
    Node head;
    private static int size=0;
    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(int value) {
        size++;
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
    public void insertBefore(int value,int element){
        size++;
        if(isFound(element)){
            Node newNode = new Node();
            newNode.value = value;
            Node temp = head;

            if (head.value == element) {
                newNode.next = head;
                head = newNode;
                return;
            }

            while(temp.next.value != element){
                temp=temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }else{
            System.out.println("element not found");
        }

    }
    public void append(int value){
        size++;
        Node newNode = new Node();
        Node temp = head;
        if(isEmpty()){
            newNode.next=null;
            head=newNode;
            newNode.value=value;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.next=null;
        temp.next=newNode;
        newNode.value=value;
    }
    public void delete(int value){
        size--;
        Node temp = head;
        Node prev = null;
        if(isFound(value)){
            if(value == head.value){
                deleteFirst();
            }
            while(temp.value!=value){
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;


        }else{
            System.out.println("element not found");
        }
    }
    public void deleteAll(int value){
        
        while(isFound(value)){
            Node temp = head;
            Node prev = null;
            if(isFound(value)){
                if(value == head.value){
                    head=head.next;
                    return;
                }
                while(temp.value!=value){
                    prev=temp;
                    temp=temp.next;
                }
                prev.next=temp.next;


            }else{
                System.out.println("element not found");
            }
            size--;
        }
    }
    public void deleteFirst(){
        size--;
        head=head.next;
    }
    public void deleteLast(){
        size--;
        Node temp = head;
            while(temp.next.next!=null){

                temp=temp.next;
            }
            temp.next=null;


    }

    public boolean isFound(int value){
        Node temp = head;
        boolean isFound=false;
        while (temp != null) {
            if(value == temp.value){
                isFound= true;
                break;
            }
            temp = temp.next;
        }
        return isFound;
    }

    public int getSize(){
        return size;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}