package com.example.mainprobackend.projectentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity
public class courseregisterentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   int id;

    private  String name;
    private String emailid;
    private String coursename;

    public courseregisterentity(String name,String emailid,String coursename) {
        this.name = name;
        this.emailid=emailid;
        this.coursename=coursename;
    }
}
