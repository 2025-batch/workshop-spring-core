package org.khadri.spring.core.app;

import java.util.List;
import java.util.Scanner;
import org.khadri.spring.core.driver.College;
import org.khadri.spring.core.driver.Student;
import org.springframework.context.ApplicationContext;

public class RegisterCollegeApp {

    public void registerStudent(Scanner sc, College college, List<String> listOfOperations, ApplicationContext context) {

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
    }
}
