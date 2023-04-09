package com.br.feedz.employees.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String department;
    @Column(nullable = false)
    private String role;
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "id_job")
    private Job job_description;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String race;
    @Column(nullable = false)
    private String manager;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private LocalDate birth_at;
    @Column(nullable = false)
    private LocalDate admission_at;
    @Column(nullable = false)
    private int status;
    @Column(nullable = false)
    private String situation;
    @Column(nullable = false)
    private int welcome_email;
    @Column(nullable = false)
    private int automatic_celebration;
}
