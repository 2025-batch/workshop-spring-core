package org.khadri.spring.core.driver;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

import org.khadri.spring.core.app.RegisterCollegeApp;
import org.khadri.spring.core.beans.College;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverCollege {
        private static List<String> listOfOperations = Arrays.asList("REGISTER", "EXIT");
    public static void main(String[] args) {

        RegisterCollegeApp app= new RegisterCollegeApp();
        app.registerStudent();
    }
}