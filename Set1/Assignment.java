import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Assignment {
    private Map<Student, Grade> map;

    public Grade getGrade(Student student) {
        return map.get(student);
    }
}