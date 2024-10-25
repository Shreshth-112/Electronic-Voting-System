package com.evs.votermicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.evs.votermicro.model.Voter;
import com.evs.votermicro.service.RegisterUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/voterservice")
public class VoterController {

    @Autowired
    private RegisterUser service;

    @GetMapping
    public String getString() {
        return "OK:200";
    }

    @GetMapping("/{id}")
    public Voter getMethodName(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping("/savemydetails")
    public Voter saveMyDetailsVoter(@RequestBody Voter voter) {
        return service.saveVoter(voter);
    }

}
