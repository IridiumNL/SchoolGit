class TestLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.toArray();
        l.insert(1); l.insert(2); l.insert(3);
        System.out.println(l);
 
        l.remove(); System.out.println(l);
        l.remove(); System.out.println(l);
        l.remove(); System.out.println(l);
        l.remove(); System.out.println(l);
 
        l.insert(1); l.insert(3); l.insert(5); l.insert(15);
        System.out.println(l);
        l.toArray();
     
        l.remove(1); l.remove(3); l.remove(2); l.remove(15);
        System.out.println(l);
        l.toArray();
 
        if(l.search(5))
            System.out.println("5 is in the list");
        else
            System.out.println("5 is not in the list");
 
        if(l.search(25))
            System.out.println("25 is in the list");
        else
            System.out.println("25 is not in the list");
   }
}