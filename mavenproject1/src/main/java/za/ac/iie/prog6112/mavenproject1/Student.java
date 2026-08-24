
/**
 * This class represents a Student with a unique student number and name.
 */
public class Student {

    // Private final fields to resolve immutability warnings
    private final String studentNumber;
    private final String studentName;

    /**
     * Constructor to initialize student details.
     *
     * @param studentNumber The unique student identification number.
     * @param studentName The full name of the student.
     */
    public Student(String studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    /**
     * Final getter for student number to prevent method overriding in
     * subclasses.
     *
     * @return String student number
     */
    public final String getStudentNumber() {
        return studentNumber;
    }

    /**
     * Getter for student name.
     *
     * @return String student name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Displays basic student details.
     */
    public void displayDetails() {
        System.out.println("STUDENT NUMBER: " + studentNumber);
        System.out.println("STUDENT NAME: " + studentName);
    }
}
