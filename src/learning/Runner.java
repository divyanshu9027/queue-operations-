package learning;

public class Runner {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(5);
        q.deQueue();
        q.enQueue(7);
        q.enQueue(12);
        q.deQueue();
        q.show();
    }
}
