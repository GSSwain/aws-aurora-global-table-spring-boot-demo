package com.gsswain.auroraglobaltabledemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SomeController {

    @Autowired
    SomeService someService;

    @PostMapping
    public SomeModel create(@RequestBody SomeModel someModel)   {
        return this.someService.save(someModel);
    }

    @GetMapping("/{id}")
    public SomeModel find(@PathVariable String id)   {
        return this.someService.findById(id);
    }
}