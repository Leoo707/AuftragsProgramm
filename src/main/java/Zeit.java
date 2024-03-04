import java.util.ArrayList;

public class Zeit {
    private String time;
    private ArrayList<String> times = new ArrayList<>();
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public ArrayList<String> getTimes() {
        return times;
    }
    public void setTimes(String time) {
        this.times.add(time);
    }
    public Zeit(String time) {
        this.time = time;
    }
}
