package hospital;

public class Main {

        public static void main(String[] args) {

                TreatmentStack treatmentStack = new TreatmentStack();

                TreatmentRecord treatment1 = new TreatmentRecord(
                                201,
                                "Amal Perera",
                                "Medication",
                                "Dr. Silva");

                TreatmentRecord treatment2 = new TreatmentRecord(
                                202,
                                "Kamal Silva",
                                "Emergency Surgery",
                                "Dr. Fernando");

                TreatmentRecord treatment3 = new TreatmentRecord(
                                203,
                                "Nimal Fernando",
                                "Fracture Treatment",
                                "Dr. Perera");

                System.out.println("Adding completed treatments:");
                System.out.println("----------------------------");

                treatmentStack.push(treatment1);
                treatmentStack.push(treatment2);
                treatmentStack.push(treatment3);

                System.out.println();

                treatmentStack.displayStack();

                System.out.println("\nPop operation:");
                System.out.println("--------------");

                TreatmentRecord removedRecord = treatmentStack.pop();

                if (removedRecord != null) {
                        System.out.println("Most recently completed treatment:");
                        removedRecord.displayTreatment();
                }

                System.out.println("\nStack after pop:");
                System.out.println("----------------");

                treatmentStack.displayStack();

                System.out.println("\nRemoving remaining treatment records:");
                System.out.println("-------------------------------------");

                treatmentStack.pop();
                treatmentStack.pop();

                System.out.println("\nTrying to pop from an empty stack:");
                System.out.println("----------------------------------");

                treatmentStack.pop();
        }
}