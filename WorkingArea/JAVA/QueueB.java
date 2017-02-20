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
            int value = head.getData();
            Node checker = head;
            for(int i = 0; i < size; i++) {
            	if(value <= checker.getData()) {
            		value = checker.getData();
            		checker = checker.getLink();
            	} else {
            		checker = checker.getLink();
            	}
            }
            
            size--;
        }
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