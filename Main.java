class Main {
  public static void main(String[] args) {
    Address a = new Address("Main Street");
    Restaurant baba = new Restaurant("Counter", a);
    baba.setTable(10);
    System.out.println("Welcome to the program. Please enter a restaurant and its zip code?");
    // get the goods
    baba.getWaitingTime(5);
    
  }
}
