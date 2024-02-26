package aula11.ex2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gradebook {
    private Map<String, Student> students;

    public Gradebook() {
        students = new HashMap<>();
    }

    public void load(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        for (String line : lines) {
            String[] parts = line.split("\\|");
            String name = parts[0];
            List<Double> grades = new ArrayList<>();
            for (int i = 1; i < parts.length; i++) {
                grades.add(Double.parseDouble(parts[i]));
            }
            Student student = new Student(name, grades);
            students.put(name, student);
        }
    }

    public void addStudent(Student student) {
        students.put(student.getName(), student);
        System.out.println("Student " + student.getName() + " added.");
    }

    public void removeStudent(String name) {
        students.remove(name);
        System.out.println("Student " + name + " removed.");
    }

    public Student getStudent(String name) {
        return students.get(name);
    }

    public double calculateAverageGrade(String name) {
        Student student = students.get(name);
        if (student != null) {
            List<Double> grades = student.getGrades();
            double sum = 0.0;
            for (Double grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        } else {
            System.out.println("Student not found.");
        }
        return 0;
    }

    public void printAllStudents() {
        for (Student student : students.values()) {
            System.out.println("Name: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
        }
    }
}
