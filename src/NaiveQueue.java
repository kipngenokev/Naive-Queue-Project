public class NaiveQueue {
    private int[] queue;
    private int head;
    private int tail;
    private int size;
    private int currentSize;
    public NaiveQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.head = 0;
        this.tail = 0;
        this.currentSize = 0;
    }
    public void enqueue(int value){
        if (isFull()) {
            System.out.println("Queue is full Cannot enqueue " + value);
            return;
        }
        queue[tail] = value;
        tail = (tail + 1) % size;
        currentSize++;
        System.out.println("Enqueued: " + value);
    }
    public Integer dequeue() {
        if (isEmpty()) {
            //System.out.println(“Queue is empty cannot delete “);
            return null;
        }
        int dequeuedValue = queue [head ];
        head = (head + 1) % size;
        currentSize--;
        return dequeuedValue;
    }
    public boolean isEmpty() {
        return currentSize == 0;
    }
    public boolean isFull() {
        return currentSize == size;
    }
    public void displayList() {
        if (isEmpty()) {
             System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queue[(head + i)% size]+ "");
        }
        System.out.println();
    }
}
