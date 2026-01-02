import java.util.Scanner;

public class CallAttendence {

    public static void main(String args[]) {

        Attendence student = new Attendence();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n------ Select Option ------");
            System.out.println("1 : Add Student To Record");
            System.out.println("2 : Mark Student Attendance");
            System.out.println("3 : Show Attendance");
            System.out.println("4 : Undo Last Attendance");
            System.out.println("5 : Show Student Records");
            System.out.println("6 : Exit Attendance");
            System.out.print("Choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    student.addStudents(id, name);
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    student.markAttendence(sc.nextLine());
                    break;

                case 3:
                    student.displayAttendance();
                    break;

                case 4:
                    student.unmarkAttendence();
                    break;

                case 5:
                    student.showRecords();
                    break;

                case 6:
                    System.out.println("Exit Successfully!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}