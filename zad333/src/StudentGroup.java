import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
        public String name;
        public List<Double> grades;

        public StudentGroup(String name) {
            this.name = name;
            this.grades = new ArrayList<>();
        }
    }

