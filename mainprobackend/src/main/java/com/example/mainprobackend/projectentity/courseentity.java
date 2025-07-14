package com.example.mainprobackend.projectentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "proentity")
public class courseentity {

    @Id
    private  int courseID;
    private  String  coursename;

    private  String  durationweek;
    private   String trainer;



}
