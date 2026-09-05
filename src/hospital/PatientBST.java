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

    // Search for a patient using Patient ID
    public Patient search(int patientId) {
        PatientNode result = searchPatient(root, patientId);

        if (result != null) {
            return result.patient;
        }

        return null;
    }

    private PatientNode searchPatient(PatientNode current, int patientId) {

        if (current == null) {
            return null;
        }

        if (patientId == current.patient.getPatientId()) {
            return current;
        }

        if (patientId < current.patient.getPatientId()) {
            return searchPatient(current.left, patientId);
        }

        return searchPatient(current.right, patientId);
    }

    // Delete a patient using Patient ID
    public void delete(int patientId) {
        if (search(patientId) == null) {
            System.out.println("Patient not found.");
            return;
        }

        root = deletePatient(root, patientId);
        System.out.println("Patient deleted successfully.");
    }

    private PatientNode deletePatient(PatientNode current, int patientId) {

        if (current == null) {
            return null;
        }

        if (patientId < current.patient.getPatientId()) {
            current.left = deletePatient(current.left, patientId);

        } else if (patientId > current.patient.getPatientId()) {
            current.right = deletePatient(current.right, patientId);

        } else {

            // Case 1: No child
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (current.left == null) {
                return current.right;
            }

            // Case 3: Only left child
            if (current.right == null) {
                return current.left;
            }

            // Case 4: Two children
            PatientNode successor = findMinimum(current.right);
            current.patient = successor.patient;
            current.right = deletePatient(
                    current.right,
                    successor.patient.getPatientId());
        }

        return current;
    }

    // Find the smallest node in a subtree
    private PatientNode findMinimum(PatientNode current) {

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }
}