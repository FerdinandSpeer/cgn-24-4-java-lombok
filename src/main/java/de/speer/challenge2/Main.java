package de.speer.challenge2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student hans = Student.builder()
                .id("A1")
                .address("Berlin")
                .name("Hans Dampf")
                .grade(2.5)
                .build();

        Student wurst = Student.builder()
                .id("A2")
                .address("Berlin")
                .name("Wurst Backe")
                .grade(4.5)
                .build();

        Teacher berthold = Teacher.builder()
                .id("A3")
                .name("Berthold Druffi")
                .subject("Meta physics")
                .build();

        Class klasse1 = Class.builder()
                .id("2C")
                .listOfStudents(List.of(hans, wurst))
                .teacher(berthold)
                .build();

        System.out.println(klasse1);
        System.out.println(berthold);
        System.out.println(List.of(hans, wurst));
    }

}
