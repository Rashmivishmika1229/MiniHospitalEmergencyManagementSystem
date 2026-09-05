package hospital;

public class Main {

    public static void main(String[] args) {

        PatientBST patientBST = new PatientBST();

        Patient patient1 = new Patient(
                105, "John Silva", 45, "0771234567", "Chest Pain");

        Patient patient2 = new Patient(
                101, "Nimal Perera", 32, "0712345678", "Fever");

        Patient patient3 = new Patient(
                110, "Kamal Fernando", 60, "0756789012", "Diabetes");

        patientBST.insert(patient1);
        patientBST.insert(patient2);
        patientBST.insert(patient3);

        System.out.println("Patients in ascending order of Patient ID:");
        System.out.println("----------------------------------------");

        patientBST.displayInOrder();
    }
}