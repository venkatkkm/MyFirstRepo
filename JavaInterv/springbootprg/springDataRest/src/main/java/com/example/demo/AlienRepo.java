package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Alien;

@RepositoryRestResource(CollectionResourceRel="aliens",path="aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
