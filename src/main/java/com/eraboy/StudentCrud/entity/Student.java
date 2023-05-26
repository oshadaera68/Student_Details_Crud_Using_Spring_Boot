package com.eraboy.StudentCrud.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    private String name;
    private String address;
    private String telNo;

    @OneToMany(mappedBy = "student")
    private List<Diploma> diploma;
}
