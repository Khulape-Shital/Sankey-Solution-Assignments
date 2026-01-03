#   Student Attendance System (Java)

##   Overview
The  Student Attendance System  is a Java console-based application that manages student records and attendance efficiently using core Data Structures such as Queue, Stack, HashMap, HashSet, and LinkedList.

This project demonstrates practical usage of Java collections and is suitable for DSA learning, mini-projects, and exams.

---

##  Data Structures Used

- HashMap → Stores student records (`StudentID → StudentName`)
- Queue (LinkedList) → Maintains order of attendance (FIFO)
- HashSet → Fast lookup to check if a student is already marked present
- Stack → Keeps attendance history for undo operations
- ArrayList → Used for display purposes

---

##  Functionalities

###  `addStudent()`
- Creates a student record.
- If the Student ID already exists, a new record is not created.
- If the ID is new, the student is successfully added.

---

###  `showRecords()`
- Displays all student records.
- If no records exist, nothing is shown.

---

###  `markAttendance()`
- Marks attendance using HashSet to prevent duplicates.
- Stores attendance order using a Queue.
- Saves history using a Stack for undo functionality.
- Ensures only registered students can be marked present.

---

###  `undoAttendance()`
- Used when a student arrives late or attendance was marked by mistake.
- Removes the last marked student from attendance using Stack (LIFO).
- Updates Queue and HashSet accordingly.

---

###  `displayAttendance()`
- Displays all present students.
- Shows attendance in the order of arrival.
- If no students are present, a message is shown.

---

##  How to Run

1. Compile the program:
   javac CallAttendence.java
   RUN:
   java CallAttendence