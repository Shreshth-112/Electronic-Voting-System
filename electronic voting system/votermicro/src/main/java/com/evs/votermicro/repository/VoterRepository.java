package com.evs.votermicro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evs.votermicro.model.Voter;

@Repository
public interface VoterRepository extends JpaRepository<Voter, Long> {

}
