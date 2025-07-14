package com.example.mainprobackend.projectrepository;

import com.example.mainprobackend.projectentity.courseentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface prorepo  extends JpaRepository<courseentity,Integer> {
}
