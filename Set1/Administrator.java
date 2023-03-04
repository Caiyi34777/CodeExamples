import java.util.List;
import java.util.ArrayList;

public class Administrator {
    private List<Student> studentList;
    private List<Assignment> assignmentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    // fast retrieval
    public Grade getGrade(Student student, Assignment assignment) {
        return assignment.getGrade(student);
    }
}