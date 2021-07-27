import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ticket implements ITicket{
    LocalDateTime entryTime;
    LocalDateTime exitTime;

    public Ticket(LocalDateTime entryTime, LocalDateTime exitTime) {
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public long getDays() {
        return ChronoUnit.DAYS.between(entryTime, exitTime);
    }

    @Override
    public long getHours() {
        return ChronoUnit.HOURS.between(entryTime, exitTime) - getDays() * 24;
    }

    @Override
    public long getMinutes() {
        return ChronoUnit.MINUTES.between(entryTime, exitTime) - (getDays() * 24 + getHours()) * 60;
    }

    @Override
    public String toString() {
        return "Ticket:" +
                "\nentryTime : " + entryTime +
                "\nexitTime  : " + exitTime +
                "\nDays: " + getDays() +
                ", Hours: " + getHours() +
                ", Minutes: " + getMinutes() +
                "\n----------------";
    }
}
