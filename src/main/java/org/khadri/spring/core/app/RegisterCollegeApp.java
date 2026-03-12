package org.khadri.spring.core.app;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.khadri.spring.core.beans.College;
import org.khadri.spring.core.beans.Student;
import org.khadri.spring.core.util.SpringContextUtil;
import org.springframework.context.ApplicationContext;

public class RegisterCollegeApp {
    private static List<String> listOfOperations = Arrays.asList("REGISTER", "EXIT");
    public void registerStudent() {
        Scanner sc = new Scanner(System.in);
        ApplicationContext context = SpringContextUtil.getContext();

        College college = context.getBean(College.class);

        boolean decision = true;

        do {

            System.out.println("Please select operation type: " + listOfOperations);

            String operationType = sc.next();

            switch (operationType) {

                case "REGISTER": {

                    System.out.println(operationType + " Operation Starts");

                    System.out.println("Enter Student ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Student Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter Branch (CSE/IT/EEE/ECE):");
                    String branch = sc.nextLine();

                    Student student = context.getBean(Student.class);
                    student.setId(id);
                    student.setName(name);
                    student.setBranch(branch);

                    college.registerStudent(student);

                    System.out.println(operationType + " Operation Ends");
                    break;
                }

                case "EXIT": {
                    decision = false;
                    System.out.println(operationType + " Operation Selected....");
                    break;
                }

                default: {
                    System.out.println("Invalid Operation!");
                    System.out.println("Please select valid operation from: " + listOfOperations);
                }
            }

        } while (decision);

        sc.close();
    }
}