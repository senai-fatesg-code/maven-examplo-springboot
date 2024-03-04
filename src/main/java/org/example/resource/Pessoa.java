package org.example.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/pessoa")
public class Pessoa {


    @GetMapping
    public String listarPessoa(){
        return "FAculdade senai fatesg";
    }

}
