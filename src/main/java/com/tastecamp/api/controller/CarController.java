package com.tastecamp.api.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.CarDto;

@RestController
@RequestMapping("/api/car")

public class CarController {
    
    @PostMapping

    public void create(@RequestBody CarDto req){
        System.out.println(req.modelo() + " à vista por R$" + req.valor());
    }
}
