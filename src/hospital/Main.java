package hospital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PatientBST patientBST = new PatientBST();
        EmergencyQueue emergencyQueue = new EmergencyQueue();
        TreatmentStack treatmentStack = new TreatmentStack();

        int choice;

        do {
            System.out.println("\n==============================================");
            System.out.println("   MINI HOSPITAL EMERGENCY MANAGEMENT SYSTEM");
            System.out.println("==============================================");
            System.out.println("1. Add Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. Display All Patients");
            System.out.println("----------------------------------------------");
            System.out.println("5. Add Emergency Patient");
            System.out.println("6. Serve Emergency Patient");
            System.out.println("7. Display Emergency Queue");
            System.out.println("----------------------------------------------");
            System.out.println("8. Add Treatment Record");
            System.out.println("9. Remove Latest Treatment");
            System.out.println("10. Display Treatment History");
            System.out.println("----------------------------------------------");
            System.out.println("11. Add Patient Visit");
            System.out.println("12. Search Visit");
            System.out.println("13. Remove Visit");
            System.out.println("14. Display Visit History");
            System.out.println("----------------------------------------------");
            System.out.println("0. Exit");
            System.out.println("==============================================");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                // ================= PATIENT BST =================

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Contact Number: ");
                    String contactNumber = scanner.nextLine();

                    System.out.print("Enter Medical Condition: ");
                    String medicalCondition = scanner.nextLine();

                    Patient patient = new Patient(
                            patientId,
                            name,
                            age,
                            contactNumber,
                            medicalCondition
                    );

                    patientBST.insert(patient);
                    System.out.println("Patient added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Patient ID to search: ");
                    int searchId = scanner.nextInt();

                    Patient foundPatient = patientBST.search(searchId);

                    if (foundPatient != null) {
                        System.out.println("\nPatient found:");
                        System.out.println("-------------------------");
                        foundPatient.displayPatient();
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID to delete: ");
                    int deleteId = scanner.nextInt();

                    patientBST.delete(deleteId);
                    break;

                case 4:
                    System.out.println("\nAll Patients:");
                    System.out.println("-------------------------");
                    patientBST.displayInOrder();
                    break;

                // ================= EMERGENCY QUEUE =================

                case 5:
                    System.out.print("Enter Patient ID: ");
                    int emergencyId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String emergencyName = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int emergencyAge = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Contact Number: ");
                    String emergencyContact = scanner.nextLine();

                    System.out.print("Enter Medical Condition: ");
                    String emergencyCondition = scanner.nextLine();

                    Patient emergencyPatient = new Patient(
                            emergencyId,
                            emergencyName,
                            emergencyAge,
                            emergencyContact,
                            emergencyCondition
                    );

                    emergencyQueue.enqueue(emergencyPatient);
                    break;

                case 6:
                    Patient servedPatient = emergencyQueue.dequeue();

                    if (servedPatient != null) {
                        System.out.println("\nServing patient:");
                        System.out.println("-------------------------");
                        servedPatient.displayPatient();
                    }
                    break;

                case 7:
                    emergencyQueue.displayQueue();
                    break;

                // ================= TREATMENT STACK =================

                case 8:
                    System.out.print("Enter Patient ID: ");
                    int treatmentPatientId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String treatmentPatientName = scanner.nextLine();

                    System.out.print("Enter Treatment: ");
                    String treatment = scanner.nextLine();

                    System.out.print("Enter Doctor Name: ");
                    String treatmentDoctor = scanner.nextLine();

                    TreatmentRecord record = new TreatmentRecord(
                            treatmentPatientId,
                            treatmentPatientName,
                            treatment,
                            treatmentDoctor
                    );

                    treatmentStack.push(record);
                    break;

                case 9:
                    TreatmentRecord removedTreatment = treatmentStack.pop();

                    if (removedTreatment != null) {
                        System.out.println("\nMost recently completed treatment:");
                        System.out.println("----------------------------------");
                        removedTreatment.displayTreatment();
                    }
                    break;

                case 10:
                    treatmentStack.displayStack();
                    break;

                // ================= VISIT HISTORY =================

                case 11:
                    System.out.print("Enter Patient ID: ");
                    int visitPatientId = scanner.nextInt();
                    scanner.nextLine();

                    Patient visitPatient = patientBST.search(visitPatientId);

                    if (visitPatient == null) {
                        System.out.println("Patient not found. Add the patient first.");
                        break;
                    }

                    System.out.print("Enter Visit ID: ");
                    int visitId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Visit Date: ");
                    String visitDate = scanner.nextLine();

                    System.out.print("Enter Doctor Name: ");
                    String doctorName = scanner.nextLine();

                    System.out.print("Enter Diagnosis: ");
                    String diagnosis = scanner.nextLine();

                    System.out.print("Enter Treatment: ");
                    String visitTreatment = scanner.nextLine();

                    Visit visit = new Visit(
                            visitId,
                            visitDate,
                            doctorName,
                            diagnosis,
                            visitTreatment
                    );

                    visitPatient.getVisitHistory().addVisit(visit);
                    break;

                case 12:
                    System.out.print("Enter Patient ID: ");
                    int searchVisitPatientId = scanner.nextInt();
                    scanner.nextLine();

                    Patient searchVisitPatient =
                            patientBST.search(searchVisitPatientId);

                    if (searchVisitPatient == null) {
                        System.out.println("Patient not found.");
                        break;
                    }

                    System.out.print("Enter Visit ID to search: ");
                    int searchVisitId = scanner.nextInt();

                    Visit foundVisit =
                            searchVisitPatient.getVisitHistory()
                                    .searchVisit(searchVisitId);

                    if (foundVisit != null) {
                        System.out.println("\nVisit found:");
                        System.out.println("-------------------------");
                        foundVisit.displayVisit();
                    } else {
                        System.out.println("Visit not found.");
                    }
                    break;

                case 13:
                    System.out.print("Enter Patient ID: ");
                    int removeVisitPatientId = scanner.nextInt();
                    scanner.nextLine();

                    Patient removeVisitPatient =
                            patientBST.search(removeVisitPatientId);

                    if (removeVisitPatient == null) {
                        System.out.println("Patient not found.");
                        break;
                    }

                    System.out.print("Enter Visit ID to remove: ");
                    int removeVisitId = scanner.nextInt();

                    removeVisitPatient.getVisitHistory()
                            .removeVisit(removeVisitId);
                    break;

                case 14:
                    System.out.print("Enter Patient ID: ");
                    int displayVisitPatientId = scanner.nextInt();

                    Patient displayVisitPatient =
                            patientBST.search(displayVisitPatientId);

                    if (displayVisitPatient == null) {
                        System.out.println("Patient not found.");
                        break;
                    }

                    displayVisitPatient.getVisitHistory()
                            .displayHistory();
                    break;

                // ================= EXIT =================

                case 0:
                    System.out.println("\nExiting system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}