import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class PrkingControl {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(LocalDateTime.of(2021, Month.JULY, 1, 4, 50),
                                    LocalDateTime.of(2021, Month.JULY, 2, 0, 11));

        System.out.println(ticket1.toString());

        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket1);

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.tickets = tickets;

        int index = 0;

        try{
            double fee = parkingLot.calculateFee(index);
            System.out.println("Ticket #" + index + " fee: $" + fee);
        } catch (Exception e) {
            System.out.println("Failed to calculate fee: " + e.getMessage());
        }

    }
}
