import java.util.ArrayList;

public class Datum {
    private String date;
    private ArrayList<String> dates = new ArrayList<>();
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public ArrayList<String> getDates() {
        return dates;
    }
    public void setDates(String date) {
        this.dates.add(date);
    }
    public Datum(String date) {
        this.date = date;
    }
}
