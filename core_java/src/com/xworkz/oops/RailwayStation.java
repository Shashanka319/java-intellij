package core_java.src.com.xworkz.oops;

public class RailwayStation {
    String name;
    double ticketPrice;
    RailwayStation(String name, double ticketPrice){
        this.name=name;
        this.ticketPrice=ticketPrice;
    }
    public void railwayInfo(){
        System.out.println("Name:"+this.name);
        System.out.println("Ticket Price:"+this.ticketPrice);
    }
}
