package hospital;

public class PatientQueueNode {

    Patient patient;
    PatientQueueNode next;

    public PatientQueueNode(Patient patient) {
        this.patient = patient;
        this.next = null;
    }
}