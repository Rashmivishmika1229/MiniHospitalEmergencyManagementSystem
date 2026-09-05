package hospital;

public class TreatmentStack {

    private TreatmentStackNode top;

    public TreatmentStack() {
        top = null;
    }

    // Push: add a completed treatment record to the top
    public void push(TreatmentRecord treatmentRecord) {

        TreatmentStackNode newNode = new TreatmentStackNode(treatmentRecord);

        newNode.next = top;
        top = newNode;

        System.out.println("Treatment record added to stack.");
    }

    // Pop: remove and return the most recently completed treatment
    public TreatmentRecord pop() {

        if (top == null) {
            System.out.println("Treatment history stack is empty.");
            return null;
        }

        TreatmentRecord record = top.treatmentRecord;
        top = top.next;

        return record;
    }

    // Display all treatment records from top to bottom
    public void displayStack() {

        if (top == null) {
            System.out.println("Treatment history stack is empty.");
            return;
        }

        TreatmentStackNode current = top;

        System.out.println("Treatment History:");
        System.out.println("------------------");

        while (current != null) {
            current.treatmentRecord.displayTreatment();
            System.out.println("------------------");
            current = current.next;
        }
    }
}