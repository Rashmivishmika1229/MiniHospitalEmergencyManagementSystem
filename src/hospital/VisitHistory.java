package hospital;

public class VisitHistory {

    private VisitNode head;

    public VisitHistory() {
        head = null;
    }

    // Add a new visit to the history
    public void addVisit(Visit visit) {

        VisitNode newNode = new VisitNode(visit);

        if (head == null) {
            head = newNode;
        } else {
            VisitNode current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        System.out.println("Visit added successfully.");
    }

    // Remove a visit using Visit ID
    public void removeVisit(int visitId) {

        if (head == null) {
            System.out.println("Visit history is empty.");
            return;
        }

        if (head.visit.getVisitId() == visitId) {
            head = head.next;
            System.out.println("Visit removed successfully.");
            return;
        }

        VisitNode current = head;

        while (current.next != null) {

            if (current.next.visit.getVisitId() == visitId) {
                current.next = current.next.next;
                System.out.println("Visit removed successfully.");
                return;
            }

            current = current.next;
        }

        System.out.println("Visit not found.");
    }

    // Search for a visit using Visit ID
    public Visit searchVisit(int visitId) {

        VisitNode current = head;

        while (current != null) {

            if (current.visit.getVisitId() == visitId) {
                return current.visit;
            }

            current = current.next;
        }

        return null;
    }

    // Display all visits
    public void displayHistory() {

        if (head == null) {
            System.out.println("Visit history is empty.");
            return;
        }

        VisitNode current = head;

        System.out.println("Patient Visit History:");
        System.out.println("----------------------");

        while (current != null) {
            current.visit.displayVisit();
            System.out.println("----------------------");
            current = current.next;
        }
    }
}