package com.evs.votermicro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evs.votermicro.model.Voter;
import com.evs.votermicro.repository.VoterRepository;

@Service
public class RegisterUser {

    @Autowired
    private VoterRepository repo;

    public Voter saveVoter(Voter voter){
        return repo.save(voter);
    }

    public Voter findById(Long id){
        return repo.findById(id).get();
    }

    public List<Voter> findAll(){
        return repo.findAll();
    }

}
