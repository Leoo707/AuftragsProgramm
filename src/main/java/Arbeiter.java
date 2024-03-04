import java.util.ArrayList;

public class Arbeiter {
    private String name;
    private ArrayList<Auftrag> jobs;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Auftrag> getJobs() {
        return jobs;
    }
    public void setJob (Auftrag auftrag) {
        this.jobs.add(auftrag);
    }
    public Arbeiter(String name) {
        this.name = name;
        this.jobs = new ArrayList<>();
    }
}
