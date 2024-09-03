package de.speer.challenge2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

//@Data
@AllArgsConstructor
@Builder
@Value
public class Class {
    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> listOfStudents;
}
