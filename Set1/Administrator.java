import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Administrator {
    private List<Student> studentList;
    private List<Assignment> assignmentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    // fast retrieval method
    public Grade getGrade(Student student, Assignment assignment) {
        return assignment.getGrade(student);
    }

    // fast retrieval method
    public List<Student> getStudentsAtLeastOneGrade(Grade grade) {
        Set<Student> set = new HashSet<>();
        for (Assignment assignment : assignmentList) {
            set.addAll(assignment.getStudentsWithGrade(grade));
        }

        List<Student> result = new ArrayList<>(set);
        return result;
    }
    
}