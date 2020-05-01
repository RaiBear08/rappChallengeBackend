package com.revature.rapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.rapp.model.EventModel;



@Repository
public interface RepoEvent extends JpaRepository<EventModel, Integer>{

}
