public class HelpDeskStation {
  private CentralizedQueue queue;
  private int stationNumber;

  public HelpDeskStation(int stationNumber) {
      this.stationNumber = stationNumber;
      this.queue = CentralizedQueue.getInstance(); 
  }

  public void serveCustomer() {
      int currentNumber = queue.getNextQueueNumber();
      System.out.println("Help Desk Station " + stationNumber + " serving customer no. " + currentNumber);
  }

  public void resetQueue(int newQueueNumber) {
      queue.resetQueueNumber(newQueueNumber);
  }
}