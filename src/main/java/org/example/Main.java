package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("isTeen: " + person.isTeen());

        Person second = new Person("ali", "veli", 18, 20000, true, new String[]{"piano", "chess"});
        System.out.println("hobbies: " + Arrays.toString(second.getHobbies()));*/
        Wall wall = new Wall(4, 5);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}
