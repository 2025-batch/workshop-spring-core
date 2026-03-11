package org.khadri.spring.core.driver;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

import org.khadri.spring.core.app.RegisterCollegeApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverCollege {
        private static List<String> listOfOperations = Arrays.asList("REGISTER", "EXIT");
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        College college = context.getBean("college", College.class);
        RegisterCollegeApp app= new RegisterCollegeApp();
        app.registerStudent(sc,college,listOfOperations,context);
        sc.close();
    }
}