import java.util.ArrayList;
import java.util.List;
public class Student {
        public String name;
        public String fname;
        public String lname;
        public String indexnumber;
        public String email;
        public String address;
        public List<Double> grades;


        public Student(String fname, String lname, String indexnumber, String email, String address, List<Double> grades) {
            this.fname = fname;
            this.lname = lname;
            this.indexnumber = indexnumber;
            this.email = email;
            this.address = address;
            this.grades = new ArrayList<>();
        }
    }

