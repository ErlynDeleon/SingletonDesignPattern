public class PagIbigQueueApp {
  public static void main(String[] args) {

      HelpDeskStation station1 = new HelpDeskStation(1);
      HelpDeskStation station2 = new HelpDeskStation(2);
      HelpDeskStation station3 = new HelpDeskStation(3);


      station1.serveCustomer();
      station2.serveCustomer();
      station3.serveCustomer();

      station3.resetQueue(1);

      station1.serveCustomer();
      station2.serveCustomer();
  }
}