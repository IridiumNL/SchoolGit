class LinkedList {
    private Node head;
    private Node tail;
    int size;
     
    public LinkedList() {
        head = tail = null;
        size = 0;
    }
     
    public boolean isEmpty() {
        if(size == 0)
            return true;
        else
            return false;
    }
     
    public void insert(int data) {
        Node n = new Node();
        n.setData(data);
        if(isEmpty())
            head = n;
        else
            tail.setLink(n);
        tail = n;
        size++;
    }
     
    public void remove() {
        if(isEmpty())
            System.out.println("Can't remove. List is empty.");
        else if(size == 1) {
            head = tail = null;
            size = 0;
        }
        else {
            Node temp = head;
            while(temp.getLink() != tail)
                temp = temp.getLink();
            tail = temp;
            tail.setLink(null);
            size--;
        }
    }
 
    public void remove(int i) {
        if(isEmpty())
            System.out.println("Can't remove " + i + ". List is empty.");
        else {
            Node n = find(i);
            if(n == tail)
                System.out.println("Can't remove " + i + ". Not in the list");
            else {
                if(size == 1) {
                    head = tail = null;
                    size = 0;
                }
                else {
                    if(n == null)
                        head = head.getLink();
                    else if(n.getLink() == tail) {
                        tail = n;
                        n.setLink(null);
                    }
                    else {
                        Node next = n.getLink().getLink();
                        n.setLink(next);
                    }
                    size--;
                }
            }
        }
    }
 
    public Node find(int i) {
        Node prev = null;
        Node temp = head;
        while(temp != null) {
            if(temp.getData() == i)
                break;
            prev = temp;
            temp = temp.getLink();
        }
        return prev;
    }
 
    public boolean search(int data) {
        boolean found = false;
        Node temp = head;
        while(temp != null && !found) {
            if(temp.getData() == data) {
                found = true;
            }
            temp = temp.getLink();
        }
        return found;
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
    
    public int[] toArray() {
    	int[] arrayRep = new int[size];
    	Node temp = head;
    	if(isEmpty()) {
    		System.out.println("Your list had no items. No array created.");
    	}
    	else {
    		System.out.print("> Here's your array: ");
    		for(int i = 0; i < size; i++) {    		
    			arrayRep[i] = temp.getData();
    			temp = temp.getLink();
    			System.out.print(arrayRep[i] + " ");
    		}
    	}
    	System.out.println("");
    	return arrayRep;
    }
}
    
    		
    			
    			