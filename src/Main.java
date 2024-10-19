
public class Main {
    public static void main(String[] args) {
        NaiveQueue queue =new NaiveQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
         queue.displayList(); // Display the queue

        System.out.println("Dequeued:"+queue.dequeue());
                queue.displayList(); //again the queue is displayed

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); //This should show that the queue is full.
        queue.displayList(); // Show the queue

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: The queue is dequeued and the process is repeated by printing each dequeued element: " + queue.dequeue());
        }
         queue.displayList();
    }
}