public class CentralizedQueue {
    private static CentralizedQueue instance;
    private int queueNumber;

    private CentralizedQueue() {
        queueNumber = 1; 
    }

    public static CentralizedQueue getInstance() {
        if (instance == null) {
            instance = new CentralizedQueue();
        }
        return instance;
    }

    public int getNextQueueNumber() {
        return queueNumber++;
    }

    public void resetQueueNumber(int newQueueNumber) {
        if (newQueueNumber > 0) {
            queueNumber = newQueueNumber;
            System.out.println("Queue has been reset to: " + newQueueNumber);
        } else {
            System.out.println("Queue number must be positive.");
        }
    }
}