package com.manoj.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(
                new Employee("Manoj", "Kumar", 5000.00, List.of("project 1", "project 2"))
        );
        employees.add(
                new Employee("Shabbir", "Khan", 12000.00, List.of("project 3", "project 4"))
        );
        employees.add(
                new Employee("Sam", "minz", 4500.90, List.of("Project 5 ", "project 7"))
        );
    }

    public static void main(String[] args) {
        // Creating stream from the collection using object.stream()
        Stream<Employee> stream = employees.stream();

        //1. stream.forEach()
        //stream.forEach(employee -> System.out.println(employee.getFirstName()));

        //2. Map
        //3. Collect
        List<Employee> incrementSalary = stream.map(employee -> new Employee(
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSalary() * 1.10,
                employee.getProjects()
        )).collect(Collectors.toList());
        System.out.println(incrementSalary);

        //4. Filter
        List<Employee> filterEmployee =  incrementSalary
                .stream()
                .filter(employee -> employee.getSalary() > 5000.0)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                )).collect(Collectors.toList());
        System.out.println(employees);

        //4. findFirst
        Employee findFirstEmployee =  incrementSalary
                .stream()
                .filter(employee -> employee.getSalary() > 5000.0)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                ))
                .findFirst()
                .orElse(null);
        System.out.println(findFirstEmployee);

        // flatMap();
        String projects = employees
                .stream()
                .map(employee -> employee.getProjects())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.joining(","));
        System.out.println(projects);

        // Short Circuit
        List<Employee> shortCircuit = employees
                .stream()
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());
        System.out.println(shortCircuit);

        // Converting to Finite Data
        Stream.generate(Math::random)
                .limit(5)
                .forEach(value->System.out.println(value));

        // Sorting
        // sorted(comparator(o1, 02))
        List<Employee> sortedEmployee = employees.stream()
                .sorted((o1, o2) -> o1.getFirstName()
                        .compareToIgnoreCase(o2.getFirstName()))
                .collect(Collectors.toList());
        System.out.println(sortedEmployee);

        // reduce - accumulate all the data
        Double totalsal = employees
                .stream()
                .map(employee -> employee.getSalary())
                .reduce(0.0, Double::sum); // initial value with binary operator
        System.out.println(totalsal);
    }
}
