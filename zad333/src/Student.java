import java.util.ArrayList;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    String indexNumber;
    String email;
    String address;
    List<Double> grades = new ArrayList<>();

    public double calculateAverage() {
        if (grades.isEmpty()) {
            throw new RuntimeException("Student nie ma ocen.");
        }

        double total = 0;
        for (double grade : grades) {
            total += grade;
        }

        double average = total / grades.size();
        return Math.round(average * 2) / 2.0;
    }

    public void addGrade(double grade) {
        if (grades.size() >= 20) {
            throw new RuntimeException("Maksymalna liczba ocen to 20.");
        }
        grades.add(grade);
    }
}
