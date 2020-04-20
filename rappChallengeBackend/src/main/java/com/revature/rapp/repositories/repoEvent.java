package com.revature.rapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.rapp.model.eventModel;



@Repository
public interface repoEvent extends JpaRepository<eventModel, Integer>{

}
