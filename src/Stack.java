public class Stack {
    Node top;
    private static int size=0;
    public void push(int value){
        size++;
        Node newNode = new Node();
        newNode.value= value;
        if(isEmpty()){
            newNode.next =null;
            top=newNode;
        }else{
            newNode.next = top;
            top=newNode;
        }
    }
    public int pop(){
        int value=0;
        if(size>0){
             value= top.value;
            size--;
            top = top.next;
        }
        return value;
    }
    public int peek(){
        return top.value;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public boolean search(int value){
        Node temp=top;
        while(temp!=null){
            if(temp.value==value){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int getSize(){
        return size;
    }

}
