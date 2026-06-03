package core_java.src.com.xworkz.oops.inheritance;

public class Train {
    String name;
    String from;
    String to;
    double ticketPrice;
    String passangerName;
    boolean booking;

    public Train(String name, String from, String to, double ticketPrice, String passangerName, boolean booking) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.ticketPrice = ticketPrice;
        this.passangerName = passangerName;
        this.booking = booking;
    }
    public  void bookingInfo(){
        System.out.println("Train Name:"+this.name);
        System.out.println("From Station Name:"+this.from);
        System.out.println("To Station Name:"+this.to);
        System.out.println("Train Ticket Price:"+this.ticketPrice);
        System.out.println("Passanger Name:"+this.passangerName);
        System.out.println("Train is Booking:"+this.booking);

    }
}
