package de.speer.challenge2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Student {
    private String name;
    private String id;
    private String address;
    private double grade;


}
