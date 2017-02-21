class QueueB {
    private Node head;
    private Node tail;
    private int size;
     
    public QueueB() {
        head = tail = null;
        size = 0;
    }
     
    public boolean isEmpty() {
        if(size == 0)
            return true;
        else
            return false;
    }
     
    public void enqueue(int data) {
        Node n = new Node();
        n.setData(data);
        if(isEmpty())
            head = n;
        else
            tail.setLink(n);
        tail = n;
        size++;
    }
     
    public void dequeue() {
        if(isEmpty()) 
            System.out.println("Cannot dequeue. Queue is empty.");
        else if(size == 1) {
            head = tail = null;
            size = 0;
        } else {
            int min = Integer.MAX_VALUE;
            Node ref = head;
            Node prevRef = null;
            Node smallest = null;
            Node before_smallest = null;
            Node after_smallest = null;
            while(ref != null) {
            	if(min > ref.getData()) {
            		min = ref.getData();
            		smallest = ref;
            		before_smallest = prevRef;
            		after_smallest = ref.getLink();
            	}
            	prevRef = ref;
            	ref = ref.getLink();
            }
            
            if (before_smallest == null) {
            	head = head.getLink();
            } else if (after_smallest == null) {
        		before_smallest.setLink(null);
        		tail = before_smallest;
        	}
            else { 
            	before_smallest.setLink(smallest.getLink());
            }
        }
        size--;
    }
    
    public int getDataAtHead() {
        return head.getData();
    }
     
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        Node temp = head;
        while(temp != null) {
            if(temp.getLink() == null)
                sb.append(temp.getData());
            else
                sb.append(temp.getData() + ", ");
            temp = temp.getLink();
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}