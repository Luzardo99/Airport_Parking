import java.util.ArrayList;

public class ParkingLot {

    ArrayList<Ticket> tickets;
    private static final double DAILY_MAX = 15;
    private static final double HOURLY_RATE = 2;

    public double calculateFee(int index){
        Ticket ticket = tickets.get(index);
        double fee = 0;

        long days = ticket.getDays();
        long hours = ticket.getHours();
        long minutes = ticket.getMinutes();



        return fee;
    }

}
