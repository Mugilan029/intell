package com.example.mainprobackend.projectcontroller;

import com.example.mainprobackend.projectentity.courseentity;

import com.example.mainprobackend.projectentity.courseregisterentity;
import com.example.mainprobackend.projectservice.proservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class procontroller {



    @Autowired
    proservice proservice;


    @GetMapping("students/coursedata")
    public List<courseentity>  getalldata(){
        return proservice.getalldata();
    }

    @GetMapping("students/registeralldata")
    public List<courseregisterentity> getallcourse(){
        return proservice.getallcourse();
    }


    @PostMapping("students/registerdata")

    public String adddata(@RequestParam("name") String name, @RequestParam("emailid") String emailid , @RequestParam("coursename") String coursename){
       proservice.add_data(name,emailid,coursename);

       return   "YOUR COURSE SUCCESSFULLY REGISTER ";
    }

}
