package hospital;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient(
                105,
                "John Silva",
                45,
                "0771234567",
                "Chest Pain"
        );

        VisitHistory history = patient.getVisitHistory();

        Visit visit1 = new Visit(
                301,
                "2026-09-01",
                "Dr. Silva",
                "Chest Pain",
                "Medication"
        );

        Visit visit2 = new Visit(
                302,
                "2026-09-02",
                "Dr. Fernando",
                "High Blood Pressure",
                "Blood Pressure Treatment"
        );

        Visit visit3 = new Visit(
                303,
                "2026-09-03",
                "Dr. Perera",
                "Follow-up",
                "Routine Check-up"
        );

        System.out.println("Adding patient visits:");
        System.out.println("----------------------");

        history.addVisit(visit1);
        history.addVisit(visit2);
        history.addVisit(visit3);

        System.out.println();

        history.displayHistory();

        System.out.println("\nSearching for Visit ID 302:");
        System.out.println("---------------------------");

        Visit foundVisit = history.searchVisit(302);

        if (foundVisit != null) {
            foundVisit.displayVisit();
        } else {
            System.out.println("Visit not found.");
        }

        System.out.println("\nSearching for Visit ID 999:");
        System.out.println("---------------------------");

        foundVisit = history.searchVisit(999);

        if (foundVisit != null) {
            foundVisit.displayVisit();
        } else {
            System.out.println("Visit not found.");
        }

        System.out.println("\nRemoving Visit ID 302:");
        System.out.println("----------------------");

        history.removeVisit(302);

        System.out.println();

        history.displayHistory();

        System.out.println("\nRemoving remaining visits:");
        System.out.println("-------------------------");

        history.removeVisit(301);
        history.removeVisit(303);

        System.out.println();

        history.displayHistory();
    }
}