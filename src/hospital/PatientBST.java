package hospital;

public class PatientBST {

    private PatientNode root;

    public PatientBST() {
        root = null;
    }

    // Insert a new patient into the BST
    public void insert(Patient patient) {
        root = insertPatient(root, patient);
    }

    private PatientNode insertPatient(PatientNode current, Patient patient) {

        if (current == null) {
            return new PatientNode(patient);
        }

        if (patient.getPatientId() < current.patient.getPatientId()) {
            current.left = insertPatient(current.left, patient);
        } else if (patient.getPatientId() > current.patient.getPatientId()) {
            current.right = insertPatient(current.right, patient);
        } else {
            System.out.println("Patient ID already exists.");
        }

        return current;
    }

    // Display patients in ascending order of Patient ID
    public void displayInOrder() {
        if (root == null) {
            System.out.println("No patient records found.");
            return;
        }

        inOrder(root);
    }

    private void inOrder(PatientNode current) {

        if (current != null) {
            inOrder(current.left);
            current.patient.displayPatient();
            System.out.println("-------------------------");
            inOrder(current.right);
        }
    }
}