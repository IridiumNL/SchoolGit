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
}
 
class TestLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(1); l.insert(2); l.insert(3);
        System.out.println(l);
 
        l.remove(); System.out.println(l);
        l.remove(); System.out.println(l);
        l.remove(); System.out.println(l);
        l.remove(); System.out.println(l);
 
        l.insert(1); l.insert(3); l.insert(5); l.insert(15);
        System.out.println(l);
     
        l.remove(1); l.remove(3); l.remove(2); l.remove(15);
        System.out.println(l);
 
        if(l.search(5))
            System.out.println("5 is in the list :(");
        else
            System.out.println("5 is not in the list");
 
        if(l.search(25))
            System.out.println("25 is in the list");
        else
            System.out.println("25 is not in the list");
   }
}
