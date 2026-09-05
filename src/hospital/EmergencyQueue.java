package hospital;

public class EmergencyQueue {

    private PatientQueueNode front;
    private PatientQueueNode rear;

    public EmergencyQueue() {
        front = null;
        rear = null;
    }

    // Enqueue: add a patient to the rear of the queue
    public void enqueue(Patient patient) {

        PatientQueueNode newNode = new PatientQueueNode(patient);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Patient added to emergency queue.");
    }

    // Dequeue: remove the patient from the front
    public Patient dequeue() {

        if (front == null) {
            System.out.println("Emergency queue is empty.");
            return null;
        }

        Patient patient = front.patient;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        return patient;
    }

    // Display all patients currently waiting
    public void displayQueue() {

        if (front == null) {
            System.out.println("Emergency queue is empty.");
            return;
        }

        PatientQueueNode current = front;

        System.out.println("Patients currently waiting:");
        System.out.println("---------------------------");

        while (current != null) {
            current.patient.displayPatient();
            System.out.println("---------------------------");
            current = current.next;
        }
    }
}