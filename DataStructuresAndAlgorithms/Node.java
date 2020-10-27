
package DataStructuresAndAlgorithms;

public class Node {

    //contained data
    public int data = 0;
    //ref to next node
    public Node next = null;
    
    public Node(){}
    
    public Node(int dat){
        this.data = dat;    
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
    
    
    
}
