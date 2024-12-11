package com.deber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.deber.model.doctor;
import com.deber.service.DoctorService;

public class DoctorController {

	@Autowired
    private DoctorService doctorService;

	@PostMapping("/")
    public doctor createDoctor(@RequestBody doctor doctor) {
        return doctorService.createDoctor(doctor);
    }
}
