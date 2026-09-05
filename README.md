# Mini Hospital Emergency Management System

## Project Overview

This project is a console-based Mini Hospital Emergency Management System developed using Java.

The system simulates the management of patients arriving at a hospital emergency unit. It demonstrates the use of different data structures to manage patient records, emergency patients, treatment history, and previous patient visits.

## Data Structures Used

- Binary Search Tree (BST) - Patient Records
- Queue - Emergency Patient Management
- Stack - Treatment History
- Singly Linked List - Patient Visit History

## Main Features

- Register and manage patient records
- Search patients using Patient ID
- Delete patient records
- Display patients in ascending Patient ID order
- Manage emergency patients using FIFO queue
- Serve emergency patients in the order they arrive
- Store completed treatments using LIFO stack
- Remove the most recently completed treatment
- Manage individual patient visit histories
- Add, remove, search, and display previous visits
- Interactive console menu for system operations

## Technologies

- Java
- Visual Studio Code
- Git
- GitHub

## Project Structure


MiniHospitalEmergencyManagementSystem/
|
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
|
└── README.md