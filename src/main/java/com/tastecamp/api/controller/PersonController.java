package com.tastecamp.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.PersonDto;

@RestController
@RequestMapping("/api/person")

public class PersonController {

    @PostMapping
    public void create(@RequestBody PersonDto req) {
        System.out.println(req.name());

    }
    
}
