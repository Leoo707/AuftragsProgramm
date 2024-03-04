import java.util.ArrayList;

public class Ort {
    private String name;
    private ArrayList<String> places = new ArrayList<>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<String> getPlaces() {
        return places;
    }
    public void setPlaces(String name) {
        this.places.add(name);
    }
    public Ort(String name) {
        this.name = name;
    }
}
