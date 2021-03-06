public class DLinkedList {
	private DNode head;
	private DNode tail;
	int size;
	
	public DLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void insert(int data) {
		DNode n = new DNode(data);
		if (isEmpty()) {
			head = n;
		} else {
			DNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.setNext(n);
			n.setPrev(temp);
		}
		
		tail = n;
		size++;
	}
	
	public void remove() {
		if(isEmpty()) {
			System.out.println("List is empty, cannot remove");
		} else if(size == 1) {
			head = tail = null;
			size = 0;
		} else {
			DNode temp = head;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			tail = temp;
			size--;
		}
	}
	
	public void remove(int i) {
		DNode temp = head;
		while(temp.getData() != i) {
			if(temp.next == null) {
				System.out.println("Did not find " + i + " in the list.");
				return;
			}
			temp = temp.next;
		}
		DNode nNode = temp.next;
		DNode pNode = temp.prev;
		pNode.setNext(nNode);
		nNode.setPrev(pNode);
	}
	
	public DNode find(int i) {
		DNode prev = null;
		DNode temp = head;
		while(temp != null) {
			if(temp.getData() == i) {
				break;
			}
			prev = temp;
			temp = temp.getPrev();
		}
		return prev;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		DNode temp = head;
		while(temp != null) {
			if(temp.getNext() == null) {
				sb.append(temp.getData());
			} else {
				sb.append(temp.getData() + ", ");
				
			}
			temp = temp.getNext();
		}
		sb.append("]");
		String s = sb.toString();
		return s;
	}
	
	public String reverse() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		DNode temp = tail;
		while(temp.getPrev() != null) {
			sb.append(temp.getData() + ", ");
			temp = temp.getPrev();
		}
		if (temp.getPrev() == null) {
			sb.append(temp.getData());
		}
		sb.append("]");
		String s = sb.toString();
		return s;
	}
}
