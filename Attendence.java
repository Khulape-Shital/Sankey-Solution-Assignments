import java.util.*;

public class Attendence {

    private HashMap<String, String> studentRecords;
    private Queue<String> attendenceOrder;
    private HashSet<String> presentStudents;
    private Stack<String> attendenceHistory;

    public Attendence() {
        studentRecords = new HashMap<>();
        attendenceOrder = 
        new LinkedList<>();
        presentStudents = new HashSet<>();
        attendenceHistory = new Stack<>();
    }

    public void addStudents(String id, String name) {
        if (studentRecords.containsKey(id)) {
            System.out.println("Student already exist");
            return;
        }
        studentRecords.put(id, name);
        System.out.println("Student Added Successfully");

    }

    public void showRecords() {
        if (studentRecords.isEmpty()) {
    System.out.println("No students added yet!");
    return;
}
        for (String num : studentRecords.keySet()) {
            System.out.println(num + " : " + studentRecords.get(num));
        }
    }

    public void markAttendence(String id) {
        if (!studentRecords.containsKey(id)) {
            System.out.println("Student not Found");
            return;
        }
        if (presentStudents.contains(id)) {
            System.out.println("Attendence already marked");
            return;
        }
        attendenceOrder.offer(id);
        presentStudents.add(id);
        attendenceHistory.push(id);
        System.out.println("Student Attendence marked Successfully");

    }

    public void unmarkAttendence() {
        if (attendenceHistory.isEmpty()) {
            System.out.println("Nothing to unmark");
            return;
        }
        String lateCommer = attendenceHistory.pop();
        presentStudents.remove(lateCommer);
        attendenceOrder.remove(lateCommer);
        System.out.println("unmark Attendence Successfully : " + studentRecords.get(lateCommer));
    }

    public void displayAttendance() {
        if (attendenceOrder.isEmpty()) {
            System.out.println("No Student Present!");
            return;
        }
        for (String rollId : attendenceOrder) {
            System.out.println(rollId + ":" + studentRecords.get(rollId));
        }

    }
}