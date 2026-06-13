import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);
        System.out.println("Top Element: " + pq.peek());
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}