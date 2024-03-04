public class Auftrag {
    private String name;
    private String description;
    Ort place;
    Datum date;
    Zeit time;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPlace() {
        return place.getName();
    }
    public void setPlace(Ort place) {
        this.place = place;
    }
    public String getDate() {
        return date.getDate();
    }
    public void setDate(Datum date) {
        this.date = date;
    }
    public String getTime() {
        return time.getTime();
    }
    public void setTime(Zeit time) {
        this.time = time;
    }
    public Auftrag(String name, String description, Ort place, Datum date, Zeit time) {
        this.name = name;
        this.description = description;
        this.place = place;
        this.date = date;
        this.time = time;
    }
}
