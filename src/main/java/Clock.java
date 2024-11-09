
public class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        this.hour = hour % 24;
        this.minute = minute % 60;
    }
    public void addMinutes(int minutesToAdd) {
        int totalMinutes = this.minute + minutesToAdd;
        this.hour = (this.hour + totalMinutes / 60) % 24;
        this.minute = totalMinutes % 60;
    }

    // Método para restar minutos
    public void subtractMinutes(int minutesToSubtract) {
        int totalMinutes = this.hour * 60 + this.minute - minutesToSubtract;
        if (totalMinutes < 0) {
            totalMinutes += 1440;
        }
        this.hour = (totalMinutes / 60) % 24;
        this.minute = totalMinutes % 60;
    }
    public boolean isMorning() {
        return hour >= 6 && hour < 12;
    }
    public boolean isAfternoon() {
        return hour >= 12 && hour < 18;
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
