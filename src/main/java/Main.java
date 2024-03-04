import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Arbeiter> workers = new ArrayList<>();
        System.out.println("Herzlich wilkommen im Auftrags-Einteilungs Programm!");
        System.out.println();
        System.out.println("AUFTRÄGE MÜSSEN FOLGENDERMAßEN ANGEGEBEN WERDEN:");
        System.out.println("Name des Auftrages");
        System.out.println("Beschreibung des Auftrages");
        System.out.println("Ort des Auftrages");
        System.out.println("Datum des Auftrages");
        System.out.println("Zeit des Auftrages");
        System.out.println();
        System.out.println("Geben Sie bitte die Anzahl der Arbeiter an, für welche Sie Aufträge hinzufügen wollen:");
        while (true) {
            int amountWorkers = input.nextInt();
            if (amountWorkers > 0) {
                for (int i = 0; i < amountWorkers; i++) {
                    Arbeiter arbeiter = arbeiterErstellen(input, i+1);
                    workers.add(arbeiter);
                    for (Arbeiter worker : workers) {
                        System.out.println("Anzahl Auftraege?");
                        int amountJobs = input.nextInt();
                        System.out.println(amountJobs + " Auftrag/Aufträge für: " + worker.getName());
                        for (int j = 0; j < amountJobs; j++) {
                            arbeiter.setJob(auftragErstellen(input));
                        }
                    }
                    for (Auftrag auftrag: arbeiter.getJobs()) {
                        System.out.println("AuftragName: " + auftrag.getName());
                        System.out.println("AuftragBeschreibung: " + auftrag.getDescription());
                        System.out.println("Ort: " + auftrag.getPlace());
                        System.out.println("Datum: " + auftrag.getDate());
                        System.out.println("Zeit: " + auftrag.getTime());
                        System.out.println("----------------------------------------------------");
                    }
                }
                break;
            } else {
                System.out.println("Unmögliche Eingabe! Erneut versuchen.");
            }
        }
    }
    public static Arbeiter arbeiterErstellen(Scanner input, int amountWorkers) {
        System.out.println("Name des Arbeiters " + amountWorkers + ":");
        String name = input.next();
        return new Arbeiter(name);
    }
    public static int anzahlAuftraege(ArrayList<Arbeiter> workers, Scanner input) {
        System.out.println("Antzahl Auftraege?");
        int amountJobs = input.nextInt();
        for (Arbeiter worker : workers) {
            System.out.println(amountJobs + " Auftrag/Aufträge für: " + worker.getName());
        }
        return amountJobs;
    }
    public static Auftrag auftragErstellen(Scanner input) {
        input.nextLine();
        System.out.println("Name des Auftrages:");
        String name = input.nextLine();
        System.out.println("Beschreibung des Auftrages:");
        String description = input.nextLine();
        return new Auftrag(name, description,  ortErstellen(input), datumErstellen(input), zeitErstellen(input));
    }
    public static Ort ortErstellen(Scanner input) {
        System.out.println("Ort des Auftrages:");
        String name = input.next();
        return new Ort(name);
    }
    public static Datum datumErstellen(Scanner input) {
        System.out.println("Datum:");
        String date = input.next();
        return new Datum(date);
    }
    public static Zeit zeitErstellen(Scanner input) {
        System.out.println("Zeit:");
        String time = input.next();
        return new Zeit(time);
    }
}
