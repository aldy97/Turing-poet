public class linkedList {

    //we use false to represent state 0, and true to be state 1
    //pivot is like a pointer in C++, referring to the node being selected
    boolean state;
    Node pivot;
    Node head;

    public linkedList(){
        state = false;
        pivot = null;
        head  = null;
    }

    /*internal class for Node
      @param: data is the number we have in each slot of the tape
              word is the word collected from selected poem lines
    */
    static class Node{

        int data;
        String word;
        Node prev;
        Node next;

        Node(int data, String word){
            this.data = data;
            this.word = word;
            prev = null;
            next = null;
        }


    }

    //add a new node to the linked list at the end
    public void insert(Node node){

        //if the linked list is empty in the first place
        if (head == null){
            pivot = node;
            node.data = 1;
            head = node;
            head.next = null;
            head.prev = null;
        } else {
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = node;
            node.prev = curr;
            node.next = null;
        }
    }


    //state 0 to state 1, and otherwise
    public void switchState(){
        state = !state;
    }

    public void shiftToLeft(){
        if(pivot.prev==null){pivot = pivot;}
        else {pivot = pivot.prev;}
    }

    private void shiftToRight(){
        if(pivot.next==null){pivot = pivot;}
        else {pivot = pivot.next;}
    }

    public String proceed(){
        //at state 0;
        int iteration = (int) (Math.random()*100);
        for(int i=0;i<iteration;i++){
            if (!state){
                if (pivot.data == 0){
                    shiftToLeft();
                } else {
                    shiftToRight();
                    switchState();
             }
            } else {
                if (pivot.data == 0){
                    pivot.data = 1;
                    shiftToLeft();
                    switchState();
                } else {
                    pivot.data = 0;
                    shiftToRight();
                }
            }
        }
        return pivot.word;
    }
}
