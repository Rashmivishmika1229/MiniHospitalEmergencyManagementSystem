## Project Structure

    MiniHospitalEmergencyManagementSystem/
    │
    ├── src/
    │   └── hospital/
    │       ├── Main.java
    │       ├── Patient.java
    │       ├── PatientNode.java
    │       ├── PatientBST.java
    │       ├── PatientQueueNode.java
    │       ├── EmergencyQueue.java
    │       ├── TreatmentRecord.java
    │       ├── TreatmentStackNode.java
    │       ├── TreatmentStack.java
    │       ├── Visit.java
    │       ├── VisitNode.java
    │       └── VisitHistory.java
    │
    └── README.md

## How to Run

1. Open the project folder in Visual Studio Code.
2. Open the terminal.
3. Compile the Java files:

       javac -d out src/hospital/*.java

4. Run the program:

       java -cp out hospital.Main

## System Operations

### Patient Records - Binary Search Tree

- Add a new patient
- Search for a patient using Patient ID
- Delete a patient using Patient ID
- Display patients in ascending Patient ID order

### Emergency Patient Queue - Queue

- Add patients to the emergency queue
- Serve patients in FIFO order
- Display patients currently waiting
- Handle an empty queue

### Treatment History - Stack

- Add completed treatment records
- Remove the most recently completed treatment
- Display treatment history
- Handle an empty stack

### Patient Visit History - Singly Linked List

- Add a patient visit
- Search for a visit using Visit ID
- Remove a visit using Visit ID
- Display previous visits

## Testing

The system was tested for:

- Patient insertion
- Patient searching
- Patient deletion
- BST traversal
- Emergency queue FIFO operation
- Treatment stack LIFO operation
- Patient visit addition
- Patient visit searching
- Patient visit removal
- Patient visit display
- Empty queue handling
- Empty stack handling