package com.interview.concepts.oops.encapsulation;

public class Person {
    // Private fields (attributes) encapsulated within the class
    private String name;
    private int age;
    
    

    // Constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to access the name attribute
    public String getName() {
        return name;
    }

    // Setter method to modify the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to access the age attribute
    public int getAge() {
        return age;
    }

    // Setter method to modify the age attribute
    public void setAge(int age) {
        if (age >= 0) { // Check for a valid age
            this.age = age;
        } else {
            System.out.println("Invalid age value. Age must be >= 0.");
        }
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John", 30);

        // Access and modify the attributes using getter and setter methods
        System.out.println("Initial Information:");
        person.displayInfo();

        // Modify the attributes using setter methods
        person.setName("Alice");
        person.setAge(25);

        System.out.println("\nUpdated Information:");
        person.displayInfo();
    }
}

