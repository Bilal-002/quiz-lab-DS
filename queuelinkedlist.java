
package datastructurelabquiz;


public class queuelinkedlist implements queueinterface {
      private node front;
    private node    back;
    private int size;

      public queuelinkedlist () {
      
    }
     public queuelinkedlist(int size) {
        this.size = size;
    }
 public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public void makeEmpty() {
        this.size = 0;
        front = back = null;
    }
 @Override
    public void enqueue(Object value) {
        node newNode = new node(value);
        if (isEmpty()) {
            this.front = this.back = newNode;
        } else {
            newNode.setNext(this.front);
            this.front = newNode;
        }
        this.size++;
    }

  
    @Override
    public void dequeue() {
        if (isEmpty()) {
            throw new NullPointerException("Queue  empty");
        } else if (size == 1) {
            makeEmpty();
        } else {
            node currentNode = this.front;
            while (currentNode.getNext() != this.back) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            this.back = currentNode;
            this.size--;
        }
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue empty");
        } else {
            node currentNode = this.front;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + "=> ");
                currentNode = currentNode.getNext();
            }
            System.out.println();
        }
} 
    //get,minvalue
     public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}

