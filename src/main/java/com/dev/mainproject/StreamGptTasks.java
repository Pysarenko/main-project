package com.dev.mainproject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGptTasks {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = Arrays.asList("Anna", "John", "Anna", "Paul", "John", "Alice");
        List<Integer> numbersWithRepeates = Arrays.asList(1, 10, 20, 30, 20, 40, 50, 50, 30);

        System.out.println(filteringEven(numbers));
        System.out.println(square(numbers));
        System.out.println(uniqueElements(names));

        System.out.println(maxLimit3(numbersWithRepeates));

        List<Person> people = Arrays.asList(
                new Person("Anna", 34, "Kyiv"),
                new Person("John", 40, "Lviv"),
                new Person("Paul", 29, "Kyiv"),
                new Person("Mary", 50, "Odesa"),
                new Person("Mike", 45, "Lviv")
        );

        System.out.println(groupByName(people));

        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Smartphone", "Electronics", 800.0),
                new Product("TV", "Electronics", 90.0),
                new Product("Fridge", "Appliances", 300.0),
                new Product("Microwave", "Appliances", 150.0)
        );

        System.out.println(filterByCategoryAndPrice(products));

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developer", 6000),
                new Employee("Bob", "Developer", 4500),
                new Employee("Charlie", "Manager", 7000),
                new Employee("Dave", "Developer", 5500),
                new Employee("Eve", "Manager", 3000)
        );

        System.out.println(filterEmployees(employees));
    }

    public static List<Integer> filteringEven(List<Integer> list) {
        return list.stream().filter(e -> e%2==0).collect(Collectors.toList());
    }

    public static List<Integer> square(List<Integer> list) {
        return list.stream().map(e -> e*e).toList();
    }

    public static <T> List<T> uniqueElements(List<T> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static Map<String, Long> groupByName(List<Person> list) {
        return list.stream().collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
    }

    //Returns unmodifiable list
    public static List<Integer> maxLimit3(List<Integer> list) {
        return list.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).toList();
    }

    //Returns modifiable list
    public static List<String> filterByCategoryAndPrice(List<Product> products) {
        return products.stream().filter(e -> e.getCategory().equalsIgnoreCase("Electronics") && e.getPrice()>100)
                .sorted(Comparator.comparingDouble(Product::getPrice)).map(Product::getName).collect(Collectors.toList());
    }

    public static Map<String, List<String>> filterEmployees(List<Employee> list) {
        return list.stream().filter(e -> e.getSalary() > 5000)
                .collect(Collectors.groupingBy(
                        Employee::getJobTitle, Collectors.mapping(Employee::getName, Collectors.toList())));
    }
}

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }
}