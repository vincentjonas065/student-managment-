
/**
 * RunApplication.java
 */
public class RunApplication {

    public static void main(String[] args) {
        // Provided test values from specification table
        String studentNumber = "ST10503108";
        String studentName = "VINCENT JONAS";
        int[] practicalMarks = {50, 51, 56, 77};

        // Instantiate ProgrammingStudent object using sample values
        ProgrammingStudent student = new ProgrammingStudent(studentNumber, studentName, practicalMarks);

        // Display complete progress report
        student.displayDetails();
    }
}
