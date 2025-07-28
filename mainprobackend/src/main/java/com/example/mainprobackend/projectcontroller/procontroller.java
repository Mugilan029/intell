package com.example.mainprobackend.projectcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mainprobackend.projectentity.courseentity;
import com.example.mainprobackend.projectentity.courseregisterentity;
import com.example.mainprobackend.projectservice.proservice;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class procontroller {


//gfbhhsbsbhsbs
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
