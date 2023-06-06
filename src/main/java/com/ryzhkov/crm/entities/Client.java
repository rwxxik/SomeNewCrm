package com.ryzhkov.crm.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Date dateOfBirth;
    private Date firstContactDate;
    private int phoneNumber;
    private String telegram;
    private String email;
    private String source;
    private String notes;
    private Set<Project> projects;
    private Set<Task> tasks;
    private User user;
}
