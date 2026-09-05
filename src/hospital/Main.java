package hospital;

public class Main {

        public static void main(String[] args) {

                EmergencyQueue emergencyQueue = new EmergencyQueue();

                Patient patient1 = new Patient(
                                201, "Amal Perera", 30, "0771111111", "Fever");

                Patient patient2 = new Patient(
                                202, "Kamal Silva", 45, "0772222222", "Chest Pain");

                Patient patient3 = new Patient(
                                203, "Nimal Fernando", 55, "0773333333", "Fracture");

                System.out.println("Adding patients to emergency queue:");
                System.out.println("------------------------------------");

                emergencyQueue.enqueue(patient1);
                emergencyQueue.enqueue(patient2);
                emergencyQueue.enqueue(patient3);

                System.out.println();

                emergencyQueue.displayQueue();

                System.out.println("\nDequeue operation:");
                System.out.println("------------------");

                Patient treatedPatient = emergencyQueue.dequeue();

                if (treatedPatient != null) {
                        System.out.println("Patient removed for treatment:");
                        treatedPatient.displayPatient();
                }

                System.out.println("\nQueue after dequeue:");
                System.out.println("--------------------");

                emergencyQueue.displayQueue();

                System.out.println("\nRemoving remaining patients:");
                System.out.println("----------------------------");

                emergencyQueue.dequeue();
                emergencyQueue.dequeue();

                System.out.println("\nTrying to dequeue from an empty queue:");
                System.out.println("---------------------------------------");

                emergencyQueue.dequeue();
        }
}