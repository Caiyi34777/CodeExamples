import java.util.List;
import java.util.ArrayList;

public class Student {
    private String matric; // unique id
    private List<Assignment> assignmentList;

    String getMatric() {
        return matric;
    }

    Grade getGrade(Assignment assignment) {
        return assignment.getGrade(this);
    }

}