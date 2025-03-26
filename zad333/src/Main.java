public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.addgrade(5);
        student1.addgrade(3.5);
        student1.addgrade(2.5);
        System.out.println(student1.srednia());

        studentgroup grupa1 = new studentgroup();
        grupa1.addtogroup("s1");
        grupa1.addtogroup("s2");
        grupa1.addtogroup("s3");
        System.out.println(grupa1.sklad);
    }
}
