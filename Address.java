public class Address {
  private int zipcode;
  private double latitude;
  private double longitude;
  public Address(int zip) {
    zipcode = zip;
  }
  private double[] lat;
  private double[] longg;
  private int[] data;
  
  public void zipToLatLong() {
    for(int i = 0; i < data.length; i++) {
      if(zipcode == data[i]) {
        latitude = lat[i];
        longitude = longg[i];
      }
    }
  }

  public double getLat() {
    return latitude;
  }
  public double getLong() {
    return longitude;
  }

  public double getDistance(Address other) {
    
  }
}
