import java.util.ArrayDeque;
import java.util.NoSuchElementException;

class CircularQueue {
    private ArrayDeque<Integer> queue;
    private int capacity;

    public CircularQueue(int capacity) {
        this.queue = new ArrayDeque<>(capacity);
        this.capacity = capacity;
    }

    public boolean enqueue(int item) {
        if (queue.size() == capacity) {
            return false; // Queue is full
        }
        queue.addLast(item);
        return true;
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.pollFirst();
    }

    public int peek() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.peekFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isFull() {
        return queue.size() == capacity;
    }
 public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        System.out.println("Front element: " + circularQueue.peek()); // Output: Front element: 10
        System.out.println("Dequeued element: " + circularQueue.dequeue()); // Output: Dequeued element: 10
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);
        System.out.println("Is queue full? " + circularQueue.isFull()); // Output: Is queue full? true
		circularQueue.printQueue();
		
        while (!circularQueue.isEmpty()) {
            System.out.println("Dequeued element: " + circularQueue.dequeue());
		
        }
    }
}
