class TestQueueB {
    public static void main(String[] args) {
    	Queue q2 = new Queue();
        for(int i = 0; i < 10; i++) {
        	int v = (int)(Math.random() * 12);
        	q2.enqueue(v);
        	System.out.println(q2 + " (" + v + ")");
        }
        q2.dequeue(); System.out.println(q2);
        q2.dequeue(); System.out.println(q2);
        q2.dequeue(); System.out.println(q2);
        q2.dequeue(); System.out.println(q2);
    }
}