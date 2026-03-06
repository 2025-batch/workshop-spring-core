package org.khadri.spring.core.driver;

import java.util.Scanner;
import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverCollege {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        College college = context.getBean("college", College.class);

        boolean decision = true;

        do {

            System.out.println("Please select operation type: " + Arrays.asList("REGISTER", "EXIT"));

            String operationType = sc.next();

            switch (operationType) {

                case "REGISTER": {

                    System.out.println("REGISTER Operation Starts");

                    System.out.println("Enter Student ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Student Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter Branch (CSE/IT/EEE/ECE):");
                    String branch = sc.nextLine();

                    Student student = new Student();
                    student.setId(id);
                    student.setName(name);
                    student.setBranch(branch);

                    college.registerStudent(student);

                    System.out.println("REGISTER Operation Ends");
                    break;
                }

                case "EXIT": {
                    decision = false;
                    System.out.println("Exiting Application...");
                    break;
                }

                default: {
                    System.out.println("Invalid Operation!");
                }
            }

        } while (decision);

        sc.close();
    }
}