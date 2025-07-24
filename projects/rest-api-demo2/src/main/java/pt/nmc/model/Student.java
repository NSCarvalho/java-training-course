package pt.nmc.model;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@ToString
@Getter
@Setter
@Builder
public class Student {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate enrolledOn;

}
