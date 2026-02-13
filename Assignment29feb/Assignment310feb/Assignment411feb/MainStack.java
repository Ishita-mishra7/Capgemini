package Assignment29feb.Assignment310feb.Assignment411feb;
class Node{
    int data;
    Node next;


    Node(int data){
        this.data=data;
        this.next=null;
    }
}


class Stack{
    Node top;

    void push(int value){
        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;
        System.out.println(value+":Pushed to stack");
    }

    int pop(){
        if(top==null){
            System.out.println("Stack under flow");
            return -1;
        }

        int popped=top.data;
        top=top.next;
        return popped;
    }

    int peek(){
        if(top==null){
            System.out.println("Stack under flow");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }

    void print(){
        Node temp=top;
        while (temp!=null){
            System.out.println(temp.data);
        }
    }
}
public class MainStack {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
