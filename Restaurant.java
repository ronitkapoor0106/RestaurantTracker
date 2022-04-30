import java.util.*;
import java.lang.*;

public class Restaurant {
  private ArrayList<Integer> tables;
  private ArrayList<Integer> waitList;
  private String name;
  private Address address;
  
  public Restaurant(String name, Address address) {
    tables = new ArrayList<Integer>();
    waitList = new ArrayList<Integer>();
    this.name = name;
    this.address = address;
  }

  public void setTable(int num) {
    for(int i = 0; i < num; i++) {
      tables.add(0);
    }
  }
  
  public String getName() {
    return name;
  }
  public Address getAddress() {
    return address;
  }
  public void updateWaitlist(int curTime) {
    
    waitList.add(curTime);
  }

  
  public int getWaitingTime(int curTime){
    updateTable(curTime);
    int wlsize = waitList.size();
    int multiple = wlsize/tables.size();
    int num = wlsize % tables.size();
    // subt one to account for indexing
    int time = curTime - tables.get(num-1);
    time += multiple * 90;
    return time;
  }

  
  public void updateTable(int curTime) {
    for(int i = 0; i < tables.size(); i++) {
      if(tables.get(i) == 0 || tables.get(i) + 90 < curTime) {
        // table is empty
        waitList.remove(0);
        tables.set(i, curTime);
      }
    }
  }
}
