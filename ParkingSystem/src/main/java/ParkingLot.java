import java.util.ArrayList;

public class ParkingLot {

    public ArrayList<ITicket> tickets = new ArrayList<ITicket>();
    private static final double DAILY_MAX = 15;
    private static final double HOURLY_RATE = 2;

    public double calculateFee(int index) throws Exception {
        if (index > tickets.size()){
            throw new Exception("Index out of bounds");
        }

        // Get the corresponding Ticket
        Ticket ticket = tickets.get(index);
  
        double fee = 0;
        // The number of days the car has been in the lot
        long days = ticket.getDays();
        // The number of hours the car has been in the lot
        long hours = ticket.getHours();
        // The number of minutes teh car has been in the lot
        long minutes = ticket.getMinutes();
        // If The car was only in the lot for less than 30 minutes
        if(hours == 0 && days == 0 && minutes < 30)
        {
            return 0;
        }
        // If the car has been in the lot for more than 30 minutes but less than an hour
        if(days == 0 && hours == 0 && minutes >=30)
        {
            return 2;
        }
        // If the car has been parked for more than 7 hours, charge a flat fee of $15
        if(hours >= 7 && minutes > 0)
        {
            days += 1;
            hours = 0;
        }
        // If the car has been in the lot for less than 7 hours, charge for the extra hour
        else if(minutes > 0)
        {
            hours += 1;
        }
        // Give the riders the 7th day of parking free

        if(days >= 7)
        {
            long excludedDays = days/7;
            long seventhDayHours = days%7;
            // Check if the car has been parked for less than the whole day on a given 7th day
            if(seventhDayHours == 6)
            {
                hours = 0;
            }
            days -= excludedDays;
        }
        // Calculate the total fee that the parker has to pay during checkout
        fee = hours * HOURLY_RATE + days * DAILY_MAX;
        return fee;
    }
}
