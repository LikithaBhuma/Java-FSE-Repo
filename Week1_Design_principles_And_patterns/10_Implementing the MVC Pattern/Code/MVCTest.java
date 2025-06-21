package MVCPattern;

public class MVCTest {
    public static void main(String[] args) {
        // Creating model
        Student student = new Student("S530", "Likitha", "A");

        // Creating view
        StudentView view = new StudentView();

        // Creating controller
        StudentController controller = new StudentController(student, view);

        // Initializing view
        controller.updateView();

        // Updating data through controller
        controller.setStudentName("Likitha Bhuma");
        controller.setStudentGrade("A+");

        // View after update
        controller.updateView();
    }
}
