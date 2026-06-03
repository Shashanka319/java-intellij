package core_java.src.com.xworkz.oops.inheritance;

public class MetroTrain extends Train{
    String cityName;
    boolean seatAvailable;

     MetroTrain(String cityName,boolean seatAvailable, String from, String name, String to, double ticketPrice, String passangerName, boolean booking) {
        super(name, from, to, ticketPrice, passangerName, booking);
        this.cityName=cityName;
        this.seatAvailable=seatAvailable;
    }
    public  void metroStationInfo(){
        System.out.println("City Name:"+this.cityName);
            System.out.println("Seat Available:"+this.seatAvailable);

    }

}
