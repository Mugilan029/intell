package com.example.mainprobackend.projectservice;

import com.example.mainprobackend.projectentity.courseentity;

import com.example.mainprobackend.projectentity.courseregisterentity;
import com.example.mainprobackend.projectrepository.courserepo;
import com.example.mainprobackend.projectrepository.prorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class proservice {



    @Autowired
    prorepo prorepo;


    @Autowired
    courserepo courserepo;

    public List<courseentity> getalldata() {
        return prorepo.findAll();

    }

    public List<courseregisterentity> getallcourse() {

        return courserepo.findAll();
    }

    public void add_data(String name, String emailid, String coursename) {

        courseregisterentity courseregisterentity=new courseregisterentity(name,emailid,coursename);
        courserepo.save(courseregisterentity);

    }
}
