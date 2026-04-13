import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void viewStudents() {
        for (Student s : students) {
            s.display();
        }
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.id == id);
    }
}