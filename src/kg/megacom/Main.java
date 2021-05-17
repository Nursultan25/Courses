package kg.megacom;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student harryPotter = new Student("Harry Potter", "+996555555555", true);
        Student hermione = new Student("Hermione", "+9965559844566", false);
        Student ronWisley = new Student("Ron Wisley", "+996555753495", false);

        Course course = new Course();
        course.name = "Poisons";

        course.studentsCount(15);
        course.addStudent(harryPotter);
        course.addStudent(hermione);
        course.addStudent(ronWisley);

        System.out.println(Arrays.toString(course.students));
    }
}

//There is a lot of ways known to do it wrong and which one is right is not clear.