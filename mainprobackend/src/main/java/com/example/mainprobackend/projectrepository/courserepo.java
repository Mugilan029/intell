package com.example.mainprobackend.projectrepository;

import com.example.mainprobackend.projectentity.courseregisterentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courserepo  extends JpaRepository<courseregisterentity,Integer> {
}
