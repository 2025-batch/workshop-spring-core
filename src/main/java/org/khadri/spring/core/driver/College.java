package org.khadri.spring.core.driver;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class College {

    private static List<Student> list = new ArrayList<>();

    public void registerStudent(Student student) {
        list.add(student);
        student.display();
    }

    public void showRegisteredStudents() {

        System.out.println("Registered Students List:");

        list.stream().forEach(student -> student.display());
    }
}