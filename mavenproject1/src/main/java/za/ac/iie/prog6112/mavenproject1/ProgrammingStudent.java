
import java.util.Arrays;

/**
 * ProgrammingStudent.java
 */
public class ProgrammingStudent extends Student {

    // Private final array reference field to resolve compiler hint
    private final int[] practicalMarks;

    /**
     * Constructor receiving student details and practical marks. Uses super to
     * initialize superclass fields.
     *
     * @param studentNumber Student ID number
     * @param studentName Student full name
     * @param practicalMarks One-dimensional integer array of marks
     */
    public ProgrammingStudent(String studentNumber, String studentName, int[] practicalMarks) {
        // Call superclass constructor
        super(studentNumber, studentName);
        // Copy array to protect internal field integrity
        this.practicalMarks = Arrays.copyOf(practicalMarks, practicalMarks.length);
    }

    /**
     * Sorts the practical marks in ascending order using bubble sort algorithm.
     */
    public void sortMarksAscending() {
        int n = practicalMarks.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (practicalMarks[j] > practicalMarks[j + 1]) {
                    // Swap adjacent elements if they are in wrong order
                    int temp = practicalMarks[j];
                    practicalMarks[j] = practicalMarks[j + 1];
                    practicalMarks[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Calculates the average mark from the practical marks array
     *
     * @return Double representing average mark
     */
    public double calculateAverageMark() {
        if (practicalMarks.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int mark : practicalMarks) {
            sum += mark;
        }
        return (double) sum / practicalMarks.length;
    }

    /**
     * Overrides the displayDetails method to include sorted practical marks and
     * average mark.
     *
     */
    @Override
    public void displayDetails() {
        // First sort the practical marks using bubble sort
        sortMarksAscending();

        // Print header
        System.out.println("PROGRAMMING STUDENT PROGRESS REPORT");

        // Call superclass displayDetails() to show number and name
        super.displayDetails();

        // Display sorted marks
        System.out.print("SORTED PRACTICAL MARKS: ");
        for (int i = 0; i < practicalMarks.length; i++) {
            System.out.print(practicalMarks[i] + (i == practicalMarks.length - 1 ? "" : " "));
        }
        System.out.println();

        // Display average practical mark
        System.out.println("AVERAGE PRACTICAL MARK: " + calculateAverageMark());
    }
}
