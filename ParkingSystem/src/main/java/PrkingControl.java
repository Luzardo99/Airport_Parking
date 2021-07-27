import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class PrkingControl {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(LocalDateTime.of(2021, Month.JULY, 1, 1, 50),
                                    LocalDateTime.of(2021, Month.JULY, 9, 0, 11));

        System.out.println(ticket1.toString());

        ParkingLot parkingLot = new ParkingLot();

    }
}
