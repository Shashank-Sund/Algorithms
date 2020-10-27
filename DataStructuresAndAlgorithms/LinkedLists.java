
package DataStructuresAndAlgorithms;

public class LinkedLists {

    //SINGLY LINKED LISTS
    //only hold the reference to the next node
    //contain reference to head and tail
    
    //DOUBLY LINKED LISTS
    //Hold the reference to the next node and the previous one
    //contain reference to head and tail
    
    public Node head;
    public Node tail = null;
    public int size = 0;

    public LinkedLists(int data) {
        this.head = new Node(data);
        this.size++;
    }
    
    public int size(){
        return this.size;
    }
    
    public void addLast(int data2){
        Node node = new Node(data2);
        if(this.size == 1){
            this.tail = node;
            this.head.next = this.tail;
        }
        else{
            this.tail.next = node;            
        }
        size++;
    }
    
    public void addFirst(int data2){
        Node node = new Node(data2);
        if(this.size == 1){
            this.tail = this.head;
            this.head = node;
            this.head.next = this.tail;
        }
        else{
            node.next = this.head;
            this.head = node;
        }
        size++;
    }
    
    public int peekFirst(){
        return this.head.data;
    }
    
    public int peekLast(){
        return this.tail.data;
    }
    
    public void removeFirst(){
        this.head = this.head.next;
        size--;
    }
    
    public void removeLast(){
        if(size == 2){
            this.head.next = null;
        }
        else{
            Node trav = this.head;
            Node trav2 = this.head.next;

            int count = 1;
            while(count < size){
                if(trav2.next != null){
                    trav.next = null;
                }
                else{
                    trav = trav2;
                    trav2 = trav2.next;
                }
            }
        }
        size--;       
    }
    
    public void removeAtIndex(int index){
        if(index == 0){
            removeFirst();
        }
        else{
            Node trav = this.head;   
            Node trav2 = this.head.next;
            for(int i=1; i<size; i++){
                if(i == index){
                    trav.next = trav2.next;
                    trav2 = null;

                }
                else{
                    trav = trav2;
                    trav2 = trav2.next;
                }
            }   
        }
        size--;
    }
    
    public void reverseList(){
        
        
        
    }
}
