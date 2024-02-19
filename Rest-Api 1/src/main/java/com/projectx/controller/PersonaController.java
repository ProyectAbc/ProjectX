package com.projectx.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
@Getter
@Setter
@RefreshScope
public class PersonaController {

    @Value("${app.testApi}")
    private String testApi;

    @GetMapping("test-api")
    public String getTestApi(){
        return this.testApi;
    }
    @GetMapping("/hello")
    public String TestHello(){
        return "Hola que tal";
    }

}
